import java.util.Objects;

public class Articolo {

    public Articolo(String nome, Double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public String nome;
    public Double prezzo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Articolo articolo = (Articolo) o;
        return Objects.equals(nome, articolo.nome) && Objects.equals(prezzo, articolo.prezzo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, prezzo);
    }

    @Override
    public String toString() {
        return "Articolo{" +
                "nome='" + nome + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }
}
