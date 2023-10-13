public class Rettangolo extends Forma {


    private double base;
    private double height;


    public Rettangolo (double base, double height) {
        setBase(base);
        setHeight(height);
        this.tipoForma = TipoForma.RETTANGOLO;

    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void calcolaArea() {
        System.out.println("L'area della forma " + getTipoForma() + " di base " + getBase()+
                " e di altezza " + getHeight() + " è pari a : " + this.base*this.height);
    }

    public TipoForma getTipoForma() {
        return this.tipoForma;
    }

    @Override
    public String toString() {
        return "Rettangolo{" +
                "base=" + base +
                ", height=" + height +
                ", tipoForma=" + getTipoForma() +
                '}';
    }
}
