public class Auto {

    private String marca;
    private String modello;
    private String targa;
    private double cilindrata; //Uso double perchè il calcolo della cilindrata coinvolge π

    public Auto(String marca, String modello, String targa, double cilindrata) {
        setMarca(marca);
        setModello(modello);
        setTarga(targa);
        setCilindrata(cilindrata);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public double getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(double cilindrata) {
        this.cilindrata = cilindrata;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", targa='" + targa + '\'' +
                ", cilindrata=" + cilindrata +
                '}';
    }
}
