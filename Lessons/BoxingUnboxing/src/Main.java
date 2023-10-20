public class Main {
    public static void main(String[] args) {

        int numero1 = 123;
        Integer numero2 = 123;
        Integer numero3 = new Integer(123);
        Integer numero4 = Integer.valueOf(123);

        System.out.println("Numero1: " + numero1);
        System.out.println("Numero2: " + numero2);
        System.out.println("Numero3: " + numero3);
        System.out.println("Numero4: " + numero4);

        Integer numero5 = numero1;
        System.out.println("Numero5: " + numero5);

        int numero6 = numero2;
        System.out.println("Numero6: " + numero6);

        String numeroS = "123456";
        Integer numeroI = Integer.parseInt(numeroS);
        System.out.println("NumeroS: " + numeroS);
        System.out.println("NumeroI: " + numeroI);


    }
}
