public class Zombie extends Enemy{
    private static final int ZombieDamage = 80;
    private static final int ResHealth = 100;
    private static final double ResChance = 0.5;
    public Zombie(int health){
        super(health);
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage);
        if (!isAlive() && Math.random() > ResChance) {
            System.out.println("Зомби восстал!");
            setHealth(ResHealth);
        }
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println("Зомби атакует героя!");
        hero.takeDamage(ZombieDamage);
    }
}