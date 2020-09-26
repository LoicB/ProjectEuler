package com.euler.problem;

public class Problem5 {
    public static void main(String[] args) {
        Problem5 problem5 = new Problem5();
        System.out.println("The solution is " + problem5.smallestMultiple(20));
    }

    public int smallestMultiple(int max) {
        int smallestMultiple = 1;
        int[] divisors = generateDivisors(2, max);
        for (int i = 0; i < divisors.length; i++) {
            smallestMultiple *= divisors[i];
            applyMultipleToFutureNumber(i, divisors);
        }
        return smallestMultiple;
    }

    protected int[] generateDivisors(int from, int to) {
        int range = to - from + 1;
        int[] divisors = new int[range];
        for (int i = 0; i < range; i++) {
            divisors[i] = i + from;
        }
        return divisors;
    }

    protected void applyMultipleToFutureNumber(int index, int[] divisors) {
        int divisor = divisors[index];
        for (int i = index + 1; i < divisors.length; i++) {
            if (divisors[i] % divisor == 0) {
                divisors[i] /= divisor;
            }
        }
    }

}
