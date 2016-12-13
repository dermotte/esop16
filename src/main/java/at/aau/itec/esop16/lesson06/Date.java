package at.aau.itec.esop16.lesson06;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 10.11.2016 14:27.
 */
class Date {
    int year;
    int day;
    String month;

    /**
     * wdbfiw
     * @param day sfv
     * @param month
     * @param year
     */
    public Date(int day, String month, int year) {
        this.day = day;
        this.year = year;
        this.month = new String(month);
    }
}
