package at.aau.itec.esop16.lesson10;
/**
 * A small program that allows the user to enter
 * lines of text via the console. All previously
 * entered lines can be listed on the console using
 * the list-command (entering "l" or "L") and all
 * previously entered lines can be alphabetically
 * sorted using the sort-command (entering "s" or "L").
 * The program is terminated by using the quit-command
 * (entering "q" or "Q").
 *
 * @author ESOP Team 2014
 *
 */
public class TextSortMain {
    public static void main(String[] args) {
        TextSorter ts = new TextSorter();
        ts.start();
    }
}
