package homework;

import homework.model.enemys.Vampire;
import homework.model.enemys.Zombie;
import homework.model.heroes.Archer;
import homework.model.enemys.Enemy;
import homework.model.heroes.Mage;
import homework.model.heroes.Warrior;

import java.util.ArrayList;
import java.util.List;

public class BattleGround {

    public static void main(String[] args) {
        List<Enemy> enemys = new ArrayList<Enemy>();
        enemys.add(new Enemy(100));
        enemys.add(new Zombie(150));
        enemys.add(new Vampire(300));

        Warrior warrior1 = new Warrior("Воин", 10, 1000);
        Archer archer1 = new Archer("Лучник", 15, 500);
        Mage mage1 = new Mage("Маг", 40, 20);

        for (Enemy e : enemys) {
            while (e.isAlive()) {
                if (warrior1.isAlive())
                    warrior1.attackEnemy(e);
                if (archer1.isAlive())
                    archer1.attackEnemy(e);
                if (mage1.isAlive())
                    mage1.attackEnemy(e);
            }
        }
    }
}
