package at.aau.itec.esop16.lesson04;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 27.10.2016 15:19.
 */
public class ArrayExample {
    public static void main(String[] args) {
        int[] myArray = new int[5];
        // initialisiere Werte in Array: {1, 2, 3, 4, 5}
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
        }
        // Berechne Durchschnitt:
        float sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        System.out.println(sum / myArray.length);

        for (int i = 0; i < myArray.length; i++) {
            int myInt = myArray[i];
            System.out.println(myInt);
        }
    }
}
