package presentationslides.classeschapter.enums.extrapower;

public enum TrafficLightColor {

    RED(120),
    ORANGE(10),
    GREEN(120);

    private int durationInSeconds;

    TrafficLightColor(int durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }

}
