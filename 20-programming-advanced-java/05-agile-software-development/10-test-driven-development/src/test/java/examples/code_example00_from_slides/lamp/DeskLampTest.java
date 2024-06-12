package examples.code_example00_from_slides.lamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DeskLampTest {

    @Test
    void givenDeskLampIsTurnedOff_whenToggleLamp_thenDeskLampIsTurnedOn() {
        // Given
        DeskLamp deskLamp = new DeskLamp(false);

        // When
        deskLamp.toggleLamp();

        // Then
        Assertions.assertTrue(deskLamp.isOn());
    }

    @Test
    void givenDeskLampIsTurnedOn_whenToggleLamp_thenDeskLampIsTurnedOff() {
        // Given
        DeskLamp deskLamp = new DeskLamp(true);

        // When
        deskLamp.toggleLamp();

        // Then
        Assertions.assertFalse(deskLamp.isOn());
    }

}
