package at.aau.itec.esop16.lesson09;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 15.12.2016 14:37.
 */
public class Fib {
    public static void main(String[] args) {
        int f = fib(50000);
        System.out.println("f = " + f);
    }

    private static int fib(int i) {
        if (i <= 2) return 1;
        else {
            System.out.print("*");
            return (fib(i-1) + fib(i-2));
        }
    }
}
