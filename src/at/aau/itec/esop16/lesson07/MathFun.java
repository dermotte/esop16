package at.aau.itec.esop16.lesson07;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 17.11.2016 14:36.
 */
public class MathFun {
    public static void main(String[] args) {
        double d = 42;
        System.out.println("Math.sin(d) = " + Math.sin(d));

        for (double j = 0d; j < 30; j = j + 0.3) {
            double sin = Math.sin(j);

            int spaces = (int) Math.ceil(sin*10);

            for ( int i=0; i< spaces+12; i++) {
                System.out.print(' ');
            }
            System.out.println('*');
        }
    }
}
