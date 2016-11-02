package at.aau.itec.esop16.lesson04;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 27.10.2016 15:04.
 */
public class Overlord {
    public static void main(String[] args) {
        write(42);
        write(42.0);
        // System.out.println()
    }

    public static void write(int i) {
        System.out.println("i = " + i);
    }

    public static void write(double d) {
        System.out.println((int) d);
    }

}
