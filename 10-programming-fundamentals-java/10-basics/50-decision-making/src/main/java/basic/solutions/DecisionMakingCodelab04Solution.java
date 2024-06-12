package basic.solutions;

public class DecisionMakingCodelab04Solution {

    public static void main(String[] args) {
        System.out.println(playBlackjack(19, 22));
    }

    /**
     * Given 2 int values greater than 0,
     * return whichever value is nearest to 21 without going over.
     * Return 0 if they both go over.
     * blackjack(19, 21) → 21
     * blackjack(21, 19) → 21
     * blackjack(19, 22) → 19
     */
    public static int playBlackjack(int cardValue1, int cardValue2) {
        if (cardValue1 > 21 && cardValue2 > 21) {
            return 0;
        }
        if (cardValue1 > 21 || (cardValue2 <= 21 && 21 - cardValue2 < 21 - cardValue1)) {
            return cardValue2;
        }
        return cardValue1;
    }


}
