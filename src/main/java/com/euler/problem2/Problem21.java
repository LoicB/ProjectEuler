package com.euler.problem2;

public class Problem21 {
    public static void main(String[] args) {
        Problem21 problem21 = new Problem21();
        Long time1 = System.currentTimeMillis();
        int sumAmicableNum = problem21.sumAmicableNum(10000);
        Long time2 = System.currentTimeMillis();
        System.out.println("  " + (time2 - time1) + "ms");
        System.out.println("The solution is " + sumAmicableNum);
    }

    protected int sumAmicableNum(int number) {
        int[] sumDivisors = initSumProperDivisorsList(number);
        int sum = 0;
        for (int i = 1; i < sumDivisors.length; i++) {
            if (isNumberAmicable(sumDivisors, i)) {
                sum += i;
            }
        }
        return sum;
    }

    protected int[] initSumProperDivisorsList(int number) {
        int[] sumDivisors = new int[number + 1];
        for (int i = 1; i < number; i++) {
            for (int j = 2 * i; j < number; j += i) {
                sumDivisors[j] += i;
            }
        }
        return sumDivisors;
    }

    protected boolean isNumberAmicable(int[] sumDivisors, int index) {
        return sumDivisors[index] <= sumDivisors.length && sumDivisors[index] != index && sumDivisors[sumDivisors[index]] == index;
    }
}
