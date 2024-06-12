package basic.codelab03;

public class SolarSystemApp {
    public static void main(String[] args) {
        SolarSystem solarSystem = new SolarSystem();
        solarSystem.addToPlanetList("Pluton");
        solarSystem.addToPlanetList("Mars");
        solarSystem.addToPlanetList("Jupiter");
        solarSystem.addToPlanetList("Saturne");
        solarSystem.addToPlanetList("Uranus");
        solarSystem.printPlanetList();
        solarSystem.insertIntoPlanetList(3,"Neptune");
        solarSystem.printPlanetList();
        solarSystem.removeFromPlanetList("Saturne");
        solarSystem.printPlanetList();
        solarSystem.replaceInPlanetList("Mars","Terre");
        solarSystem.printPlanetList();
        solarSystem.swapInPlanetList(3,4);
        solarSystem.printPlanetList();
        solarSystem.reverseInPlanetList();
        solarSystem.printPlanetList();

    }
}
