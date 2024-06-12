package basic.solutions;

public class DecisionMakingCodelab02Solution {

    public static void main(String[] args) {
        System.out.println(playLottery(9, 1, 0));
    }

    /**
     * You have a lottery ticket, with ints a, b, and c on it.
     * This makes three pairs, which we'll call ab, bc, and ac.
     * Consider the sum of the numbers in each pair.
     * If any pair sums to exactly 10, the result is 10.
     * Otherwise if the ab sum is exactly 10 more than either bc or ac sums, the result is 5.
     * Otherwise the result is 0.
     * playLottery(9, 1, 0) → 10
     * playLottery(9, 2, 0) → 0
     * playLottery(18, 4, 4) → 0
     * playLottery(18, 4, 4) → 0
     * playLottery(18, 4, 8) → 5
     */
    public static int playLottery(int lotteryNumberA, int lotteryNumberB, int lotteryNumberC) {
        int ab = lotteryNumberA + lotteryNumberB;
        int bc = lotteryNumberB + lotteryNumberC;
        int ac = lotteryNumberA + lotteryNumberC;

        if (ab == 10 || bc == 10 || ac == 10) {
            return 10;
        }

        if (ab - bc == 10 || ab - ac == 10) {
            return 5;
        }
        return 0;
    }


}
