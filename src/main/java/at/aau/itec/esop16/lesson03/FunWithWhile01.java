package at.aau.itec.esop16.lesson03;

import java.util.Scanner;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 13.10.2016 14:17.
 */
public class FunWithWhile01 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        // System.out.println(input);
        int summe = 0;
        while (1 <= input) {
            summe += input;
            input = s.nextInt();
        }
        System.out.println("summe = " + summe);
    }
}
