package at.aau.itec.esop16.lesson10;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 19.01.2017 14:18.
 */
public class SimpleList {
    private Node head;
    private Node tail;

    public void add(Node n) {
        if (head == null) { // liste ist leer
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
    }

    public Node getFirst() {
        return head;
    }

    public Node get(int index) {
        Node result = getFirst();
        if (index == 0) return result;
        else while (index-- >0) {
            result = result.next;
        }
        return result;
    }

    public static void main(String[] args) {
        SimpleList l = new SimpleList();
        l.add(new Node("Alice"));
        l.add(new Node("Bob"));
        l.add(new Node("Charly"));

        System.out.println(l.get(0).value);
        System.out.println(l.get(1).value);
        System.out.println(l.get(2).value);

    }
}
