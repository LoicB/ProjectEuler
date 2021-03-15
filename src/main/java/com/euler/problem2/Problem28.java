package com.euler.problem2;

public class Problem28 {
    public static void main(String[] args) {
        Problem28 problem28 = new Problem28();
        Long time1 = System.currentTimeMillis();
        int sumDiagonals = problem28.spiralDiagonalSum(1001);
        Long time2 = System.currentTimeMillis();
        System.out.println("  " + (time2 - time1) + "ms");
        System.out.println("The solution is " + sumDiagonals);
    }

    protected int spiralDiagonalSum(int squareSize) {
        int sizeDiagonal = (squareSize - 1) / 2;
        return (3 + 2 * sizeDiagonal * (8 * (int) Math.pow(sizeDiagonal, 2) + 15 * sizeDiagonal + 13)) / 3;
    }
}
