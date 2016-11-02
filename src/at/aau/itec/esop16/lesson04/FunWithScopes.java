package at.aau.itec.esop16.lesson04;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 27.10.2016 14:53.
 */
public class FunWithScopes {

    static int aValue = 120;

    // static int worstPractice = 10;

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        } // i gibt es nicht mehr
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("i = " + i);
            } // j gibt es nicht mehr
        } // i gibt es nicht mehr
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i* aValue);
        }
        int j = 12;

        for (int worstPractice = 1; worstPractice < 10; worstPractice++) {
            System.out.println(worstPractice);
        }
    }
}
