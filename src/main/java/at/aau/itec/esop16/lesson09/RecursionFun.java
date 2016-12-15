package at.aau.itec.esop16.lesson09;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 15.12.2016 14:10.
 */
public class RecursionFun {
    public static void main(String[] args) {
        System.out.println(foo(31));
    }

    private static int foo(int i) {
        if (i > 1) {
            return i*foo(i-1);
        }
        else {
            return i;
        }
    }


}
