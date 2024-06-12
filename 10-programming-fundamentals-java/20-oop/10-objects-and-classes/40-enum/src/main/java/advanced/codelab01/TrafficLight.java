package advanced.codelab01;

public class TrafficLight {
    private TrafficLightStatus status;
    private TrafficLightColor color;

    public TrafficLight(TrafficLightStatus status, TrafficLightColor color) {
        this.status = status;
        this.color = color;
    }

    public static void main(String[] args) {
        TrafficLight light = new TrafficLight(TrafficLightStatus.DAMAGED, TrafficLightColor.GREEN);
        light.setColor(TrafficLightColor.ORANGE);
        System.out.println(light.allTrafficLightColors());
    }
    public void setStatus(TrafficLightStatus status) {
        this.status = status;
    }

    public void setColor(TrafficLightColor color) {
        if (this.color.maySwitch(color)) {
            this.color = color;
        }
    }

    public String allTrafficLightColors() {
        return ("The possible traffic light colors are: " + color.getAllColors() + ".");
    }
}
