package com.euler.problem2;

import java.math.BigInteger;

public class Problem20 {
    public static void main(String[] args) {
        Problem20 problem20 = new Problem20();
        Long time1 = System.currentTimeMillis();
        int sundays = problem20.sumFactorialDigits(100);
        Long time2 = System.currentTimeMillis();
        System.out.println("  " + (time2 - time1) + "ms");
        System.out.println("The solution is " + sundays);
    }

    protected int sumFactorialDigits(int number) {
        BigInteger factorial = factorial(number);
        return sumDigits(factorial);
    }

    protected BigInteger factorial(int number) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = 2; i <= number; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }

    protected int sumDigits(BigInteger bigNumber) {
        BigInteger tmpNumber = bigNumber;
        int sum = 0;
        while (!tmpNumber.equals(BigInteger.ZERO)) {
            sum += tmpNumber.mod(BigInteger.TEN).intValue();
            tmpNumber = tmpNumber.divide(BigInteger.TEN);
        }
        return sum;
    }
}

