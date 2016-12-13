package at.aau.itec.esop16.lesson05;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 03.11.2016 15:45.
 */
public class Fraction {
    long zaehler, nenner;

    public void add(Fraction f) {
        zaehler = zaehler * f.nenner + f.zaehler * nenner;
        nenner = nenner * f.nenner;
    }

    public void kuerzen() {

    }

    public String toString() {
        return zaehler + "/" + nenner;
    }


}
