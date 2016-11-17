package at.aau.itec.esop16.lesson07;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 10.11.2016 15:16.
 */
public class FunWithStrings {
    public static void main(String[] args) {
        char[] myData = new char[]{'f', 'o', 'o'};
        String foo = new String(myData);

        StringBuilder sb = new StringBuilder();
        sb.append(myData);

    }
}
