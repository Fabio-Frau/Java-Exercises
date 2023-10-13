public class Rettangolo extends Forma {


    private double base;
    private double height;

    public Rettangolo (double base, double height) {
        setNome();
        setBase(base);
        setHeight(height);

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
        System.out.println("L'area della forma " + getNome() + " di base " + getBase()+
                " e di altezza " + getHeight() + " è pari a : " + this.base*this.height);;
    }

    @Override
    public void setNome() {
        this.nome = "Rettangolo";
    }

    @Override
    public String toString() {
        return getNome() +
                "base=" + base +
                ", height=" + height +
                '}';
    }
}
