package homework.model.enemys;

import homework.model.Mortal;

public class Enemy implements Mortal {
    protected int health;
    protected final int DAMAGE = 8;
    private static int count = 0;
    protected int number;

    public Enemy(int health) {
        this.health = health;
        count++;
        number = count;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getNames() {
        return "Враг " + number;
    }

    public int takeDamage(int damage, String name) {
        System.out.println(name + " наносит " + damage + " урона врагу " + number + ".");
        health -= damage;
        System.out.println("У " + getNames() + " осталось " + health + " здоровья.");
        if (!isAlive()) {
            System.out.println(getNames() + " убит.");
            return 0;
        }
        return this.DAMAGE;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
