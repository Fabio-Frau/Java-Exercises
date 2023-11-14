public class CarBuilder {

   public CarBuilder () {}
    private int numeroDiPorte;
    private String colore;
    private String propulsione;
    private String tipo;

    public Car build() {
        return new Car(numeroDiPorte, colore, propulsione, tipo,0);
    }

    public CarBuilder setNumeroDiPorte(int numeroDiPorte) {
        this.numeroDiPorte = numeroDiPorte;
        return this;
    }

     public CarBuilder setColore(String colore) {
         this.colore = colore;
         return this;
     }

    public CarBuilder setPropulsione(String propulsione) {
        this.propulsione = propulsione;
        return this;
    }

    public CarBuilder setTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }



}
