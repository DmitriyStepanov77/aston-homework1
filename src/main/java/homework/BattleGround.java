package homework;

import homework.model.Archer;
import homework.model.Enemy;
import homework.model.Mage;
import homework.model.Warrior;

public class TrainingGround {

    public static void main(String[] args) {
        Enemy enemy1 = new Enemy(100);
        Warrior warrior1 = new Warrior("Воин", 10, 100);
        Archer archer1 = new Archer("Лучник", 10, 100);
        Mage mage1 = new Mage("Маг", 10, 100);

        warrior1.attackEnemy(enemy1);
        archer1.attackEnemy(enemy1);
        warrior1.attackEnemy(enemy1);
        mage1.attackEnemy(enemy1);
        mage1.attackEnemy(enemy1);
    }
}
