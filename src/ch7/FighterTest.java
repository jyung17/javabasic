package ch7;

public class FighterTest {
    public static void main(String[] args) {

    }
}

class Fighter extends Unit implements Fightable{

    @Override
    public void move(int x, int y) {

    }

    @Override
    public void attack(Unit u) {

    }
}

class Unit {
    int currentHP;
    int x;
    int y;
}

interface Fightable extends Movable, Attackable { }

interface Movable {
    void move(int x, int y);
}
interface Attackable {
    void attack(Unit u);
}