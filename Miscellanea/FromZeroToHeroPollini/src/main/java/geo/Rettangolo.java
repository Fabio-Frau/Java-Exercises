package geo;

public class Rettangolo implements FiguraPiana {

    private Punto p0;
    private float sizeX;
    private float sizeY;

    public Rettangolo(Punto p0, float sizeX, float sizeY) {
        this.p0 = p0;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
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
