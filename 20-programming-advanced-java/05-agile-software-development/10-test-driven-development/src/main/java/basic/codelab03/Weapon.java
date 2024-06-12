package basic.codelab03;

public enum Weapon {
    BAREFISTS, SWORD, AXE, SPEAR;

    public double getDamage() {
        return switch (this) {
            case BAREFISTS -> 1;
            case SWORD -> 2;
            case AXE -> 3;
            case SPEAR -> 3.5;
        };
    }
}
