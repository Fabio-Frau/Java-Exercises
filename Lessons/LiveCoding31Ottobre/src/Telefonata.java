import java.time.OffsetDateTime;

public class Telefonata {

    private int numEntrata;
    private int numUscita;
    private OffsetDateTime data;
    private int durata;

    public Telefonata(int numEntrata, int numUscita, OffsetDateTime data, int durata) {
        this.numEntrata = numEntrata;
        this.numUscita = numUscita;
        this.data = data;
        this.durata = durata;
    }

    public int getNumEntrata() {
        return numEntrata;
    }

    public int getNumUscita() {
        return numUscita;
    }

    public OffsetDateTime getData() {
        return data;
    }

    public int getDurata() {
        return durata;
    }

    @Override
    public String toString() {
        return "Telefonata{" +
                "numEntrata=" + numEntrata +
                ", numUscita=" + numUscita +
                ", data=" + data +
                ", durata=" + durata +
                '}';
    }
}
