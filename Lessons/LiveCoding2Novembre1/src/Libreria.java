import java.util.ArrayList;

public class Libreria {
    private ArrayList<Libro> libri;

    public Libreria(ArrayList<Libro> libri) {
        this.libri = libri;
    }

    public ArrayList<Libro> getLibri() {
        return libri;
    }

    public void setLibri(ArrayList<Libro> libri) {
        this.libri = libri;
    }
}
