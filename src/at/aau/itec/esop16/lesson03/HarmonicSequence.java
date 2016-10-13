package at.aau.itec.esop16.lesson03;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 13.10.2016 15:32.
 */
public class HarmonicSequence {
    public static void main(String[] args) {
        double max = 100;
        double sum = 0;
        for (int d = 1; d <= max; d++) {
            sum +=1d/d;
        }
        System.out.println(sum);
    }
}
