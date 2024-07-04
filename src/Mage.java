public class Mage extends Hero {
    private static final int MageDamage = 35;
    private static final int Casts = 3;

    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " атакует врага заклинанием");
        for (int i = 0; i < Casts; i++) {
            enemy.takeDamage(MageDamage);
        }
    }

}
