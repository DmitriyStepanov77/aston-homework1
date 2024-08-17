package homework.model;

public abstract class Hero {
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
}
