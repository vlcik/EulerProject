package org.euler.problem;

import java.util.ArrayList;
import java.util.List;

import org.euler.IResult;

public class Problem19 implements IResult {

    private static final List<Integer> DAYS_IN_MONTH = List.of(
        31, 28, 31, 30, 31, 30, 31, 31, 30 , 31, 30, 31
    );

    @Override
    public void compute() {

        int count = 0;
        final List<Integer> days = new ArrayList<>();
        days.add(31);
        for (int year = 1901; year < 2001; year++) {
            for (int month = 0; month < 12; month++) {
                int daysInMonth = DAYS_IN_MONTH.get(month);
                if ((month == 1) && isLeapYear(year)) {
                    daysInMonth = 29;
                }

                days.addAll(addDays(daysInMonth));
            }
        }

        int index = 6;
        while (index < days.size()) {
            if (days.get(index) == 1) {
                count++;
            }

            index = index + 7;
        }

        System.out.println(days);
        System.out.println("Sundays: " + count);

    }

    private List<Integer> addDays(int daysInMonth) {
        final List<Integer> days = new ArrayList<>();
        for (int day = 1; day <= daysInMonth; day++) {
            days.add(day);
        }

        return days;
    }

    boolean isLeapYear(int year) {

        if (((year % 100) == 0) && ((year % 400) != 0)) {
            return false;
        }

        return ((year % 4) == 0);
    }

    public static void main(String[] args) {
        new Problem19().compute();
    }
}
