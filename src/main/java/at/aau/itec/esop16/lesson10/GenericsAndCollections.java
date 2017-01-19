package at.aau.itec.esop16.lesson10;

import java.util.*;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 17.01.2017 10:12.
 */
public class GenericsAndCollections {
    public static void main(String[] args) {
       List<String> l = new ArrayList<>();
       l.add("Alice");
       l.add("Hello");
       l.add("Bob");
       l.add("Charly");
       l.add("Kevin");

       Collections.shuffle(l);

       for (String s : l) {
           System.out.println(s);
       }

       System.out.println("--");
       Collections.sort(l);

       for (String s : l) {
           System.out.println(s);
       }
    }
}
