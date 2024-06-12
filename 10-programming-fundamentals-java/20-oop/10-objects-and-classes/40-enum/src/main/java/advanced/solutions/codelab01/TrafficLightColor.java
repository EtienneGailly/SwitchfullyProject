package advanced.solutions.codelab01;

public enum TrafficLightColor {
    RED("Red"),
    RNG("Orange"),
    GRN("Green");

    private final String label;

    TrafficLightColor(String label) {
        this.label = label;
    }

    public boolean canChangeTo(TrafficLightColor color) {
        return switch (this) {
            case RED -> color != RNG;
            case RNG -> true;
            case GRN -> color != RED;
        };
    }

    public static String allColorsAsString() {
        String allColors = "";
        for (TrafficLightColor color : values()) {
            allColors += color.label + ", ";
        }
        allColors = allColors.substring(0, allColors.length() - ", ".length());
        return allColors;
    }
}
