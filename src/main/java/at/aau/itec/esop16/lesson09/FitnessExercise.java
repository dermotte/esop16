package at.aau.itec.esop16.lesson09;

import java.io.Serializable;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 15.12.2016 14:49.
 */
public class FitnessExercise implements Comparable, Serializable, TimeSpan {
    String name;
    int duration;

    public FitnessExercise(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public String toString() {
        return name + ": " + duration;
    }

    public int compareTo(Object o) {
        return this.duration - ((FitnessExercise) o).duration;
    }
}
