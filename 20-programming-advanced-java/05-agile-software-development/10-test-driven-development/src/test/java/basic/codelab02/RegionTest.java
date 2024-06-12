package basic.codelab02;

import org.apache.tomcat.util.http.fileupload.impl.SizeException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

public class RegionTest {

    private Region region;

    @BeforeEach
    void setUp() {
        region = new Region();
    }

    @Test
    void givenARegion_whenAddingAGrowable_thenGrowableIsAdded(){
        Growable growable = new Growable();
        region.add(growable);

        Assertions.assertTrue(region.getGrowables().contains(growable));
    }

    @Test
    void givenARegion_whenListOfGrowablesIsSize5_ThenDontAddGrowable() {
        Growable growable = new Growable();
        for (int i = 0; i < 5; i++) {
            region.add(new Growable());
        }
        Assertions.assertThrows(IllegalArgumentException.class, () -> region.add(growable));
        Assertions.assertFalse(region.getGrowables().contains(growable));

    }

    @Test
    void givenGrowablesInARegion_whenAdvancingASeason_AllGrowablesGrowALevel() {
        Growable growable = new Growable(State.Seed);
        Growable growable2 = new Growable(State.Tree);
        region.add(growable);
        region.add(growable2);
        region.advanceSeason();
        Assertions.assertEquals(State.Sprout, region.getGrowables().get(0).getState());
        Assertions.assertEquals(State.Tree, region.getGrowables().get(1).getState());
    }

    @Test
    void givenRegionIsRainForrest_whenAdvancingASeason_AllGrowablesGrowTwoLevels() {
        region = new Region(Vegetation.RainForest);
        Growable growable = new Growable(State.Seed);
        Growable growable2 = new Growable(State.Sprout);
        Growable growable3 = new Growable(State.Plant);
        region.add(growable);
        region.add(growable2);
        region.add(growable3);
        region.advanceSeason();
        Assertions.assertEquals(State.Plant, region.getGrowables().get(0).getState());
        Assertions.assertEquals(State.Tree, region.getGrowables().get(1).getState());
        Assertions.assertEquals(State.Tree, region.getGrowables().get(2).getState());
    }

    @Test
    void givenRegionSteppe_whenAdvancingASeason_AllGrowablesDontGrow() {
        region = new Region(Vegetation.Steppe);
        Growable growable = new Growable(State.Seed);
        Growable growable2 = new Growable(State.Sprout);
        Growable growable3 = new Growable(State.Plant);
        region.add(growable);
        region.add(growable2);
        region.add(growable3);
        region.advanceSeason();
        Assertions.assertEquals(State.Seed, region.getGrowables().get(0).getState());
        Assertions.assertEquals(State.Sprout, region.getGrowables().get(1).getState());
        Assertions.assertEquals(State.Plant, region.getGrowables().get(2).getState());
    }
}
