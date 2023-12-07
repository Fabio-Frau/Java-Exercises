import java.util.ArrayList;

public class RimessaBarche {

    private ArrayList<Barca> barche;
    private String nome;

    public RimessaBarche(ArrayList<Barca> barche, String nome) {
        this.barche = barche;
        this.nome = nome;
    }

    public ArrayList<Barca> getBarche() {
        return barche;
    }

    public void setBarche(ArrayList<Barca> barche) {
        this.barche = barche;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Barca> aggiungiBarca(Barca barca) {
        if( this.barche.isEmpty()) {
            this.barche.add(barca);
            return this.barche;
        }

        if(!checkBarcaInRimessa(barca)) {
            this.barche.add(barca);
            return  this.barche;
        } else {
            return null;
        }


    }

    public boolean checkBarcaInRimessa(Barca barca) {
        for(Barca b : this.barche) {
            if (b.getId() == barca.getId())
                return true;
        }
        return false;
    }

    public ArrayList<Barca> rimuoviBarca(Barca barca) {
        if(this.barche.isEmpty()) {
            return null;
        }

        for(Barca b : this.barche) {
            if(b.getId() == barca.getId()) {
                this.barche.remove(barca);
                return this.barche;
            }
        }

        return null;
    }

    public void stampaBarche() {
        for(Barca barca : this.barche) {
            System.out.println("ID: " + barca.getId() + " Nome: " + barca.getNome() + " Descrizione: " + barca.getDescrizione());
        }
    }

}
