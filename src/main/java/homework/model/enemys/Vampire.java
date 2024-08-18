package homework.model.enemys;

public class Vampire extends Enemy {

    protected final int REGEN = 3;

    public Vampire(int health) {
        super(health);
    }

    @Override
    public String getNames() {
        return "Вампир " + number;
    }

    @Override
    public int takeDamage(int damage, String name) {
        System.out.println(name + " наносит " + damage / 2 + " урона вампиру " + number + ".");
        health -= damage / 2;
        System.out.println(getNames() + " восстанавливает " + REGEN + " здоровья.");
        health += REGEN;
        System.out.println("У " + getNames() + " осталось " + health + " здоровья.");
        if (!isAlive()) {
            System.out.println(getNames() + " убит.");
            return 0;
        }
        return this.DAMAGE;
    }
}
