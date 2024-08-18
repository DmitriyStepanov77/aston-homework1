package homework.model.heroes;

import homework.model.enemys.Enemy;

public class Archer extends Hero {

    public Archer(String name, int damage, int health) {
        super(name, damage, health);
    }

    @Override
    public <T extends Enemy> void attackEnemy(T enemy) {
        int returnDamage = enemy.takeDamage(getDamage() * 2, getName());
        takeDamage(returnDamage);
        System.out.println(enemy.getNames() + " наносит герою " + getName() + " " + returnDamage + " урона");
        checkHealth();
    }
}
