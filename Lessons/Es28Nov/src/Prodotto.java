import java.math.BigDecimal;
import java.time.OffsetDateTime;

 enum Tipo{
        GASTRONOMIA,
        IGIENE,
        ALIMENTO,
        BIBITA,
        }

public class Prodotto {

    private String nome;
    private String produttore;
    private Tipo tipo;
    private int quantita;
    private BigDecimal prezzo;
    private OffsetDateTime scadenza;


    public Prodotto(String nome, String produttore, Tipo tipo, int quantita, BigDecimal prezzo, OffsetDateTime scadenza) {
        this.nome = nome;
        this.produttore = produttore;
        this.tipo = tipo;
        this.quantita = quantita;
        this.prezzo = prezzo;
        this.scadenza = scadenza;
    }

    public String getNome() {
        return nome;
    }

    public String getProduttore() {
        return produttore;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public int getQuantita() {
        return quantita;
    }

    public BigDecimal getPrezzo() {
        return prezzo;
    }

    public OffsetDateTime getScadenza() {
        return scadenza;
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "nome='" + nome + '\'' +
                ", produttore='" + produttore + '\'' +
                ", tipo=" + tipo +
                ", quantita=" + quantita +
                ", prezzo=" + prezzo +
                ", scadenza=" + scadenza +
                '}';
    }

}
