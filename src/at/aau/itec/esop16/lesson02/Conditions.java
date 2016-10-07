package at.aau.itec.esop16.lesson02;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 07.10.2016 15:40.
 */
public class Conditions {
    public static void main(String[] args) {
        int x = 42;
        if (x > 0) {
            System.out.print("ok");
            System.out.print("super ok");
        } else {
            System.err.print("error");
        }
    }
}
