package at.aau.itec.esop16.lesson4;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 13.10.2016 15:17.
 */
public class ExtendedPrimeCheck {
    public static void main(String[] args) {
        // todo: start with simple prime check and make it using a function ...
        for (int candidate = 3; candidate < 10000; candidate += 2) {
            boolean isPrime = true;
            for (int check = 2; check < Math.sqrt(candidate); check++) {
                if (candidate % check == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.println(candidate);
        }
    }
}
