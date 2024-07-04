public class Enemy implements Mortal {
    private int health;
    private static final int DefDamage = 100;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
        System.out.println("Враг получил " + damage + " урона. Осталось здоровья: " + health);
    }
    public void attackHero(Hero hero) {
        System.out.println("Враг атакует " + hero.getName());
        hero.takeDamage(DefDamage);
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
