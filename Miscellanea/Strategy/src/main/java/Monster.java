public class Monster {

    AttackStrategy attackStrategy;

    public Monster() {
        attackStrategy = new SimpleAttackStrategy();
    }

    public void attack() {
        attackStrategy.attack();
    }

    public void setAttackStrategy(AttackStrategy newAttackStrategy) {
        attackStrategy = newAttackStrategy;
    }
}
