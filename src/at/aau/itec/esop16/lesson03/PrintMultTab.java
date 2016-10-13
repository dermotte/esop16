package at.aau.itec.esop16.lesson03;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 13.10.2016 14:56.
 */
public class PrintMultTab {
    public static void main(String[] args) {
        int maxNumber = 42;
        for (int row = 1; row <= maxNumber; row++) {
            for (int column = 1; column <= maxNumber; column++) {
                System.out.print(row * column + "\t");
            }
            System.out.print("\n");
        }
    }
}
