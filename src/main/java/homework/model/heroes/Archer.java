package homework.model;

public class Archer extends Hero{

    public Archer(String name, int damage, int health) {
        super(name, damage, health);
    }

    @Override
    public <T extends Enemy> void attackEnemy(T enemy) {
        System.out.println("Лучник " + getName() + " атакует врага.");
        enemy.takeDamage(getDamage()*2);
        if(!enemy.isAlive())
            System.out.println("Враг повержен лучником " + getName() + ".");
    }
}
