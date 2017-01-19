package at.aau.itec.esop16.lesson10;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 19.01.2017 14:14.
 */
public class Node {
    String value;
    Node next;

    public Node(String value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Node a = new Node("Alice");
        Node b = new Node("Bob");
        Node c = new Node("Charly");
        a.next = b;
        b.next = c;

        System.out.println(a.next.next.value);
    }
}
