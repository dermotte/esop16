package at.aau.itec.esop16.lesson04;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 27.10.2016 14:11.
 */
public class SimpleMethods {
    public static void main(String[] args) {
        printRuler(); // Aufruf der Methode
        System.out.println("Header 01");
        printRuler(); // Aufruf der Methode
    }

    /**
     * Definition der Methode und Umsetzung
     */
    public static void printRuler() {
        System.out.println("--------------------");
    }
}
