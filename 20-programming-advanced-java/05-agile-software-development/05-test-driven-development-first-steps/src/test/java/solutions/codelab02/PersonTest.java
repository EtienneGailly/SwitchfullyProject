package solutions.codelab02;

import basic.solutions.codelab02.Person;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static basic.solutions.codelab02.Person.createHuman;
import static basic.solutions.codelab02.Person.createVampire;
import static org.assertj.core.api.Assertions.assertThat;

class PersonTest {

    @Test
    void whenCreatingAHuman_thenIsVampireReturnsFalse() {
        Person human = createHuman();

        assertThat(human.isVampire()).isFalse();
    }

    @Test
    void whenCreatingAVampire_thenIsVampireReturnsTrue() {
        Person human = createVampire();

        assertThat(human.isVampire()).isTrue();
    }

    @Test
    void givenAHumanAndAVampireAt1AM_whenVampireBitesHuman_ThenHumanBecomesAVampire() {
        Person human = createHuman();
        Person vampire = createVampire();

        vampire.bites(human, LocalTime.of(1,0));

        assertThat(human.isVampire()).isTrue();
    }

    @Test
    void givenTime7PM_whenVampireBitesHuman_thenHumanStillIsHuman() {
        Person human = createHuman();
        Person vampire = createVampire();

        vampire.bites(human, LocalTime.of(7,0));

        assertThat(human.isVampire()).isFalse();
    }

    @Test
    void givenTimeMidnight_whenVampireBitesHuman_thenHumanStillIsHuman() {
        Person human = createHuman();
        Person vampire = createVampire();

        vampire.bites(human, LocalTime.of(0,0));

        assertThat(human.isVampire()).isFalse();
    }
}
