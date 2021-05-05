package com.euler.problem3;

import java.util.ArrayList;
import java.util.List;

public class Problem30 {

    public static void main(String[] args) {
        Problem30 problem30 = new Problem30();
        Long time1 = System.currentTimeMillis();
        int sum = problem30.digitPowers(5);
        Long time2 = System.currentTimeMillis();
        System.out.println("  " + (time2 - time1) + "ms");
        System.out.println("The solution is " + sum);
    }

    protected int digitPowers(int nthPowers) {
        int sum = 0;
        for (int i = 2; i < (int) Math.pow(10, nthPowers + 1); i++) {
            if (sumOfDigitsPowers(i, nthPowers) == i) {
                sum += i;
            }
        }

        return sum; // 248860
    }

    protected int sumOfDigitsPowers(int number, int nthPowers) {
        return numberToDigits(number).stream().mapToInt(integer -> (int) Math.pow(integer, nthPowers)).sum();
    }

    protected List<Integer> numberToDigits(int number) {
        List<Integer> digits = new ArrayList<>();
        int quotient = number;
        while (quotient > 0) {
            digits.add(0, quotient % 10);
            quotient /= 10;
        }
        return digits;
    }
}
