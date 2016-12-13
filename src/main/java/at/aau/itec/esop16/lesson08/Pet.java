package at.aau.itec.esop16.lesson08;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 01.12.2016 14:37.
 */
public class Pet {
    String name;
    int type; // typ 1 = katze, typ 2 = hund, typ 3 = krokodil

    static int numInstances = 0;

    public Pet(String name, int type) {
        this.name = name;
        this.type = type;
        numInstances++;
    }

    public boolean isCat() {
        if (type == 1) return true;
        else return false;
    }

    public static Pet newCat(String name) {
        return new Pet(name, 1);
    }

    public static Pet newDog(String name) {
        return new Pet(name, 2);
    }
}
