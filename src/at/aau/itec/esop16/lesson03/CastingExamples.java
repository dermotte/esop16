package at.aau.itec.esop16.lesson03;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 13.10.2016 15:42.
 */
public class CastingExamples {
    public static void main(String[] args) {
        float f = 3.141592f;
        short i = (short) f;
        System.out.println("short i = " + i);

        int num = 420000;
        System.out.println(num);
        System.out.println(Integer.MAX_VALUE);
    }
}
