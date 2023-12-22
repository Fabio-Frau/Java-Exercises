package geo;

public class Punto {


    private int x;
    private int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean belongsToFirstQuadrant() {
        return x >= 0 && y >= 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Punto punto)) return false;

        if (x != punto.x) return false;
        return y == punto.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    @Override
    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
