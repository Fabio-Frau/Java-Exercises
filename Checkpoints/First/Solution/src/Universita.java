

public class Universita {

    private Docente[] docenti;

    public Universita(Docente[] docenti) {
        this.docenti = docenti;
    }

    public Docente[] getDocenti() {
        return docenti;
    }

    public void setDocenti(Docente[] docenti) {
        this.docenti = docenti;
    }

    public int youngestDoc() {

        int minAge = this.docenti[0].getEta();

        for ( int i = 1; i< this.docenti.length; i++) {
            if (docenti[i].getEta() < minAge) {
                minAge = docenti[i].getEta();
            }
        }

        return minAge;
    }
}
