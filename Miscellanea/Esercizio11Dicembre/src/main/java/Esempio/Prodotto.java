package Esempio;

import java.math.BigDecimal;

public class Prodotto {

    private String nome;
    private BigDecimal prezzo;


    public Prodotto(String nome, BigDecimal prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }


    @Override
    public String toString() {
        return "Esempio.Prodotto{" +
                "nome='" + nome + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }
}
