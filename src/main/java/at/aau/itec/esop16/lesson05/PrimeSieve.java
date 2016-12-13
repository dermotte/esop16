package at.aau.itec.esop16.lesson05;

/**
 * Created by mlux on 02.11.2016.
 */
public class PrimeSieve {
    public static void main(String[] args) {
        int n = 10000000;    // find primes up to n
        boolean[] primes = new boolean[n];

        // init all values:
        for (int i = 0; i < primes.length; i++) {
            primes[i] = true;
        }

        // sieve:
        for (int i = 2; i < Math.sqrt(primes.length); i++) {
            if (primes[i]) {
                for (int j = 1; j*i < primes.length; j++) {
                    primes[j * i] = false;
                }
            }
        }

        // print:
        for (int i = 0; i < primes.length; i++) {
            if (primes[i]) System.out.println(i);;

        }

    }
}
