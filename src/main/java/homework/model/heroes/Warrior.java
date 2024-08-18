package homework.model.heroes;

import homework.model.enemys.Enemy;

public class Warrior extends Hero {

    public Warrior(String name, int damage, int health) {
        super(name, damage, health);
    }

    @Override
    public <T extends Enemy> void attackEnemy(T enemy) {
        int returnDamage = enemy.takeDamage(getDamage(), getName()) / 2;
        takeDamage(returnDamage);
        System.out.println(enemy.getNames() + " наносит герою " + getName() + " " + returnDamage + " урона");
        checkHealth();
    }
}
