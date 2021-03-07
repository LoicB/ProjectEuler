package com.euler.problem2;

import java.util.HashSet;
import java.util.Set;

public class Problem26 {
    public static void main(String[] args) {
        Problem26 problem26 = new Problem26();
        Long time1 = System.currentTimeMillis();
        int cycle = problem26.longestRecurringCycle(1000);
        Long time2 = System.currentTimeMillis();
        System.out.println("  " + (time2 - time1) + "ms");
        System.out.println("The solution is " + cycle);
    }

    protected int longestRecurringCycle(int limit) {
        int max = 0;
        int maxIndex = 0;
        for (int i = 2; i < limit; i++) {
            int cycle = findRecurringCycle(i);
            if (cycle > max) {
                max = cycle;
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    protected int findRecurringCycle(int number) {
        Set<Integer> rests = new HashSet<>();
        int a = 10;
        int r = a % number;
        boolean cycle = false;
        while (r != 0 && !cycle) {
            a = 10 * r;
            r = a % number;
            cycle = !rests.add(r);
        }
        return cycle ? rests.size() : 0;
    }
}
