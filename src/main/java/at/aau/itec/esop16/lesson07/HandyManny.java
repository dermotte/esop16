package at.aau.itec.esop16.lesson07;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 17.11.2016 14:15.
 */
public class HandyManny {
    public static void main(String[] args) {
        Screwdriver myDriver = new Screwdriver(120, 150);
        Screwdriver miniDriver = new Screwdriver(30, 25);

        // System.out.println("miniDriver.handleLength = " + miniDriver.handleLength);

        System.out.println("Screwdriver.bladeSize = " + Screwdriver.bladeSize);

        miniDriver.bladeSize = 8;

        System.out.println("Screwdriver.bladeSize = " + Screwdriver.bladeSize);

    }
}
