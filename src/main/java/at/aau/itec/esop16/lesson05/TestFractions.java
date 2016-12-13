package at.aau.itec.esop16.lesson05;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 03.11.2016 15:45.
 */
public class TestFractions {
    public static void main(String[] args) {
        Fraction a = new Fraction();
        Fraction b = new Fraction();

        a.zaehler = 13;
        a.nenner = 5;

        b.zaehler = 11;
        b.nenner = 8;

        System.out.println(a.toString());
        System.out.println(b.toString());

        a.add(b);
        System.out.println("Ergebnis von a+b: " + a.toString());
    }
}
