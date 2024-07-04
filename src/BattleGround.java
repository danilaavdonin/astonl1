public class BattleGround {
    private static final int WarHealth = 300;
    private static final int MageHealth = 280;
    private static final int ArchHealth = 290;
    private static final int ZombieHealth = 180;
    private static final int EnemyHealth = 200;

    public static void main(String[] args) {
        Enemy enemy = new Enemy(EnemyHealth);
        Enemy zombie = new Zombie(ZombieHealth);

        Hero warrior = new Warrior("Саша", WarHealth);
        Hero mage = new Mage("Влад", MageHealth);
        Hero archer = new Archer("Антон", ArchHealth);

        battle(warrior, zombie);
        battle(mage, enemy);
        battle(archer, enemy);
    }

    public static void battle(Hero hero, Enemy enemy) {
        while (hero.isAlive() && enemy.isAlive()) {
            hero.attackEnemy(enemy);
            if (enemy.isAlive()) {
                enemy.attackHero(hero);
            }
        }
        if (hero.isAlive()) {
            System.out.println(hero.getName() + " победил");
        } else {
            System.out.println(hero.getName() + " погиб");
        }
    }
}