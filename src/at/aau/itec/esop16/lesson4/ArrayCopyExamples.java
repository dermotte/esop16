package at.aau.itec.esop16.lesson4;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 27.10.2016 15:30.
 */
public class ArrayCopyExamples {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 42}, b;
        b = new int[a.length];
        for (int i = 0; i < b.length; i++) {
            b[i] = a[i];
        }
        System.out.println("a[0] = " + a[0]);
        b[0] = 42;
        System.out.println("a[0] = " + a[0]);


    }
}
