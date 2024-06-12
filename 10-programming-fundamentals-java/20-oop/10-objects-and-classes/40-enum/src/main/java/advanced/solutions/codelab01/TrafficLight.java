package advanced.solutions.codelab01;

public class TrafficLight {

    private TrafficLightStatus status;
    private TrafficLightColor color;

    public TrafficLight(TrafficLightStatus status, TrafficLightColor color) {
        this.status = status;
        this.color = color;
    }

    public void setStatus(TrafficLightStatus status) {
        this.status = status;
    }

    public void setColor(TrafficLightColor color) {
        if (!this.color.canChangeTo(color)) {
            System.out.println("Can not change the traffic light from " + this.color + " to " + color);
            return;
        }
        this.color = color;
    }

    public String allTraficLightColor() {
        String allColors = TrafficLightColor.allColorsAsString();
        return "The possible traffic light colors are: " + allColors + ".";
    }

}
