package org.euler.problem;

import java.util.ArrayList;
import java.util.List;


public class Problem92 {

    public void compute() {

        int result = 0;
        for (int i = 2; i < 10000000; i++) {
            int tmp = i;
            while (tmp != 89 && tmp != 1){
                tmp = getNext(tmp);
            }
            if (tmp == 89){
                result++;
            }
            //System.out.println();
        }

        System.out.println("Result is: " + result);
    }

    private int getNext(int number){
        return getSquareDigits(number).stream().reduce(0, Integer::sum);
    }

    private List<Integer> getSquareDigits(int number) {
        List<Integer> digits = new ArrayList<>();
        while (number != 0) {
            digits.add(square(number % 10));
            number /= 10;
        }

        return digits;
    }

    private int square(int number){
        return (int) Math.pow((double) number, 2d);
    }

    public static void main(String[] args) {
        new Problem92().compute();
    }
}
