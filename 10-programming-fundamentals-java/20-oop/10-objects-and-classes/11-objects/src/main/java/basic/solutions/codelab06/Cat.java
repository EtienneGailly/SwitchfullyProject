package basic.solutions.codelab06;

/**
 * You don't have to change anything in this class.
 * Disclaimer 1: Yes, we like cats...
 * Disclaimer 2: No real cats were harmed in the making of this codelab)
 */
public class Cat {

    private final String name;
    private byte lifesLeft = 9;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean kill() {
        if(lifesLeft > 0) {
            lifesLeft -= 1;
            return true;
        } return false;
    }




}
