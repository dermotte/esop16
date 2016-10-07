package at.aau.itec.esop16.lesson02;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 07.10.2016 16:23.
 */
public class FunWithFor {
    public static void main(String[] args) {
        for (int i = 1; true; i = i << 1) {
            System.out.println(i);
        }
    }
}
