public class Main {
    public static void main(String[] args) {
        User g = new User("BOHBOHBOH","Antonio", "Iovine", "antonio@email.com", User.Status.ONLINE, User.LoginType.GOOGLE);
        User f = new User("BOHBOHBOH","Antonio", "Iovine", "antonio@email.com", User.Status.ONLINE, User.LoginType.FACEBOOK);
        User a = new User("BOHBOHBOH","Antonio", "Iovine", "antonio@email.com", User.Status.ONLINE, User.LoginType.APPLE);

        g.generateCorrectUser();

        System.out.println();




    }
}


