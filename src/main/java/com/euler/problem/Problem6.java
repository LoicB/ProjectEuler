package com.euler.problem;

public class Problem6 {
    public static void main(String[] args) {
        Problem6 problem6 = new Problem6();
        System.out.println("The solution is " + problem6.sumSquareDifference(100));
    }

    protected int sumSquareDifference(int number) {
        return squareOfSum(number) - sumOfSquares(number);
    }

    protected int sumOfSquares(int number) {
        return (number * (number + 1) * (2 * number + 1)) / 6;
    }

    protected int squareOfSum(int number) {
        int sum = (number * (number + 1)) / 2;
        return sum * sum;
    }

}
