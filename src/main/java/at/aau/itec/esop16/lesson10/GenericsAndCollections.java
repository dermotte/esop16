package at.aau.itec.esop16.lesson10;

import java.util.*;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 17.01.2017 10:12.
 */
public class GenericsAndCollections {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        for (int i = 0; i< 10; i++) {
            list.add(1 + (int) (Math.random()*100));
        }

        for (Integer next : list) {
            System.out.println(next);
        }

        Collections.sort(list);
        System.out.println("-----------");
        for (Integer next : list) {
            System.out.println(next);
        }
    }
}
