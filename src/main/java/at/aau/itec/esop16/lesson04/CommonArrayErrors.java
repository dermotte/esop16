package at.aau.itec.esop16.lesson04;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 27.10.2016 15:14.
 */
public class CommonArrayErrors {
    public static void main(String[] args) {

        int[] a = new int[5];
        System.out.println(a[1+1]);
        System.out.println(a.length);
        System.out.println(a[a.length-1]); // last element

        for (int i = 0; i < a.length; i++) {
            a[i] = i*2;
        }
        System.out.println();
    }
}
