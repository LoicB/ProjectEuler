package com.euler.problem;

public class Problem4 {

    public static void main(String[] args) {
        Problem4 problem4 = new Problem4();
        System.out.println("The solution is " + problem4.largestPalindromeProduct());
    }

    public int largestPalindromeProduct() {
        int maxPalindrome = 0;
        for (int i = 100; i <= 999; i++) {
            for (int j = 100; j <= 999; j++) {
                if (isPalindrome(i * j)) {
                    maxPalindrome = Math.max(maxPalindrome, i * j);
                }
            }
        }
        return maxPalindrome;
    }

    protected boolean isPalindrome(int number) {
        return number == reverseDigits(number);
    }

    protected int reverseDigits(int number) {
        int reverseDigit = 0;
        int partialNumber = number;
        while (partialNumber > 0) {
            reverseDigit = reverseDigit * 10 + (partialNumber % 10);
            partialNumber /= 10;
        }
        return reverseDigit;
    }
}
