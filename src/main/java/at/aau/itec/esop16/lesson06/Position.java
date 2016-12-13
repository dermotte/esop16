package at.aau.itec.esop16.lesson06;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 10.11.2016 14:39.
 */
public class Position {
    int x, y;

    public void goLeft() {
        x-=1;
    }

    public void goRight() {
        x+=1;
    }

    public boolean equals(Position p) {
        if (x == p.x && y == p.y) return true;
        else return false;
    }

    public static void main(String[] args) {
        Position p1 = new Position();
        p1.goLeft();
        System.out.println("p1.x = " + p1.x);

        Position p2 = new Position();
        System.out.println(p2.equals(p1));

        p2.goLeft();
        System.out.println(p2.equals(p1));
        p1.goRight();
        p1.main(new String[]{""});

    }
}
