package com.euler.problem1;

public class Problem17 {
    private static final int HUNDRED_LENGTH = 7;
    private static final int HUNDRED_AND_LENGTH = 10;
    private final int[] numberBelowTenLengths = new int[]{0, 3, 3, 5, 4, 4, 3, 5, 5, 4};
    private final int[] numberBelowTwentyLengths = new int[]{3, 6, 6, 8, 8, 7, 7, 9, 8, 8};
    private final int[] numberTensLengths = new int[]{6, 6, 5, 5, 5, 7, 6, 6};

    public static void main(String[] args) {
        Problem17 problem17 = new Problem17();
        Long time1 = System.currentTimeMillis();
        int letterCount = problem17.numberLetterCounts(1000);
        Long time2 = System.currentTimeMillis();
        System.out.println("  " + (time2 - time1) + "ms");
        System.out.println("The solution is " + letterCount);
    }

    public int numberLetterCounts(int limit) {
        int count = 0;
        for (int i = 1; i <= limit; i++) {
            count += numberToNumberLetterCounts(i);
        }
        return count;
    }

    protected int numberToNumberLetterCounts(int number) {
        int count;
        if (number < 10) {
            count = numberBelowTenLengths[number];
        } else if (number < 20) {
            count = numberBelowTwentyLengths[number - 10];
        } else if (number < 100) {
            count = numberTensLengths[number / 10 - 2] + numberToNumberLetterCounts(number % 10);
        } else if (number < 1000) {
            if (number % 100 == 0) {
                count = numberToNumberLetterCounts(number / 100) + HUNDRED_LENGTH;
            } else {
                count = numberToNumberLetterCounts(number / 100) + HUNDRED_AND_LENGTH + numberToNumberLetterCounts(number % 100);
            }
        } else {
            count = 11;
        }
        return count;
    }

}
