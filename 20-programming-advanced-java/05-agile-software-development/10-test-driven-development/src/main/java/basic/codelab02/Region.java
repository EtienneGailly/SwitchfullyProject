package basic.codelab02;

import javax.naming.SizeLimitExceededException;
import java.util.ArrayList;
import java.util.List;

public class Region {
    private List<Growable> growables;
    private Vegetation vegetation;

    public Region() {
        this(Vegetation.BroadLeaf);
    }

    public Region(Vegetation vegetation) {
        this.growables = new ArrayList<Growable>();
        this.vegetation = vegetation;
    }

    public void add(Growable growable) throws IllegalArgumentException {
        if(this.growables.size() >= 5)
            throw new IllegalArgumentException();

        growables.add(growable);
    }

    public List<Growable> getGrowables() {
        return growables;
    }

    public void advanceSeason() {
        for(Growable growable : growables) {
            for(int i = 0; i < this.vegetation.getLevel(); i++) {
                growable.nextState();
            }
        }
    }
}
