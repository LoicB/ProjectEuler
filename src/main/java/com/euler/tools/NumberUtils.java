package com.euler.tools;

import java.util.ArrayList;
import java.util.List;

public class NumberUtils {

    public List<Integer> digitsFromNumber(int number) {
        List<Integer> digits = new ArrayList<>();
        int quotient = number;
        while (quotient > 0) {
            digits.add(0, quotient % 10);
            quotient /= 10;
        }
        return digits;
    }
}
