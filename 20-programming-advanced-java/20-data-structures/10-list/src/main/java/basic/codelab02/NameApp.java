package basic.codelab02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NameApp {
    public static void main(String[] args) {
        List<String> funnyNames = NameGenerator.generateFunnyNames();
        for (String name : funnyNames) {
            System.out.println(name);
        }
        List<String> normalNames = NameGenerator.generateNormalNames();
        System.out.println(normalNames.getFirst());
        List<String> seriousNames = NameGenerator.generateSeriousNames();
        System.out.println(seriousNames.subList(seriousNames.size() - 3, seriousNames.size()));

    }
}
