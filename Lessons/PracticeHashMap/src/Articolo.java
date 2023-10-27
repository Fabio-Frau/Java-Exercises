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
        if (!Objects.equals(nome, articolo.nome)) return false;
        return Objects.equals(prezzo, articolo.prezzo);

    }

    @Override
    public int hashCode() {
        int result = nome != null ? nome.hashCode() : 0;
        result = 31 * result + ( prezzo != null ? prezzo.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Articolo{" +
                "nome='" + nome + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }
}
