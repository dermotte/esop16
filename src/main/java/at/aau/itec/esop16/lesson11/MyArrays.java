package at.aau.itec.esop16.lesson11;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 26.01.2017 14:56.
 */
public class MyArrays {
    public static void main(String[] args) {
        int[][] a = new int[3][4];
        a[2] = new int[2];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {

                a[i][j] = 42;
            }
        }
    }
}
