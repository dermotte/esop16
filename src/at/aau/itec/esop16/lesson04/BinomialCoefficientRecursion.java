package at.aau.itec.esop16.lesson04;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 27.10.2016 14:32.
 */
public class BinomialCoefficientRecursion {
    public static void main(String[] args) {
        // n! /  [k! * (n-k)!]
        double result = 0;
        int n = 100, k = 3;

        result = faculty(n) / (faculty(k) * faculty(n - k));

        System.out.println("result = " + result);
    }

    public static double faculty(int k) {
        if (k>1)
            return k*faculty(k-1);
        else
            return 1;
    }
}
