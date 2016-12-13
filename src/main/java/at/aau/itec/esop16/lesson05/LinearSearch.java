package at.aau.itec.esop16.lesson05;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 03.11.2016 14:43.
 */
public class LinearSearch {
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

    public static void main(String[] args) {
        // where is wall sit?
        String query = "Wall sit";
        for (int i=0; i<exercises.length; i++) {
            if (query.equals(exercises[i])) {
                System.out.println("position = " + i);
                break;
            }
        }
    }
}
