package at.aau.itec.esop16.lesson09;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 15.12.2016 09:08.
 */
public class RecursiveGGT {
    public static void main(String[] args) {
        System.out.println(ggt(8551819, 9999991));
        System.out.println(iterativeGgt(8551819, 9999991));
    }

    public static int ggt(int x, int y) {
        // System.out.println(".");
        int rest = x % y;
        if (rest == 0)
            return y;
        else
            return ggt(y, rest);
    }

    public static int iterativeGgt(int x, int y) {
        int rest = x%y;
        while (rest != 0) {
            x = y;
            y = rest;
            rest = x % y;
        }
        return y;
    }
}
