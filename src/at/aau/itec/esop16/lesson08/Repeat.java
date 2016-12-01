package at.aau.itec.esop16.lesson08;

import java.util.Arrays;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 01.12.2016 14:01.
 */
public class Repeat {
    public static void main(String[] args) {
        int[] myArray = new int[]{1, 2, 3};
        int[] zweiArray = foo(myArray);
        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(zweiArray));
    }

    public static int[] foo(int[] a) {
        int[] result = new int[a.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = a[i];
        }
        result[0] = -42;
        a = result;
        return result;
    }

}
