package geo;

public class Triangolo implements FiguraPiana {

    private Punto p0;
    private Punto p1;
    private Punto p2;

    public Triangolo(Punto p0, Punto p1, Punto p2) {
        this.p0 = p0;
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public float area() {
        return 0;
    }

    @Override
    public float perimetro() {
        return 0;
    }
}
