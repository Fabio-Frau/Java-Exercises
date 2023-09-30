public class Main {
    public static void main(String[] args) {

        System.out.println("Classic for loop");
        String[] pizze = {"Margherita", "Marinara", "Napoletana", "Diavola"};
        for (int i = 0; i < pizze.length; i++) {
            System.out.println("Indice i: " + i + ", pizza: " + pizze[i]);
        }

        System.out.println("\nEnhanced for loop");
        for (String pizza : pizze) {
            System.out.println("pizza: " + pizza);
        }

    }
}
