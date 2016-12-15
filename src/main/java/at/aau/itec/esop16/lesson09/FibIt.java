package at.aau.itec.esop16.lesson09;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 15.12.2016 14:37.
 */
public class FibIt {
    public static void main(String[] args) {
        int f = fib(13);
        System.out.println("f = " + f);
    }

    private static int fib(int i) {
        int minus2 = 1, minus1 = 1;
        int tempFib = 0, counter = 2;
        while (counter < i) {
            tempFib = minus2 + minus1;
            minus2 = minus1;
            minus1 = tempFib;
            counter++;
        }
        return tempFib;
    }
}
