package at.aau.itec.esop16.lesson03;

import java.util.Scanner;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 13.10.2016 14:17.
 */
public class FunWithWhile02 {
    public static void main(String[] args) throws InterruptedException {
        // Instructions
        System.out.println("Erste Übung: Hampelmann");
        // count down 30 seconds
        long currentTime = System.currentTimeMillis();
        int lengthExercise = 30; // this is the length of an exercise in seconds
        int lengthPause = 10; // this is the length of an pause in seconds
        long timeWaitOver = currentTime + lengthExercise *1000;
        while (currentTime < timeWaitOver) {
            System.out.print(".");
            currentTime = System.currentTimeMillis();
            Thread.currentThread().sleep(1000);
        }
        // pause for 10 seconds
        System.out.println("Pause");
        timeWaitOver = currentTime + lengthPause*1000;
        while (currentTime < timeWaitOver) {
            System.out.print(".");
            currentTime = System.currentTimeMillis();
            Thread.currentThread().sleep(1000);
        }
        // 2nd exercise
        System.out.println("Zweite Übung: Wandsitz");
        timeWaitOver = currentTime + lengthExercise *1000;
        while (currentTime < timeWaitOver) {
            System.out.print(".");
            currentTime = System.currentTimeMillis();
            Thread.currentThread().sleep(1000);
        }
        // pause for 10 seconds
        System.out.println("Pause");
        timeWaitOver = currentTime + lengthPause*1000;
        while (currentTime < timeWaitOver) {
            System.out.print(".");
            currentTime = System.currentTimeMillis();
            Thread.currentThread().sleep(1000);
        }
    }
}
