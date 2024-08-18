package homework.model.enemys;

public class Zombie extends Enemy {

    private boolean REBITH = true;

    public Zombie(int health) {
        super(health);
    }

    @Override
    public String getNames() {
        return "Зомби " + number;
    }

    @Override
    public int takeDamage(int damage, String name) {
        System.out.println(name + " наносит " + damage + " урона зомби " + number + ".");
        health -= damage;
        System.out.println("У " + getNames() + " осталось " + health + " здоровья.");
        if (!isAlive()) {
            System.out.println(getNames() + " убит.");
            if (REBITH) {
                REBITH = false;
                health = 100;
                System.out.println(getNames() + " возрожден.");
                return this.DAMAGE;
            }
            return 0;
        }
        return this.DAMAGE;
    }
}
