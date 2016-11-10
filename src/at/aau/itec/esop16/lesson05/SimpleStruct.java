package at.aau.itec.esop16.lesson05;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 03.11.2016 15:23.
 */
public class SimpleStruct {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();
        end = new Date();

        start.day = 11;
        start.month = "November";
        start.year = 2016;

        end.day = 11;
        end.year = 2016;
        end.month = "November";

        boolean sameDate = isSameDate(start, end);
        System.out.println("isSameDate(start, end) = " + sameDate);
        Address home = new Address();

        Date endPlusOne = getTheDayAfter(end);

    }

    public static Date getTheDayAfter(Date d) {
        Date result = new Date();
        result.day = d.day+1;
        result.year = d.year;
        result.month = new String(d.month);
        return result;
    }


    public static boolean isSameDate(Date d1, Date d2) {
        boolean result = true;
        if (d1.day != d2.day) result = false;
        if (d1.year != d2.year) result = false;
        if (!d1.month.equals(d2.month)) result = false;
        return result;
    }
}



