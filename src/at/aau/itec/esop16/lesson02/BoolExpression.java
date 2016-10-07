package at.aau.itec.esop16.lesson02;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 07.10.2016 15:57.
 */
public class BoolExpression {
    public static void main(String[] args) {
        int x = 3, y = 4;
        System.out.println(x < 10);
        System.out.println(x > 1);
        if (x < 10) {
            if (x > 1) {
                System.out.println("Stimmt!");
            }
        }

        if (x < 10 && x > 1) {
            System.out.println("Stimmt noch immer!");
        }
    }
}
