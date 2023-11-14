import java.util.ArrayList;

public class Azienda {

    private ArrayList<Lavoratore> lavoraotri;

    public Azienda(ArrayList<Lavoratore> lavoraotri) {
        this.lavoraotri = lavoraotri;
    }

    public ArrayList<Lavoratore> getLavoraotri() {
        return lavoraotri;
    }

    public void setLavoraotri(ArrayList<Lavoratore> lavoraotri) {
        this.lavoraotri = lavoraotri;
    }
}
