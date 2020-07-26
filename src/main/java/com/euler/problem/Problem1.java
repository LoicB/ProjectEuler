package com.euler.problem;

public class Problem1 {
    public int multiplesOf3and5(int number) {
        return multiplesOf(number, 3)
                + multiplesOf(number, 5)
                - multiplesOf(number, 15);
    }

    public int multiplesOf(int number, int multiple) {
        int numberOfMultiples = number / multiple;
        numberOfMultiples -= number % multiple == 0 ? 1 : 0;
        return (numberOfMultiples * (numberOfMultiples + 1)) / 2 * multiple;
    }
}
