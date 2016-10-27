package at.aau.itec.esop16.lesson4;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 27.10.2016 14:32.
 */
public class BinomialCoefficient {
    public static void main(String[] args) {
        // n! /  [k! * (n-k)!]
        double result = 0;
        int n = 165, k = 3;

        result = faculty(n) / (faculty(k) * faculty(n - k));

        System.out.println("result = " + result);
    }

    public static double faculty(int k) {
        double result = 1;
        for (int i = 1; i <= k; i++) {
            result = result * i;
        }
        return result;
    }
}
