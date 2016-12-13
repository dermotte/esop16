package at.aau.itec.esop16.lesson07;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 17.11.2016 13:52.
 */
public class Screwdriver {
    public static double bladeSize; // 6mm

    static {
        bladeSize = 6d;
    }

    public double handleLength = 120;
    public double shaftLength = 200;

    public Screwdriver(double handleLength, double shaftLength) {
        this.handleLength = handleLength;
        this.shaftLength = shaftLength;
    }

    public static void main(String[] args) {
        HandyManny.main(args);
    }
}
