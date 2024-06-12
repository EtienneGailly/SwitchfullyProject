package advanced.codelab01;

public enum TrafficLightColor {
    RED("Red"),
    ORANGE("Orange"),
    GREEN("Green");

    TrafficLightColor(String label) {
        this.label = label;
    }

    private final String label;

    public boolean maySwitch(TrafficLightColor color) {
        if (this == TrafficLightColor.GREEN && color == TrafficLightColor.RED) {
            System.out.println("Impossible to switch from GREEN to RED");
            return false;
        }
        if (this == TrafficLightColor.RED && color == TrafficLightColor.ORANGE) {
            System.out.println("Impossible to switch from GREEN to RED");
            return false;
        }
        return true;
    }

    public String getAllColors() {
        String allColors = "";
        for (TrafficLightColor color : values()) {
            allColors += color.label + ", ";
        }
        allColors = allColors.substring(0, allColors.length() - ", ".length());
        return allColors;
    }
}
