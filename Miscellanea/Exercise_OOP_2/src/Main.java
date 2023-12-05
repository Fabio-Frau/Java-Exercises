import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Dog d1 = new Dog("Pino", "German Shepard");
        Dog d2  = new Dog("Fuffy", "Chihuahua");

        System.out.println(d1);
        System.out.println(d2);

        d1.setName("Aristotale");
        d2.setBreed("Labrador");

        System.out.println();
        System.out.println(d1);
        System.out.println(d2);



    }

}
