package at.aau.itec.esop16.lesson09;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 15.12.2016 13:15.
 */
public class ExceptionFun {
    public static void main(String[] args) {
        try {
            System.out.println("try block before call");
            myMethod();
            System.out.println("try block after call");
        } catch (NullPointerException | MyException e) {
            System.out.println("catch block");
            System.out.println(e.getMessage());
            //e.printStackTrace();
        } finally {
            System.out.println("finally block");
        }
    }

    public static void myMethod() throws MyException {
        throw new MyException("So geht das nicht!");
    }
}
