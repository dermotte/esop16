package at.aau.itec.esop16.lesson03;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 13.10.2016 14:48.
 */
public class EasyFors {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            // System.out.println("i = " + i);
        }

        for (int i = 10; i > 0; i--) {
            //System.out.println("i = " + i);
        }
        for (int i = 10; i > 2; i /= 2) {
            //System.out.println("i = " + i);
        }

        for (int i = 10; i > 0; i+=0) {
            System.out.println("i = " + i--);
        }
    }
}
