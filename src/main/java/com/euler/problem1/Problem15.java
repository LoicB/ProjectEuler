package com.euler.problem1;

import java.math.BigInteger;

public class Problem15 {
    public static void main(String[] args) {
        Problem15 problem15 = new Problem15();
        System.out.println("The solution is " + problem15.latticePaths(20));
    }

    public BigInteger latticePaths(int gridSize) {
        return binomial(2 * gridSize, gridSize);
    }

    protected BigInteger binomial(int nb1, int nb2) {
        return factorial(nb1).divide(factorial(nb2).multiply(factorial(nb1 - nb2)));
    }

    protected BigInteger factorial(int number) {
        if (number == 0 || number == 1) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(number).multiply(factorial(number - 1));
    }
}
