public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Paperino", 20);
        Person p2 = new Person("Topolino", 30);

        System.out.println(p1.getName() + " is " + p1.getAge() + " years old");
        System.out.println(p2.getName() + " is " + p2.getAge() + " years old");

    }

}
