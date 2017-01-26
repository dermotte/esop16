package at.aau.itec.esop16.lesson11;

import java.util.LinkedList;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 26.01.2017 14:16.
 */
public class GameClass {
    LinkedList<Monster> myMonsters = new LinkedList<>();
    public void addMonster(Monster m) {
        myMonsters.add(m);
    }

    public static void main(String[] args) {
        GameClass game = new GameClass();
        game.addMonster(new GameClass.Monster());
    }

    public static class Monster {
        int hitPoints = 100;
    }
}
