public class Main {

    public static void main(String[] args) {

        User user = User.getInstance();

        System.out.println(user.toString());

        User user2 = User.getInstance();

        user2.setName("Donald");
        user2.setAge(1000);

        System.out.println(user.toString());
        System.out.println(user2.toString());


    }

}
