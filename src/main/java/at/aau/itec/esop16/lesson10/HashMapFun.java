package at.aau.itec.esop16.lesson10;

import java.util.HashMap;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 19.01.2017 15:34.
 */
public class HashMapFun {
    public static void main(String[] args) {
        HashMap<String, Integer> student2grade = new HashMap<>(50);

        student2grade.put("Kevin", 5);
        student2grade.put("Alice", 1);
        student2grade.put("Bob", 2);
        student2grade.put("Kevin", 1);

        // System.out.println(student2grade.get("Kevin"));

        for (String key: student2grade.keySet()) {
            System.out.println(key + " hat die Note " + student2grade.get(key));
        }

    }
}
