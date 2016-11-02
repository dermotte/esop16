package at.aau.itec.esop16.lesson04;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 27.10.2016 14:24.
 */
public class SimpleFunction {
    public static void main(String[] args) {
        int mean = getMean(42, 2);
        System.out.println(mean);
    }

    /**
     * Computes the mean of the two given parameters and returns the value.
     * @param x the first value
     * @param y the second value
     * @return the mean
     */
    public static int getMean(int x, int y) {
        int mean = x + y;
        mean /= 2;
        return mean;
    }
}
