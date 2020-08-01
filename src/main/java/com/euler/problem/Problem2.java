package com.euler.problem;

public class Problem2 {
    public int fiboEvenSum(int max) {
        int fib1 = 1;
        int fib2 = 2;
        int newFibValue = fib1 + fib2;
        int evenSum = 0;
        while (newFibValue < max) {
            evenSum += fib2 * ((fib2 + 1) % 2);
            newFibValue = fib1 + fib2;
            fib1 = fib2;
            fib2 = newFibValue;
        }
        return evenSum;
    }
}
