public class TrainingGround {
    public static void main(String[] args) {
        Hero warrior = new Warrior("Саша");
        Hero mage = new Mage("Влад");
        Hero archer = new Archer("Антон");

        warrior.attackEnemy();
        mage.attackEnemy();
        archer.attackEnemy();
    }
}
