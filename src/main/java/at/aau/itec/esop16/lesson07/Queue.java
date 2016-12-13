package at.aau.itec.esop16.lesson07;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 17.11.2016 14:58.
 */
public class Queue {
    int[] data;
    // points to the next empty stack cell.
    int pointer = 0;

    public void put(int i) {
        if (pointer < data.length-1) {
            data[pointer++] = i;
        } else {
            System.err.println("Too much");
        }
    }

    public Queue() {
        data = new int[25];
    }

    public Queue(int maxLength) {
        data = new int[maxLength];
    }

    /**
     * returns the first element.
     * @return the first element or -1 if empty.
     */
    public int get() {
        if (pointer > 0) {
            int result = data[0];
            for (int i = 0; i < data.length-1; i++) {
                data[i] = data[i+1];
            }
            pointer--;
            return result;
        } else {
            System.err.println("Queue is empty");
            return -1;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        for (int i = 0; i < 13; i++) {
            q.put(i+1);
        }

        for (int i = 0; i < 9; i++) {
            System.out.println("q.get() = " + q.get());
        }
    }

}
