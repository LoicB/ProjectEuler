package com.euler.problem;

public class Problem7 {
    public static void main(String[] args) {
        Problem7 problem7 = new Problem7();
        System.out.println("The solution is " + problem7.nthPrime(10001));
    }

    protected long nthPrime(int n) {
        long[] primes = new long[n];
        int cpt = 0;
        long number = 2;

        while (cpt < n) {
            if (isNumberPrime(number, primes, cpt)) {
                primes[cpt] = number;
                cpt++;
            }
            number++;
        }
        return primes[n - 1];
    }

    private boolean isNumberPrime(long number, long[] knownPrimes, int numberOfKnownPrimes) {
        boolean isNumberPrime = true;
        for (int i = 0; i < numberOfKnownPrimes && isNumberPrime; i++) {
            isNumberPrime = number % knownPrimes[i] != 0;
        }
        return isNumberPrime;
    }
}
