package basic.codelab02;

public enum Vegetation {
    BroadLeaf, RainForest, Steppe;

    public int getLevel() {
        return switch(this) {
            case BroadLeaf -> 1;
            case RainForest -> 2;
            case Steppe -> 0;
        };
    }
}
