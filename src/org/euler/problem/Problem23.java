package org.euler.problem;

public class Problem23 {

    public void compute() {
       
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
        new Problem23().compute();
    }
}
