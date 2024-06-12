package basic.codelab02;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

public class PersonTest {

//    @DisplayName("Vampire bites Human")
//    @Test
//    void givenVampireAndHumanWhenVampireBitesHumanThenHumanTransformsIntoVampire() {
//        Person entity1 = new Person("Human");
//        Person entity2 = new Person("Vampire");
//        entity2.bite(entity1);
//        Assertions.assertThat(entity1.getState()).isEqualTo("Vampire");
//    }

    @DisplayName("Vampire bites Human at 2AM")
    @Test
    void givenVampireAndHumanWhenVampireBitesHumanAt2AMThenHumanTransformsIntoVampire() {
        Person entity1 = new Person("Human");
        Person entity2 = new Person("Vampire");
        LocalTime time = LocalTime.of(2, 0);
        entity2.bite(entity1, time);
        Assertions.assertThat(entity1.getState()).isEqualTo("Vampire");
    }

    @DisplayName("Vampire bites Human at 10PM")
    @Test
    void givenVampireAndHumanWhenVampireBitesHumanAt10PMThenHumanDoesNotTransformIntoVampire() {
        Person entity1 = new Person("Human");
        Person entity2 = new Person("Vampire");
        LocalTime time = LocalTime.of(22, 0);
        entity2.bite(entity1, time);
        Assertions.assertThat(entity1.getState()).isEqualTo("Human");
    }

    @DisplayName("Vampire bites Human at Midnight")
    @Test
    void givenVampireAndHumanWhenVampireBitesHumanAt12AMThenHumanTransformsIntoVampire() {
        Person entity1 = new Person("Human");
        Person entity2 = new Person("Vampire");
        LocalTime time = LocalTime.of(0, 0);
        entity2.bite(entity1, time);
        Assertions.assertThat(entity1.getState()).isEqualTo("Vampire");
    }

    @Test
    void givenTwoHumans_whenOneBitesTheOther_thenNothingHappen() {
        Person p1 = new Person("Human");
        Person p2 = new Person("Human");

        p1.bite(p2, LocalTime.now());

        Assertions.assertThat(p2.getState()).isEqualTo("Human");
    }
}
