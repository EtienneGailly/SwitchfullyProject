package basic.codelab02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GrowableTest {

    @Test
    void givenGrowable_whenSeedGrows_thenGrowableIsSprout(){
        Growable growable = new Growable(State.Seed);
        growable.nextState();
        Assertions.assertEquals(growable.getState(), State.Sprout);
    }

    @Test
    void givenGrowable_whenSproutGrows_thenGrowableIsPlant(){
        Growable growable = new Growable(State.Sprout);
        growable.nextState();
        Assertions.assertEquals(growable.getState(), State.Plant);
    }

    @Test
    void givenGrowable_whenPlantGrows_thenGrowableIsTree(){
        Growable growable = new Growable(State.Plant);
        growable.nextState();
        Assertions.assertEquals(growable.getState(), State.Tree);
    }

    @Test
    void givenGrowable_whenTreeGrows_thenGrowableIsTree(){
        Growable growable = new Growable(State.Tree);
        growable.nextState();
        Assertions.assertEquals(growable.getState(), State.Tree);
    }
}
