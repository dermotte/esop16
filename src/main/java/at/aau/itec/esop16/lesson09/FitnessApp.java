package at.aau.itec.esop16.lesson09;

import java.util.Arrays;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 15.12.2016 14:50.
 */
public class FitnessApp {
    public static void main(String[] args) {
        FitnessExercise[] exercises = new FitnessExercise[3];
        exercises[0] = new FitnessExercise("Push-ups", 21);
        exercises[1] = new FitnessExercise("Lunge", 25);
        exercises[2] = new FitnessExercise("Wall Sit", 22);


        Comparable c = exercises[0];

        Arrays.sort(exercises);

        for (FitnessExercise exercise : exercises) {
            System.out.println(exercise.toString());
        }
    }
}
