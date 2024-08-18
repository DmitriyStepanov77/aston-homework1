package homework.model.heroes;

import homework.model.enemys.Enemy;

public class Mage extends Hero {

    public Mage(String name, int damage, int health) {
        super(name, damage, health);
    }

    @Override
    public <T extends Enemy> void attackEnemy(T enemy) {
        int returnDamage = enemy.takeDamage(getDamage() * 3, getName());
        takeDamage(returnDamage);
        System.out.println(enemy.getNames() + " наносит герою " + getName() + " " + returnDamage + " урона");
        checkHealth();
    }
}
