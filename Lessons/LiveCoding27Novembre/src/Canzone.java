import java.time.Duration;

public class Canzone {

    private String nome;
    private String cantante;
    private Duration durata;

    public Canzone(String nome, String cantante, Duration durata) {
        this.nome = nome;
        this.cantante = cantante;
        this.durata = durata;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public Duration getDurata() {
        return durata;
    }

    public void setDurata(Duration durata) {
        this.durata = durata;
    }
}
