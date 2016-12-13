package at.aau.itec.esop16.lesson07;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 17.11.2016 14:46.
 */
public class NameGenerator {
    public static void main(String[] args) {
        char[] cons = "bcdfghjklmnpqrstvwxz".toCharArray();
        char[] vowels = "aeiouyü".toCharArray();
        for (int i =0; i< 5; i++) {
            double indexCandidate = Math.random() * cons.length;
            int index = (int) Math.floor(indexCandidate);
            System.out.print(cons[index]);
            indexCandidate = Math.random() * vowels.length;
            index = (int) Math.floor(indexCandidate);
            System.out.print(vowels[index]);
        }
    }
}
