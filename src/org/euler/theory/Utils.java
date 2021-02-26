package org.euler.theory;

import java.util.Set;

public class Utils {

    private Utils() {
    }

    public static boolean isPrime(int number){
        if (Set.of(2, 3).contains(number)) {
            return true;
        }

        if (number % 2 == 0) {
            return false;
        }

        if (number % 3 == 0) {
            return false;
        }

        var i = 5;
        var w = 2;
        while (i * i <= number) {
            if (number % i == 0) {
                return false;
            }

            i += w;
            w = 6 - w;
        }

        return true;
    }
}
