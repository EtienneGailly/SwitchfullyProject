package code_example02;

import org.junit.jupiter.api.Test;

class HerderTest {

    @Test
    void name() {
        Herder herder = new Herder(new Sheep[]{new Sheep(), new Sheep(), new WolfInSheepsClothing(), new BlackSheep()});
        herder.letSheepsEat();
    }
}