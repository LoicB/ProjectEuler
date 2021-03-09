package com.euler.problem2;

import com.euler.tools.PrimeUtils;

public class Problem27 {
    public static void main(String[] args) {
        Problem27 problem27 = new Problem27();
        Long time1 = System.currentTimeMillis();
        int coefficientsProduct = problem27.quadraticPrimes(1000);
        Long time2 = System.currentTimeMillis();
        System.out.println("  " + (time2 - time1) + "ms");
        System.out.println("The solution is " + coefficientsProduct);
    }

    protected int quadraticPrimes(int limit) {
        int max = 0;
        int product = 0;
        for (int i = -1 * limit + 1; i < limit; i++) {
            for (int j = -1 * limit + 1; j < limit; j++) {
                int count = countPrimes(i, j);
                if (count > max) {
                    max = count;
                    product = i * j;
                }
            }
        }
        return product;
    }

    protected int countPrimes(int a, int b) {
        int count = 0;
        int n = 0;
        boolean prime = PrimeUtils.isPrime(applyFormula(a, b, n));
        while (prime) {
            count++;
            n++;
            prime = PrimeUtils.isPrime(applyFormula(a, b, n));
        }
        return count;

    }

    protected int applyFormula(int a, int b, int n) {
        return n * n + a * n + b;
    }
}
