package at.aau.itec.esop16.lesson05;

/**
 * Created by mlux on 02.11.2016.
 */
public class FitnessWithArrays {
    static String[] exercises = {
            "Jumping Jacks",
            "Wall sit",
            "Push-up",
            "Abdominal crunch",
            "Step-up",
            "Squat",
            "Triceps dip",
            "Plank",
            "High knees",
            "Lunge",
            "Push-up rotation",
            "Side plank left",
            "Side plank right"
    };
    static long lengthExercise = 5;
    static long lengthPause = 2;

    public static void main(String[] args) throws InterruptedException {
        // for every exercise do the following
        for (int i = 0; i < exercises.length; i++) {
            String exercise = exercises[i];
            System.out.println("Next Exercise is " + exercise);
            // count down 30 seconds
            waitABit(lengthExercise);
            // pause for 10 seconds
            System.out.println("Pause");
            waitABit(lengthPause);
        }
    }

    public static void waitABit(long seconds) throws InterruptedException {
        long currentTime = System.currentTimeMillis();
        long timeWaitOver = currentTime + seconds * 1000;
        while (currentTime < timeWaitOver) {
            System.out.print(".");
            currentTime = System.currentTimeMillis();
            Thread.currentThread().sleep(1000);
        }

    }
}
