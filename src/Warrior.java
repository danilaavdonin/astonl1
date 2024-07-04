public class Warrior extends Hero {
    private static final int WarDamage = 100;

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " атакует врага копьём");
        enemy.takeDamage(WarDamage);
    }
}
