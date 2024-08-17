package homework.model;

public class Mage extends Hero{

    public Mage(String name, int damage, int health) {
        super(name, damage, health);
    }

    @Override
    public <T extends Enemy> void attackEnemy(T enemy) {
        System.out.println("Маг " + getName() + " атакует врага.");
        enemy.takeDamage(getDamage()*3);
        if(!enemy.isAlive())
            System.out.println("Враг повержен магом " + getName() + ".");
    }
}
