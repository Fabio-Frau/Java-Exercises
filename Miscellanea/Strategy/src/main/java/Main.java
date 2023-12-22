public class Main {

    public static void main(String[] args) {

        Monster m = new Monster();
        m.attack();
        m.setAttackStrategy(new PowerAttackStrategy());
        m.attack();
    }

}
