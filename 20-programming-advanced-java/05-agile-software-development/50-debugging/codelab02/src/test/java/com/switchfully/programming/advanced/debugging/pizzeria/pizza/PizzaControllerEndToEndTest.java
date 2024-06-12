package com.switchfully.programming.advanced.debugging.pizzeria.pizza;

import com.switchfully.programming.advanced.debugging.pizzeria.MyTestConfiguration;
import com.switchfully.programming.advanced.debugging.pizzeria.Clock;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.context.annotation.Import;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.web.client.RestTemplate;
import reactor.core.publisher.Mono;

import java.util.Arrays;

import static com.switchfully.programming.advanced.debugging.pizzeria.pizza.AdditionalToppings.noAdditionalToppings;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

@Import(MyTestConfiguration.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
class PizzaControllerEndToEndTest {

    @LocalServerPort
    private int port;

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private PizzaRepository pizzaRepository;
    @Autowired
    private Clock clock;

    @AfterEach
    void tearDown() {
        clock.reset();
    }

    @Test
    void givenPizzaInSystem_whenGettingAllPizzas_thenThisPizzaIsPresent() {
        //GIVEN
        clock.freeze();
        pizzaRepository.save(new Pizza(PizzaType.CAPRICCIOSA, "Gertje", "please no mushrooms", clock.getCurrentTime()));

        //WHEN
        ResponseEntity<PizzaDTO[]> entity = restTemplate.getForEntity("http://localhost:" + port + "/pizzas", PizzaDTO[].class);

        //THEN
        assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(entity.getBody()).isNotNull();
        assertThat(entity.getBody()).isNotEmpty();
        assertThat(Arrays.asList(entity.getBody())).contains(new PizzaDTO("capricciosa", "Gertje", "please no mushrooms", 30L, false, new AdditionalToppingsDto(noAdditionalToppings())));
    }

    @Test
    void givenPizzaInSystem_whenGettingAllPizzas_thenThisPizzaIsPresent_restassured() {
        //GIVEN
        clock.freeze();
        pizzaRepository.save(new Pizza(PizzaType.CAPRICCIOSA, "Gertje", "please no mushrooms", clock.getCurrentTime()));

        //WHEN
        PizzaDTO[] result = given()
                .baseUri("http://localhost")
                .port(port)
                .when()
                .get("/pizzas")
                .then()
                .assertThat()
                .statusCode(HttpStatus.OK.value())
                .extract()
                .as(PizzaDTO[].class);

        //THEN
        assertThat(result)
                .isNotNull()
                .isNotEmpty();
        assertThat(Arrays.asList(result)).contains(new PizzaDTO("capricciosa", "Gertje", "please no mushrooms", 30L, false, new AdditionalToppingsDto(noAdditionalToppings())));
    }

    @Test
    void givenPizzaInSystem_whenGettingAllPizzas_thenThisPizzaIsPresent_webTestClient() {
        //GIVEN
        WebTestClient testClient = WebTestClient.bindToServer().baseUrl("http://localhost:" + port).build();
        //WHEN
        WebTestClient.ResponseSpec response = testClient.get().uri("/pizzas")
                .accept(MediaType.APPLICATION_JSON)
                .exchange();

        //THEN
        response.expectStatus().isOk() // sorry, no tea pot
                .expectHeader().contentType(MediaType.APPLICATION_JSON)
                .expectBodyList(PizzaDTO.class).hasSize(1); //of course it would be better to validate the specific elements that were returned
    }

    @Test
    void givenPizzaInSystem_whenAddingPizza_thenOneMoreIsPresent_webTestClient() {
        //GIVEN
        WebTestClient testClient = WebTestClient.bindToServer().baseUrl("http://localhost:" + port).build();
        PizzaDTO tim = new PizzaDTO("capricciosa", "Gertje", "please no mushrooms", 0L, false, null);
        //WHEN
        WebTestClient.ResponseSpec response = testClient.post().uri("/pizzas")
                .contentType(MediaType.APPLICATION_JSON)
                .body(Mono.just(tim), PizzaDTO.class)
                .exchange();

        //THEN
        response.expectStatus().isOk(); // sorry, no tea pot
        assertThat(pizzaRepository.findAll()).contains(pizzaRepository.getPizzaByCustomer("Gertje"));
    }

    private static final AddToppingsDto TOPPINGS_TO_ADD = new AddToppingsDto(true, false, true, false, true, false);

    @Test
    void givenPizzaInSystem_whenAddingAdditionalToppings_thenAdditionalToppingsArePresent_restAssured() {
        //GIVEN
        WebTestClient testClient = WebTestClient.bindToServer().baseUrl("http://localhost:" + port).build();

        //WHEN
        testClient.put()
                .uri("/pizzas/1")
                .contentType(MediaType.APPLICATION_JSON)
                .body(Mono.just(TOPPINGS_TO_ADD), AddToppingsDto.class)
                .exchange();

        //THEN
        WebTestClient.ResponseSpec response = testClient.get().uri("/pizzas/1")
                .accept(MediaType.APPLICATION_JSON)
                .exchange();

        PizzaDTO actual = response.expectStatus()
                .isOk()
                .expectHeader().contentType(MediaType.APPLICATION_JSON)
                .expectBody(PizzaDTO.class)
                .returnResult().getResponseBody();

        Assertions.assertThat(actual.getAdditionalToppingsDto())
                .contains(new AdditionalToppingsDto(true, false, true, false, true, false));

    }


}
