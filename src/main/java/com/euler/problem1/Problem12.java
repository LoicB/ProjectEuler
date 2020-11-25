package com.euler.problem1;

public class Problem12 {

    public static void main(String[] args) {
        Problem12 problem12 = new Problem12();
        System.out.println("The solution is " + problem12.divisibleTriangleNumber(500));
    }

    private long divisibleTriangleNumber(int number) {
        long triangleNumber = 1;
        int index = 2;
        while (number > countFactors(triangleNumber)) {
            triangleNumber += index;
            index++;
        }
        return triangleNumber;
    }


    private long countFactors(long number) {
        long count = 0;
        long sqrt = (long) Math.sqrt(number);
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                count += 2;
            }
        }
        if (sqrt * sqrt == number) {
            count--;
        }
        return count;
    }

}
