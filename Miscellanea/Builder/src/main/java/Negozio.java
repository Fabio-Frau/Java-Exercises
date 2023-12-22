public class Negozio {

    private int codice;
    private String proprietario;
    private String indirizzo;
    private boolean inCentroCommerciale;

    private Negozio() {}

    public static class Builder {

        private int codice;
        private String proprietario;
        private String indirizzo;
        private boolean inCentroCommerciale;

        public Builder(int codice) {
            this.codice = codice;
            this.proprietario = "";
            this.indirizzo = "";
            this.inCentroCommerciale = false;
        }

        public Negozio build() {
            Negozio negozio = new Negozio();
            negozio.codice = this.codice;
            negozio.proprietario = this.proprietario;
            negozio.indirizzo = this.indirizzo;
            negozio.inCentroCommerciale = this.inCentroCommerciale;
            return negozio;
        }

        public Builder setProprietario(String proprietario) {
            this.proprietario = proprietario;
            return this;
        }

        public Builder setIndirizzo(String indirizzo) {
            this.indirizzo = indirizzo;
            return this;
        }

        public Builder setInCentroCommerciale(boolean inCentroCommerciale) {
            this.inCentroCommerciale = inCentroCommerciale;
            return this;
        }
    }


}
