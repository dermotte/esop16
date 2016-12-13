package at.aau.itec.esop16.lesson06;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 10.11.2016 14:49.
 */
public class Fraction {
    int z, n;

    public Fraction(int z, int n) {
        this.z = z;
        this.n = n;
    }


    public String print() {
        return (n + "/" + z);
    }

    public void add(Fraction f) {
        // addieren
        n = n * f.z + f.n * z;
        z = z * f.z;
        // kuerzen
        int ggt = ggT(n, z);
        n = n / ggt;
        z = z / ggt;
    }

    public void mult(Fraction f) {
        n = n * f.n;
        z = z * f.z;
    }

    public int ggT(int a, int b) {
        if (a == b) return (a);
        else {
            if (a > b) return (ggT(a - b, b));
            else return (ggT(b - a, a));
        }
    }

    // -------------------------------------
    public static void main(String[] args) {
        Fraction f1, f2;
        f1 = new Fraction(1, 2);
        f2 = new Fraction(2, 3);

        System.out.println(f1.print());
        System.out.println(f2.print());

        f1.add(f2);
        System.out.println("f1+f2:");
        System.out.println(f1.print());
        //System.out.println(f2.print());

    }
}
