public class Main {
    public static void main(String[] args) {


        Rettangolo ret = new Rettangolo(1.2, 3.5);
        System.out.println(ret.getNome());
        ret.calcolaArea();

        System.out.println();

        Triangolo tri = new Triangolo(4.5, 6.3);
        System.out.println(tri.getNome());
        tri.calcolaArea();


    }
}
