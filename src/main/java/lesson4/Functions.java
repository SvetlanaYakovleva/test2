package lesson4;

import static java.lang.Math.sqrt;

public class Functions {

    static double squareTriangle(double a, double b, double c) {
        double p = (a + b + c) / 2;

        return sqrt(p*(p - a)*(p - b)*(p - c));
    }

    public static boolean checkFunc(double a, double b, double c){
        double sq = squareTriangle( a, b, c );
        if (sq < 0 ) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isNumberEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isNumberPrime(int number) {
        if (number < 0) {
        return false;
        }

        if (number <= 2) {
            return true;
        }

        for (int i = 2; i < number - 1; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static boolean isPalindrome (String word) {
        if (word.length() < 2) return true;

        if (word.charAt(0) != word.charAt(word.length() - 1)) {
            return false;
        }

        return isPalindrome(word.substring(1, word.length() - 1));
    }
}
