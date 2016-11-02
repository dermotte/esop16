package at.aau.itec.esop16.lesson04;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 27.10.2016 15:26.
 */
public class References {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 42}, b;
        b = a;
        System.out.println("a[0] = " + a[0]);
        b[0] = 42;
        System.out.println("a[0] = " + a[0]);

        int x = 42,y;

        System.out.println("x = " + x);
        y = x;
        y = 12;
        System.out.println("x = " + x);

    }
}
