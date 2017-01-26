package at.aau.itec.esop16.lesson11;

import java.util.Collections;
import java.util.LinkedList;
import java.util.function.Consumer;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 26.01.2017 14:23.
 */
public class ListAndLambda {
    public static void main(String[] args) {
        LinkedList<Integer> myNumbers = new LinkedList<>();
        for (int i = 0; i < 7; i++) {
            myNumbers.add((int) (Math.random() * 100));
        }

        myNumbers.forEach((integer) -> System.out.println(integer));

        System.out.println("---");

        Collections.sort(myNumbers, (o1, o2) ->  o2-o1);
        myNumbers.forEach((integer) -> System.out.println(integer));
    }
}

