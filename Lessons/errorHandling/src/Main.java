public class Main {
    public static void main(String[] args) {

        try {
            String test = "1";

            if (test.equals("1")) {
                throw new ArithmeticException("Errore 1");
            }


        } catch (ArithmeticException e) {
            System.out.println("Si è verificato un errore ArithmeticException " + e);

        } catch (Exception e) {
            System.out.println("Si è verificato un errore " + e);
        } finally {
            System.out.println("Gestione errori completata");
        }



        System.out.println("Hello world!");



    }
}
