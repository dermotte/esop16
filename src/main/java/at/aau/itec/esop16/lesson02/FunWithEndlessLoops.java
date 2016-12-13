package at.aau.itec.esop16.lesson02;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 07.10.2016 16:29.
 */
public class FunWithEndlessLoops {
    public static void main(String[] args) {
        int x = 10;
        while (true) {
            System.out.println("x = " + x);
            if (x--<0) break;
        }
    }
}
