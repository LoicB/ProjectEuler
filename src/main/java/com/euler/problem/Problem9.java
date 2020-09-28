package com.euler.problem;

public class Problem9 {
    public static void main(String[] args) {
        Problem9 problem9 = new Problem9();
        System.out.println("The solution is " + problem9.specialPythagoreanTriplet(1000));
    }

    protected long specialPythagoreanTriplet(long number) {
        long tripletProduct = 0;
        for (long a = 1; a < number && tripletProduct == 0; a++) {
            for (long b = 1; a + b < number && tripletProduct == 0; b++) {
                long c = number - a - b;
                if (isPythagoreanTriplet(a, b, c)) {
                    tripletProduct = a * b * c;
                }
            }
        }
        return tripletProduct;
    }

    protected boolean isPythagoreanTriplet(long a, long b, long c) {
        return Math.pow(a, 2.0) + Math.pow(b, 2.0) == Math.pow(c, 2.0);
    }

}
