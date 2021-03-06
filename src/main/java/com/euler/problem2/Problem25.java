package com.euler.problem2;

import java.math.BigInteger;

public class Problem25 {
    public static void main(String[] args) {
        Problem25 problem25 = new Problem25();
        Long time1 = System.currentTimeMillis();
        int index = problem25.indexDigitFibonacci(1000);
        Long time2 = System.currentTimeMillis();
        System.out.println("  " + (time2 - time1) + "ms");
        System.out.println("The solution is " + index);
    }

    protected int indexDigitFibonacci(int numberOfDigits) {
        BigInteger limit = BigInteger.TEN.pow(numberOfDigits - 1);
        BigInteger fibA = BigInteger.ONE;
        BigInteger fibB = BigInteger.ONE;
        BigInteger fibC = fibA.add(fibB);
        int index = 3;
        while (fibC.compareTo(limit) < 0) {
            index++;
            fibA = fibB;
            fibB = fibC;
            fibC = fibA.add(fibB);
        }
        return index;
    }
}
