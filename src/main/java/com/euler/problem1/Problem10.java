package com.euler.problem1;

import java.util.Arrays;

public class Problem10 {
    public static void main(String[] args) {
        Problem10 problem10 = new Problem10();
        System.out.println("The solution is " + problem10.primeSummation(2000000));
    }

    protected long primeSummation(int endNumber) {
        boolean[] primes = new boolean[endNumber + 1];
        Arrays.fill(primes, Boolean.TRUE);
        primes[0] = false;
        primes[1] = false;

        long sum = 0;
        for (int i = 0; i < endNumber; i++) {
            if (primes[i]) {
                sum += i;
                for (int j = i; j < endNumber; j += i) {
                    primes[j] = false;
                }
            }
        }
        return sum;
    }
}
