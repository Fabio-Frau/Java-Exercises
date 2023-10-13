public class Articolo {

    private final String nome;
    private final double prezzo;
    private final double iva;
    private final TipoArticolo tipo;

    public Articolo(String nome, double prezzo, double iva,TipoArticolo tipo) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.iva = iva;
        this.tipo = tipo;
    }

    public double getPrezzo(Boolean conIva) {
        if (conIva) {
            return prezzo * (1.0 + iva );
        } else {
            return prezzo;
        }
    }

    public TipoArticolo getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Articolo{" +
                "nome='" + nome + '\'' +
                ", prezzo=" + prezzo +
                ", iva=" + iva +
                ", tipo=" + tipo +
                '}';
    }
}
