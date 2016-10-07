package at.aau.itec.esop16.lesson02;

import at.aau.itec.esop16.book.In;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 07.10.2016 12:01.
 */
public class HelloName {
    public static void main(String[] args) {
        System.out.print("Please state your name and press <enter>: ");
        String name = In.readLine();
        System.out.println("Hello " + name + "!");
    }
}
