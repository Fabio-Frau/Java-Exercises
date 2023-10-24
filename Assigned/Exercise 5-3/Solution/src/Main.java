import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Fruit> fruits = new LinkedList<>(Arrays.asList(
                new Fruit("Orange"), new Fruit("Banana"),
                new Fruit("Apple"), new Fruit("Strawberry")
        ));

        System.out.println("Initial LinkedList");
        for(Fruit fruit : fruits) {
            System.out.println(fruit.getName());
        }
        System.out.println();

        fruits.addFirst(new Fruit("Peach"));
        fruits.addLast(new Fruit("Pomegranate"));

        System.out.println("LinkedList after addFirst and addLast");
        for(Fruit fruit : fruits) {
            System.out.println(fruit.getName());
        }


    }
}
