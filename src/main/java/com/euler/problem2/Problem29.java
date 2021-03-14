package com.euler.problem2;

import java.util.HashSet;
import java.util.Set;

public class Problem29 {
    public static void main(String[] args) {
        Problem29 problem29 = new Problem29();
        Long time1 = System.currentTimeMillis();
        int powers = problem29.distinctPowers(100);
        Long time2 = System.currentTimeMillis();
        System.out.println("  " + (time2 - time1) + "ms");
        System.out.println("The solution is " + powers);
    }

    protected int distinctPowers(int limit) {
        Set<Double> powers = new HashSet<>();
        for (int a = 2; a <= limit; a++) {
            for (int b = 2; b <= limit; b++) {
                powers.add(Math.pow(a, b));
            }
        }
        return powers.size();
    }
}
