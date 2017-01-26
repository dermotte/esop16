package at.aau.itec.esop16.lesson11;

import java.util.LinkedList;
import java.util.function.Consumer;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 26.01.2017 14:23.
 */
public class ListAndLocalClass {
    public static void main(String[] args) {
        LinkedList<Integer> myNumbers = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            myNumbers.add((int) (Math.random() * 100));
        }

        class PrintOut implements Consumer<Integer> {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer + 42);
            }
        }

        myNumbers.forEach(new PrintOut());
    }
}

