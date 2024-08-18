package homework.model.heroes;

import homework.model.Mortal;
import homework.model.enemys.Enemy;

public abstract class Hero implements Mortal {
    private final String name;
    private final int damage;
    private int health;

    public Hero(String name, int damage, int health) {
        this.name = name;
        this.damage = damage;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public abstract <T extends Enemy> void attackEnemy(T enemy);

    public void takeDamage(int damage) {
        health -= damage;
    }

    public boolean isAlive() {
        return health > 0;
    }

    protected void checkHealth() {
        System.out.println("У героя " + getName() + " осталось " + getHealth() + " здоровья.");
        if(!isAlive()) {
            System.out.println("Герой " + getName() + " убит.");
        }
    }
}
