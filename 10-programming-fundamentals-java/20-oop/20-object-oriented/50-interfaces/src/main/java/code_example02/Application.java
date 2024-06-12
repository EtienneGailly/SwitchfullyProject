package code_example02;

import code_example02.modus.NormalDrivingModus;
import code_example02.modus.SportDrivingModus;

public class Application {

    public static void main(String[] args) {
        System.out.println("A car that's driving in normal modus:");
        Car audiA4 = new Car("Audi A4", new NormalDrivingModus());
        System.out.println(String.format("\t%s", audiA4));

        System.out.println("Let's switch to sport modus:");

        audiA4.setDrivingModus(new SportDrivingModus());
        System.out.println(String.format("\t%s", audiA4));
    }

}
