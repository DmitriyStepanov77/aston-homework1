package homework.model;

public class Warrior extends Hero{

    public Warrior(String name, int damage, int health) {
        super(name, damage, health);
    }

    @Override
    public <T extends Enemy> void attackEnemy(T enemy) {
        System.out.println("Воин " + getName() + " атакует врага.");
        enemy.takeDamage(getDamage());
        if(!enemy.isAlive())
            System.out.println("Враг повержен воином " + getName() + ".");
    }
}
