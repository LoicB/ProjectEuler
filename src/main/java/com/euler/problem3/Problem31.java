package com.euler.problem3;

public class Problem31 {

    private final static int[] COINS = {1, 2, 5, 10, 20, 50, 100, 200};

    public static void main(String[] args) {
        Problem31 problem31 = new Problem31();
        Long time1 = System.currentTimeMillis();
        int ways = problem31.coinSums(200);
        Long time2 = System.currentTimeMillis();
        System.out.println("  " + (time2 - time1) + "ms");
        System.out.println("The solution is " + ways);
    }

    protected int coinSums(int sum) {
        return coinSums(sum, 0);
    }


    private int coinSums(int sum, int index) {
        if (sum < 0) return 0;
        if (sum == 0) return 1;
        int total = 0;
        for (int i = index; i < COINS.length; i++) {
            int coin = COINS[i];
            if (coin <= sum) {
                int remainder = sum - coin;
                total += (coinSums(remainder, i));
            }
        }
        return total;
    }


}
