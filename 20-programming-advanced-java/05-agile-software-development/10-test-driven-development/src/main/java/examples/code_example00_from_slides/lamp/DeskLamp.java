package examples.code_example00_from_slides.lamp;

public class DeskLamp {

    private boolean isLightOn;
    private boolean isSwitchOn;

    public DeskLamp(boolean isOn) {

        isLightOn = isOn;
        isSwitchOn = isOn;
    }

    public void toggleLamp() {
        isLightOn = !isLightOn;
        isSwitchOn = !isSwitchOn;
    }

    public boolean isOn() {
        return isLightOn && isSwitchOn;
    }
}
