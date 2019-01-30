package org.euler.problem;

import org.euler.IResult;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem17 implements IResult {

    private static final int AND_SIZE = 3;
    private static final int HUNDRED_SIZE = 7;

    Map<Integer, Integer> wordsSize = new HashMap(){{
        put(1, 3);
        put(2, 3);
        put(3, 5);
        put(4, 4);
        put(5, 4);
        put(6, 3);
        put(7, 5);
        put(8, 5);
        put(9, 4);
        put(10, 3);
        put(11, 6);
        put(12, 6);
        put(13, 8);
        put(14, 8);
        put(15, 7);
        put(16, 7);
        put(17, 9);
        put(18, 8);
        put(19, 8);
        put(20, 6);
        put(30, 6);
        put(40, 5);
        put(50, 5);
        put(60, 5);
        put(70, 7);
        put(80, 6);
        put(90, 6);
        put(100, 10);
        put(1000, 11);
    }};

    Map<Integer, Integer> baseNumberLetterSize = new HashMap(){{
        put(1, 3);
        put(2, 3);
        put(3, 5);
        put(4, 4);
        put(5, 4);
        put(6, 3);
        put(7, 5);
        put(8, 5);
        put(9, 4);
    }};

    Map<Integer, Integer> tyPrefix = new HashMap(){{
        put(2, 6);
        put(3, 6);
        put(4, 5);
        put(5, 5);
        put(6, 5);
        put(7, 7);
        put(8, 6);
        put(9, 6);
    }};
	
	@Override
	public void compute() {
	    int result = 0;
        for (int number = 1; number <= 1000; number++){

            List<Integer> digits = getDigits(number);
            int size = 0;
            if (wordsSize.containsKey(number)){
                size = wordsSize.get(number);
            }
            else {
                if (digits.size() == 2){
                    size = getTwoDigitLetterSize(digits);
                }

                if (digits.size() == 3){
                    size = getThreeDigitLetterSize(digits);
                }
            }

            System.out.println(number + " - size: " + size);

            result += size;
        }

        System.out.println("Result is: " + result);
	}

	private int getTwoDigitLetterSize(List<Integer> digits){
	    if (digits.size() != 2){
	        throw new IllegalArgumentException(String.format("Invalid size of digit list: %s. Expected %s", digits, 2));
        }

	    if (digits.get(0) == 0 && digits.get(1) == 0){
	        return 0;
        }

	    int number = getNumber(digits);
	    if (wordsSize.containsKey(number)){
            return wordsSize.get(number);
        }

        return tyPrefix.get(digits.get(0)) + baseNumberLetterSize.get(digits.get(1));
    }

    private int getThreeDigitLetterSize(List<Integer> digits){
        if (digits.size() != 3){
            throw new IllegalArgumentException(String.format("Invalid size of digit list: %s. Expected %s", digits, 3));
        }

        int lastTwoDigitsSize;
        if (digits.get(1) == 0){
            lastTwoDigitsSize = wordsSize.get(digits.get(2)) == null ? 0 : wordsSize.get(digits.get(2));
        }
        else {
            lastTwoDigitsSize = getTwoDigitLetterSize(digits.subList(1, 3));
        }

        if (lastTwoDigitsSize == 0){
            return baseNumberLetterSize.get(digits.get(0)) + HUNDRED_SIZE;
        }

        return baseNumberLetterSize.get(digits.get(0)) + HUNDRED_SIZE + AND_SIZE + lastTwoDigitsSize;
    }

	private List<Integer> getDigits(int number){
	    List<Integer> digits = new ArrayList<>();
        while (number != 0){
            digits.add(number % 10);
            number /= 10;
        }

        Collections.reverse(digits);
        return digits;
    }

    private int getNumber(List<Integer> digits){
        return (digits.get(0) * 10) + digits.get(1);
    }

}
