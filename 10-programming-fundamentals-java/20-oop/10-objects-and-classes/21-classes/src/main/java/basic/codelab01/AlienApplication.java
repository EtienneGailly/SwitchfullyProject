package basic.codelab01;

public class AlienApplication {
    public static void main(String[] args) {
        Alien zappyTheAlien = new Alien();
        System.out.println(zappyTheAlien);
        Alien blyubTheAlien = new Alien("Blyub", "Wilziax");
        Alien kujluTheAlien = new Alien("Kujlu", "Krak", 3);
        System.out.println(blyubTheAlien);
        System.out.println(kujluTheAlien);
        System.out.println(zappyTheAlien.getFullName());
        System.out.println(blyubTheAlien.getFullName());
        System.out.println(kujluTheAlien.getFullName());
        int theHeadsOfKujlu = kujluTheAlien.getNumberOfHeads();
        System.out.println("Alien Kujlu has " + theHeadsOfKujlu + " heads");

    }
}
