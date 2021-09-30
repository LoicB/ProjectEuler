package com.euler.problem3;

import com.euler.tools.NumberUtils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Problem32 {
    public static void main(String[] args) {
        Problem32 problem32 = new Problem32();
        Long time1 = System.currentTimeMillis();
        int sumOfProducts = problem32.pandigitalProducts(9);
        Long time2 = System.currentTimeMillis();
        System.out.println("  " + (time2 - time1) + "ms");
        System.out.println("The solution is " + sumOfProducts);
    }

    protected int pandigitalProducts(int n) {
        Set<Integer> products = new HashSet<>();
        int max = Double.valueOf(Math.pow(10, n / 2d)).intValue();
        for (int multiplicand = 1; multiplicand < max; multiplicand++) {
            for (int multiplier = multiplicand + 1; multiplier < max && numberInOperation(multiplicand, multiplier, multiplicand * multiplier) <= n; multiplier++) {
                if (isPandigital(multiplicand, multiplier, n)) {
                    products.add(multiplicand * multiplier);
                }
            }
        }
        return products.stream().reduce(0, Integer::sum);
    }

    protected boolean isPandigital(int multiplicand, int multiplier, int n) {
        int product = multiplicand * multiplier;
        if (numberInOperation(multiplicand, multiplier, product) != n) return false;
        Set<Integer> digits = new HashSet<>(digitsBelowFromNumber(multiplicand, n));
        if (digits.size() != numberOfDigits(multiplicand)) return false;
        digits.addAll(digitsBelowFromNumber(multiplier, n));
        if (digits.size() != numberOfDigits(multiplicand) + numberOfDigits(multiplier)) return false;
        digits.addAll(digitsBelowFromNumber(product, n));
        return digits.size() == n;
    }

    protected int numberInOperation(int multiplicand, int multiplier, int product) {
        return numberOfDigits(multiplicand) + numberOfDigits(multiplier) + numberOfDigits(product);
    }

    protected int numberOfDigits(int number) {
        return Double.valueOf(Math.log10(number)).intValue() + 1;
    }

    protected List<Integer> digitsBelowFromNumber(int number, int n) {
        return (new NumberUtils()).digitsFromNumber(number).stream().filter(integer -> integer <= n && integer > 0).collect(Collectors.toList());
    }
}
