package com.euler.problem2;

import java.util.Arrays;

public class Problem22 {
    public static void main(String[] args) {
        Problem22 problem22 = new Problem22();
        Long time1 = System.currentTimeMillis();
        int namesScores = problem22.namesScores(new String[]{});
        Long time2 = System.currentTimeMillis();
        System.out.println("  " + (time2 - time1) + "ms");
        System.out.println("The solution is " + namesScores);
    }

    protected int namesScores(String[] names) {
        Arrays.sort(names);
        int score = 0;
        for (int i = 0; i < names.length; i++) {
            score += nameScore(names[i], i + 1);
        }
        return score;
    }

    protected int nameScore(String name, int index) {
        int score = 0;
        for (char c : name.toCharArray()) {
            score += ((int) c - (int) 'A' + 1);
        }
        return score * index;
    }
}
