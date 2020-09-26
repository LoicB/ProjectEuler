package com.euler.problem;

public class Problem3 {

    public long largestPrimeFactor(long number) {
        long squareRoot = (long) Math.sqrt(number);
        long quotient = 2;
        long remainder = number % quotient;
        while (remainder != 0 && ++quotient < squareRoot) {
            remainder = number % quotient;
        }
        long largestprime;
        if (remainder == 0 && number != quotient) {
            largestprime = largestPrimeFactor(number / quotient);
        } else {
            largestprime = number;
        }
        return largestprime;
    }
}
