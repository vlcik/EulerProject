package org.euler.problem;

import static org.euler.theory.Utils.isPrime;

public class Problem50 {

    public void compute() {

        var count = 0;
        for (var i = 4; i < 1000000; i++) {
            if (isPrime(i)){
                count++;
            }
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        new Problem50().compute();
    }
}
