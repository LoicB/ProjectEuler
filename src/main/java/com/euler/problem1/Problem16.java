package com.euler.problem1;

import java.math.BigInteger;

public class Problem16 {
    public static void main(String[] args) {
        Problem16 problem16 = new Problem16();
        System.out.println("The solution is " + problem16.powerDigitSum(1000));
    }

    public long powerDigitSum(int exponent) {
        BigInteger power = BigInteger.valueOf(2).pow(exponent);
        System.out.println(power.toString());
        int sum = 0;
        while (!power.equals(BigInteger.ZERO)) {
            sum += power.mod(BigInteger.TEN).intValue();
            power = power.divide(BigInteger.TEN);
            System.out.println(power);
        }
        return sum;
    }
}

