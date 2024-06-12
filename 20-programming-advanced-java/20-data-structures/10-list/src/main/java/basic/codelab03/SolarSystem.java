package basic.codelab03;

import java.util.ArrayList;
import java.util.Collections;

public class SolarSystem {
    private ArrayList<String> planetList = new ArrayList<>();

    public void addToPlanetList(String planet) {
        planetList.add(planet);
    }

    public void insertIntoPlanetList(int index, String planet) {
        planetList.add(index, planet);
    }

    public void removeFromPlanetList(String planet) {
        planetList.remove(planet);
    }

    public void replaceInPlanetList(String oldPlanet, String newPlanet) {
        planetList.set(planetList.indexOf(oldPlanet), newPlanet);
    }

    public void swapInPlanetList(int index1, int int2) {
        String planet1 = planetList.get(index1);
        planetList.set(index1, planetList.get(int2));
        planetList.set(int2, planet1);
    }

    public void reverseInPlanetList() {
        Collections.reverse(planetList);
    }

    public void printPlanetList() {
        for (String planet : planetList) {
            System.out.print(planet +", " );
        }
        System.out.println();
    }
}
