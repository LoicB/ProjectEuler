package com.euler.problem2;

import java.util.ArrayList;
import java.util.List;

public class Problem23 {
    public static void main(String[] args) {
        Problem23 problem23 = new Problem23();
        Long time1 = System.currentTimeMillis();
        int sumOfNonAbundant = problem23.sumOfNonAbundantNumbers(28123);
        Long time2 = System.currentTimeMillis();
        System.out.println("  " + (time2 - time1) + "ms");
        System.out.println("The solution is " + sumOfNonAbundant);
    }

    protected int sumOfNonAbundantNumbers(int limit) {
        List<Integer> abundantNumbers = createAbundantNumbersList(limit);
        boolean[] isSUmsOfAbundant = createIsNumberAbundant(abundantNumbers, limit);
        return calculateSumOfNonAbundantNumbers(isSUmsOfAbundant);
    }

    private int calculateSumOfNonAbundantNumbers(boolean[] isSUmsOfAbundant) {
        int sum = 0;
        for (int i = 0; i < isSUmsOfAbundant.length; i++) {
            if (!isSUmsOfAbundant[i]) {
                sum += i;
            }
        }
        return sum;
    }

    private boolean[] createIsNumberAbundant(List<Integer> abundantNumbers, int limit) {
        boolean[] isSUmsOfAbundant = new boolean[limit + 1];
        for (int i = 0; i < abundantNumbers.size(); i++) {
            for (int j = i; j < abundantNumbers.size(); j++) {
                if (abundantNumbers.get(i) + abundantNumbers.get(j) < isSUmsOfAbundant.length) {
                    isSUmsOfAbundant[abundantNumbers.get(i) + abundantNumbers.get(j)] = true;
                }
            }
        }
        return isSUmsOfAbundant;
    }

    protected List<Integer> createAbundantNumbersList(int topNumber) {
        int[] sums = getSumOfDivisors(topNumber);
        return extractAbundantNumbersFromSumOfDivisors(sums);
    }

    private int[] getSumOfDivisors(int topNumber) {
        int[] sums = new int[topNumber + 1];
        for (int i = 1; i < sums.length; i++) {
            for (int j = 2 * i; j < sums.length; j += i) {
                sums[j] += i;
            }
        }
        return sums;
    }

    private List<Integer> extractAbundantNumbersFromSumOfDivisors(int[] sumOfDivisors) {
        List<Integer> abundantNumbers = new ArrayList<>();
        for (int i = 0; i < sumOfDivisors.length; i++) {
            if (sumOfDivisors[i] > i) {
                abundantNumbers.add(i);
            }
        }
        return abundantNumbers;
    }

}
