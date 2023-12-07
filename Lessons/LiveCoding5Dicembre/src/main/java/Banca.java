import java.math.BigDecimal;
import java.util.ArrayList;

public class Banca {

    private String nome;
    ArrayList<ContoBancario> conti;
    private int maxConti;

    public Banca(String nome, ArrayList<ContoBancario> conti, int maxConti) {
        this.nome = nome;
        this.conti = conti;
        this.maxConti = maxConti;
    }

    public ArrayList<ContoBancario> aggiungiConto(ContoBancario conto) {
        if ( this.conti.size() < maxConti) {
            this.conti.add(conto);
            return this.conti;
        } else {
            return null;
        }
    }

    public void visualizzaConti() {
        for (ContoBancario conto : this.conti) {
            System.out.println(conto.getIban() + " " + conto.getSaldo());
        }
    }

    public BigDecimal saldoTotale() {
        BigDecimal sum = BigDecimal.ZERO;
        for(ContoBancario conto : this.conti) {
            sum = sum.add(conto.getSaldo());
        }
        return sum;
    }




}
