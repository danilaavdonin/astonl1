public class TrainingGround {
    public static void main(String[] args) {
        Enemy enemy = new Enemy(300);

        Hero warrior = new Warrior("Саша", 300);
        Hero mage = new Mage("Влад", 300);
        Hero archer = new Archer("Антон", 300);

        warrior.attackEnemy(enemy);
        mage.attackEnemy(enemy);
        archer.attackEnemy(enemy);
        System.out.println("Враг жив? " + enemy.isAlive());
    }
}