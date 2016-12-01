package at.aau.itec.esop16.lesson08;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 01.12.2016 14:37.
 */
public class Instances {
    public static void main(String[] args) {
        Pet cat1 = new Pet("Alice", 1);
        Pet cat2 = new Pet("Bob", 1);
        Pet croco1 = new Pet("Charly", 3);
        System.out.println(Pet.numInstances);
        buyDogs(4);
        System.out.println(Pet.numInstances);
    }

    public static void buyDogs(int howMany) {
        for (int i = 0; i < howMany; i++) {
            new Pet("dog"+i, 2);
        }
    }
}
