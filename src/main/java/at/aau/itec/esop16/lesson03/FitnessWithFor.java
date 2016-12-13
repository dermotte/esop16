package at.aau.itec.esop16.lesson03;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 13.10.2016 15:10.
 */
public class FitnessWithFor {
    public static void main(String[] args) throws InterruptedException {
        int lengthExercise = 30; // this is the length of an exercise in seconds
        int lengthPause = 10; // this is the length of an pause in seconds
        for (int i= 1; i<=12; i++) {
            // Instructions
            System.out.println("Übung " + i);
            // count down 30 seconds
            long currentTime = System.currentTimeMillis();
            long timeWaitOver = currentTime + lengthExercise * 1000;
            while (currentTime < timeWaitOver) {
                System.out.print(".");
                currentTime = System.currentTimeMillis();
                Thread.currentThread().sleep(1000);
            }
            // pause for 10 seconds
            System.out.println("Pause");
            timeWaitOver = currentTime + lengthPause * 1000;
            while (currentTime < timeWaitOver) {
                System.out.print(".");
                currentTime = System.currentTimeMillis();
                Thread.currentThread().sleep(1000);
            }
        }
    }
}
