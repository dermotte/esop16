package at.aau.itec.esop16.lesson02;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 07.10.2016 16:03.
 */
public class BooleanTypeExample {
    public static void main(String[] args) {
        boolean p, q;
        p = true;
        q = 2 > 5;
        if (p) System.out.println("p is true");
        if (q) System.out.println("q is true");
        if (q | p) System.out.println("p or q is true");
        if (!false) {

        }
    }
}
