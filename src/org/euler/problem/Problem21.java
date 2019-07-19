package org.euler.problem;

public class Problem21 {

    public void compute() {
        int sum = 0;
        for (int number = 1; number < 10000; number++) {
            int dividerSum = getDivisorSum(number);
            int backDividerSum = getDivisorSum(dividerSum);

            if ((number != dividerSum) && (number == backDividerSum)) {
                sum += number;
            }
        }

        System.out.println("Result is " + sum);
    }

    private int getDivisorSum(int number) {
        int sum = 1;
        for (int i = 2; i <= (number / 2); i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        new Problem21().compute();
    }
}
