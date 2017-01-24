package at.aau.itec.esop16.lesson10;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 24.01.2017 11:27.
 */
public class RestaurantAtTheEndOfTheUniverse {
    public static void main(String[] args) {
        RestaurantAtTheEndOfTheUniverse b = new RestaurantAtTheEndOfTheUniverse();

        b.add(-1000);
        System.out.println(b.withdraw(500));
        System.out.println(b.withdraw(600));
        System.out.println(b);
    }

    private double amount = 0d;

    public double getBalance() {
        return amount;
    }

    public void add(double money) {
        if (money > 0)
            amount += money;
    }

    public double withdraw(double money) {
        if (money <= 0) return 0;
        if (money > amount) {
            money = amount;
            amount = 0;
            return money;
        } else {
            amount -= money;
            return money;
        }
    }

    public String toString() {
        return "" + getBalance();
    }
}
