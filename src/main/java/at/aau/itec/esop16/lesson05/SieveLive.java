package at.aau.itec.esop16.lesson05;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 03.11.2016 14:55.
 */
public class SieveLive {
    public static void main(String[] args) {
        boolean[] sieve = new boolean[10000000];

        // init data
        for (int i = 2; i < sieve.length; i++) {
            sieve[i] = true;
        }

        for (int i = 2; i < sieve.length; i++) {
            for (int j = i+i; j < sieve.length; j = j+i) {
                sieve[j] = false;
            }
        }

        // output
        for (int i = 2; i < sieve.length; i++) {
            if (sieve[i]) {
                System.out.println(i);
            }
        }



    }
}
