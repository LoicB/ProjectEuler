package com.euler.problem1;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Problem19 {

    public static void main(String[] args) {
        Problem19 problem19 = new Problem19();
        Long time1 = System.currentTimeMillis();
        int sundays = problem19.countingSundays(1901, 2000);
        Long time2 = System.currentTimeMillis();
        System.out.println("  " + (time2 - time1) + "ms");
        System.out.println("The solution is " + sundays);
    }

    protected int countingSundays(int firstYear, int lastYear) {
        LocalDate date = LocalDate.of(firstYear, 1, 1);
        LocalDate lastDay = LocalDate.of(lastYear, 12, 31);
        int sundays = 0;
        while (date.isBefore(lastDay)) {
            if (date.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
                sundays++;
            }
            date = date.plusMonths(1);
        }
        return sundays;
    }
}
