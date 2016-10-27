package at.aau.itec.esop16.lesson4;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 27.10.2016 14:11.
 */
public class SimpleMethodsWithParam {
    public static void main(String[] args) {
        printHeader("Header 01");
        printHeader("Header 02");
    }

    public static void printHeader(String headerText) {
        printRuler(); // Aufruf der Methode
        System.out.println(headerText);
        printRuler(); // Aufruf der Methode
    }

    /**
     * Definition der Methode und Umsetzung
     */
    public static void printRuler() {
        System.out.println("*******************");
    }
}
