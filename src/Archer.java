public class Archer extends Hero {
    private static final int ArchDamage = 100;
    private static final double HeadshotChance = 0.4;

    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        int damage = ArchDamage;
        if (Math.random() < HeadshotChance) {
            damage *= 2;
            System.out.println(getName() + " наносит двойной урон!");
        }
        System.out.println(getName() + " атакует врага из лука!");
        enemy.takeDamage(damage);
    }
}