package com.euler.problem1;

public class Problem14 {
    public static void main(String[] args) {
        Problem14 problem14 = new Problem14();
        System.out.println("The solution is " + problem14.longestCollatzSequence(1000000));
    }

    public long longestCollatzSequence(long limit) {
        long longestSequence = 1;
        long longestSequenceIndex = 0;
        for (int i = 1; i <= limit; i++) {
            long iSequence = collatzSequenceLength(i);
            if (iSequence > longestSequence) {
                longestSequence = iSequence;
                longestSequenceIndex = i;
            }
        }
        return longestSequenceIndex;
    }

    protected long collatzSequenceLength(long number) {
        long nextNumber = number;
        long sequenceLength = 1;
        while (nextNumber != 1) {
            nextNumber = collatzNextValue(nextNumber);
            sequenceLength++;
        }
        return sequenceLength;
    }


    protected long collatzNextValue(long number) {
        long nextValue;
        if (number % 2 == 0) {
            nextValue = number / 2;
        } else {
            nextValue = 3 * number + 1;
        }
        return nextValue;
    }
}
