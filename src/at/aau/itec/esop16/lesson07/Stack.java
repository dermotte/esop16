package at.aau.itec.esop16.lesson07;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 17.11.2016 14:58.
 */
public class Stack {
    public static int stacksSize = 12;
    private int[] data = new int[stacksSize];
    // points to the next empty stack cell.
    private int pointer = 0;

    public void push(int i) {
        if (pointer < data.length-1) {
            data[pointer] = i;
            pointer++;
        } else {
            System.err.println("Too much to put onto the stack!");
        }
    }

    /**
     * returns the topmost element.
     * @return the topmost element or -1 if empty.
     */
    public int pop() {
        if (pointer > 0) {
            pointer--;
            return data[pointer];
        } else {
            return -1;
        }
    }

    // Getter
    public int getPointer() {
        return pointer;
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(3);
        s.push(3);
        s.push(3);
        s.push(3);
        s.push(3);
        s.push(3);
        s.push(3);
        s.push(3);
        s.push(3);
        s.push(3);
        s.push(3);
        s.push(3);
        s.push(3);
        s.push(3);
        s.push(3);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
