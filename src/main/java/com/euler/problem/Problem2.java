package com.euler.problem;

public class Problem2 {
    public int fiboEvenSum(int max) {
        int fib1 = 0;
        int fib2 = 2;
        int newFibValue = 4 * fib2 + fib1;
        int evenSum = 0;
        while (newFibValue < max) {
            evenSum += fib2;
            newFibValue = 4 * fib2 + fib1;
            fib1 = fib2;
            fib2 = newFibValue;
        }
        return evenSum;
    }
}
