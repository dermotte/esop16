package at.aau.itec.esop16.lesson4;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 27.10.2016 15:07.
 */
public class VarArgs {
    public static void main(String[] args) {
        printOut("one", "two", "three dog");
    }

    private static void printOut(String... one) {
        System.out.println("one = " + one[0]);
        System.out.println("one = " + one[1]);
    }
}
