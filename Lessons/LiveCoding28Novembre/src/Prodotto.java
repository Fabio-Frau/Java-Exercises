import java.math.BigDecimal;
import java.time.OffsetDateTime;

public class Prodotto {

    private String nome;
    private String produttore;
    private int quantita;
    private TipoProdotto tipologia;
    private BigDecimal prezzo;
    private OffsetDateTime scadenza;

    public Prodotto(String nome, String produttore, int quantita, TipoProdotto tipologia,
                    BigDecimal prezzo, OffsetDateTime scadenza) {
        this.nome = nome;
        this.produttore = produttore;
        this.quantita = quantita;
        this.tipologia = tipologia;
        this.prezzo = prezzo;
        this.scadenza = scadenza;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProduttore() {
        return produttore;
    }

    public void setProduttore(String produttore) {
        this.produttore = produttore;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public TipoProdotto getTipologia() {
        return tipologia;
    }

    public void setTipologia(TipoProdotto tipologia) {
        this.tipologia = tipologia;
    }

    public BigDecimal getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    public OffsetDateTime getScadenza() {
        return scadenza;
    }

    public void setScadenza(OffsetDateTime scadenza) {
        this.scadenza = scadenza;
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "nome='" + nome + '\'' +
                ", produttore='" + produttore + '\'' +
                ", quantita=" + quantita +
                ", tipologia=" + tipologia +
                ", prezzo=" + prezzo +
                ", scadenza=" + scadenza +
                '}';
    }
}
