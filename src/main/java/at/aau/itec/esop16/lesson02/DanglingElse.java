package at.aau.itec.esop16.lesson02;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 07.10.2016 15:48.
 */
public class DanglingElse {
    public static void main(String[] args) {
        int x = 42, max = 0;
        if (x > 2) {
            if (x > 10) {
                max = 5;
            }
            else {
                max = 3;
            }
        }
        System.out.println("max = " + max);
    }
}
