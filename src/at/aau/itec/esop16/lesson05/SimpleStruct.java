package at.aau.itec.esop16.lesson05;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 03.11.2016 15:23.
 */
public class SimpleStruct {
    public static void main(String[] args) {
        Date x, y;
        x = getDate(31, "Movember", 2016);
        changeDate(x.year);

        System.out.println(x.year + " - " + x.month);
    }

    public static Date getDate(int day, String month, int year) {
        Date x = new Date();
        x.year = year;
        x.day = day;
        x.month = month;
        return x;
    }

    public static void changeDate(int year) {
        year = year + 1000;
    }
}

class Date {
    int year;
    int day;
    String month;
}
