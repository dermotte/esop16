package at.aau.itec.esop16.lesson10;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 19.01.2017 14:35.
 */
public class SetFun {
    public static void main(String[] args) {
        Set A, B;

        A = new HashSet();
        B = new HashSet();

        A.add("Alice");
        A.add("Bob");
        B.add("Bob");
        B.add("Charlie");

        Set C = new HashSet();
        C.addAll(A);
        A.removeAll(B);
        C.removeAll(A);

        for (Object c : C) {
            System.out.println(c.toString());
        }
    }
}
