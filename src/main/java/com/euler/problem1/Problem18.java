package com.euler.problem1;

import java.util.HashMap;
import java.util.Map;

public class Problem18 {
    public static void main(String[] args) {
        int[][] triangle = new int[][]{{75},
                {95, 64},
                {17, 47, 82},
                {18, 35, 87, 10},
                {20, 4, 82, 47, 65},
                {19, 1, 23, 75, 3, 34},
                {88, 2, 77, 73, 7, 63, 67},
                {99, 65, 4, 28, 6, 16, 70, 92},
                {41, 41, 26, 56, 83, 40, 80, 70, 33},
                {41, 48, 72, 33, 47, 32, 37, 16, 94, 29},
                {53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14},
                {70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57},
                {91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48},
                {63, 66, 4, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31},
                {4, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 4, 23}};
        Problem18 problem18 = new Problem18();
        Long time1 = System.currentTimeMillis();
        int maximumSumPath = problem18.maximumPathSumI(triangle);
        Long time2 = System.currentTimeMillis();
        System.out.println("  " + (time2 - time1) + "ms");
        System.out.println("The solution is " + maximumSumPath);
    }

    public int maximumPathSumI(int[][] triangle) {
        return maximumPathSumAt(0, 0, triangle, new HashMap<>());
    }

    protected int maximumPathSumAt(int x, int y, int[][] triangle, Map<Integer, Integer> memo) {
        if (!hasBelowRow(x, triangle)) {
            return triangle[x][y];
        }
        int key = 59 * x + y;
        if (!memo.containsKey(key)) {
            memo.put(key, triangle[x][y] + Math.max(maximumPathSumAt(x + 1, y, triangle, memo), maximumPathSumAt(x + 1, y + 1, triangle, memo)));
        }
        return memo.get(key);
    }

    protected boolean hasBelowRow(int x, int[][] triangle) {
        return (x + 1 < triangle.length);
    }
}
