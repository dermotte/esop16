package at.aau.itec.esop16.lesson09;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 15.12.2016 15:26.
 */
public class SimpleExceptions {
    public static void main(String[] args) {
        int[] myArray = new int[2];
        try {
            System.out.println(myArray[1]);
            System.out.println(42/0);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.err.println("Array index problem ist");
        } catch(ArithmeticException e) {
            System.err.println("Fehler ist aufgetreten: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
