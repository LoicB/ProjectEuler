package com.euler.tools;


public class PrimeUtils {
    public static boolean isPrime(int number) {
        int squareRoot = (int) Math.sqrt(number);
        int div = 2;
        boolean prime = number > 1;
        while (prime && div <= squareRoot) {
            prime = (number % div != 0);
            div++;
        }
        return prime;
    }
}
