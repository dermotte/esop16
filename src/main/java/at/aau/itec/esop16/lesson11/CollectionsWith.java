package at.aau.itec.esop16.lesson11;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 26.01.2017 15:32.
 */
public class CollectionsWith {
    public static void main(String[] args) {
        List<CharSequence> l = new LinkedList<>();
        l.add("foo");
        l.add("bar");
        l.add(new Integer(2));


        for (Object o : l) {
            if (o instanceof String) {
                String next = (String) o;
            }

        }
    }
}
