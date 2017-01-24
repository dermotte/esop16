package at.aau.itec.esop16.lesson10;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Consumer;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 24.01.2017 11:00.
 */
public class DatenstrukturenFlower {
    public static void main(String[] args) {
        LinkedList<String> s1 = new LinkedList<>();
        LinkedList<String> s2 = new LinkedList<>();
        Collections.addAll(s1, new String[]{"Discworld", "Ringworld", "Real World"});
        Collections.addAll(s2, new String[]{"Discworld", "Ringworld", "Ovoid"});

        for (String item2 : s2) {
            boolean existsInS1 = false;
            for (String item1 : s1) {
                if (item1.equals(item2)) {
                    existsInS1 = true;
                    break;
                }
            }
            if (!existsInS1) s1.add(item2);
        }


        for (String myString : s2) {
            System.out.println(myString);
        }
    }
}
