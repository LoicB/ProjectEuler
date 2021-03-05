package com.euler.problem2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem24 {
    public static void main(String[] args) {
        Problem24 problem24 = new Problem24();
        Long time1 = System.currentTimeMillis();
        String lexicographicPermutation = problem24.lexicographicPermutations(999999);
        Long time2 = System.currentTimeMillis();
        System.out.println("  " + (time2 - time1) + "ms");
        System.out.println("The solution is " + lexicographicPermutation);
    }

    protected String lexicographicPermutations(int permutationRank) {
        List<Integer> digits = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        StringBuilder sb = new StringBuilder();
        long rank = permutationRank;
        while (!digits.isEmpty()) {
            long nextNumberOfPermutation = numberOfPermutations(digits.size() - 1);
            int index = (int) (rank / nextNumberOfPermutation);
            rank = (rank % nextNumberOfPermutation);
            sb.append(digits.get(index));
            digits.remove(index);
        }
        return sb.toString();
    }

    protected long numberOfPermutations(int numberOfElements) {
        return factorial(numberOfElements);
    }

    private long factorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}
