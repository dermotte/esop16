package at.aau.itec.esop16.lesson10;

import java.util.*;
import java.util.function.Consumer;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 24.01.2017 10:44.
 */
public class DatenstrukturenRincewind {
    public static void main(String[] args) {
        LinkedList<Integer> lin = new LinkedList<>();
        Scanner s = new Scanner(System.in);
        int in = 0;
        in = s.nextInt();
        while (in  > -1) {
            // zum Array hinzufügen
            lin.add(in);
            in = s.nextInt();
        }
        printList(lin);
    }

    private static void printList(List<Integer> lin) {
        for (Integer next : lin) {
            System.out.println(next);
        }
    }
}

