package at.aau.itec.esop16.lesson10;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * A TextSorter maintains a vector of {@link String}s that has
 * been entered on the command line and provides functionality
 * for sorting and listing the entered {@link String}s.
 * <p>
 * All previously entered lines can be listed on the console
 * using the list-command (entering "l" or "L") and all previously
 * entered lines can be alphabetically sorted using the sort-command
 * (entering "s" or "L").
 * The program is terminated by using the quit-command
 * (entering "q" or "Q").<br><br>
 * <p>
 * Subclass this class and override the {@link #sortContent() sortContent}
 * method to provide a non-alphabetically sorting.
 *
 * @author ESOP Team 2014
 */
public class TextSorter {
    private LinkedList<String> list;

    /**
     * Constructs and initializes a TextSorter.
     */
    public TextSorter() {
        list = new LinkedList<>();
    }

    /**
     * Starts prompting the user to enter, list, or sort text lines.
     */
    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text or a command (q to quit, " +
                "l to list, s to sort): ");
        String inString = scanner.nextLine();

        while (!inString.equals("q") && !inString.equals("Q")) {
            if (inString.equals("l") || inString.equals("L")) {
                listContent();
            } else if (inString.equals("s") || inString.equals("S")) {
                sortContent();
            } else {
                list.add(inString);
                System.out.println(list);
            }
            System.out.print("Enter a text or a command " +
                    "(q to quit, l to list, s to sort): ");
            inString = scanner.nextLine();
        }
    }

    /**
     * Lists all previously entered text lines.
     */
    private void listContent() {
        list.forEach(s -> System.out.println(s));
    }

    /**
     * Sorts all previously entered text lines alphabetically.
     */
    protected void sortContent() {
        Collections.sort(list);
    }

    /**
     * Returns the vector containing the entered text lines.
     *
     * @return the vector containing the entered text lines
     */
    protected LinkedList<String> getVector() {
        return list;
    }
}

