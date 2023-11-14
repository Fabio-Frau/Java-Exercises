public class Main {
    public static void main(String[] args) {

        String tipo = "gatto";
        String nome = "tom";
        Animale animale = AnimaleFactory.getAnimale(tipo, nome);

        System.out.println("animale = " + animale);

    }
}
