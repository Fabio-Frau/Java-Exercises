package org.example.domain;

import java.time.OffsetDateTime;

public class Biglietto {
    private String id;
    private String cittaPartenza;
    private String cittaDestinazione;
    private OffsetDateTime dataPartenza;
    private OffsetDateTime dataArrivo;
    private String posto;
    private String gate;
    private Aeromobile aeromobile;
    private Passeggero passeggero;

    @Override
    public String toString() {
        return "Biglietto{" +
                "id='" + id + '\'' +
                ", cittaPartenza='" + cittaPartenza + '\'' +
                ", cittaDestinazione='" + cittaDestinazione + '\'' +
                ", dataPartenza=" + dataPartenza +
                ", dataArrivo=" + dataArrivo +
                ", posto='" + posto + '\'' +
                ", gate='" + gate + '\'' +
                ", aeromobile=" + aeromobile +
                ", passeggero=" + passeggero +
                '}';
    }

    public Biglietto(
            String id,
            String cittaPartenza,
            String cittaDestinazione,
            OffsetDateTime dataPartenza,
            OffsetDateTime dataArrivo,
            String posto,
            String gate,
            Aeromobile aeromobile,
            Passeggero passeggero
    ) {
        this.id = id;
        this.cittaPartenza = cittaPartenza;
        this.cittaDestinazione = cittaDestinazione;
        this.dataPartenza = dataPartenza;
        this.dataArrivo = dataArrivo;
        this.posto = posto;
        this.gate = gate;
        this.aeromobile = aeromobile;
        this.passeggero = passeggero;
    }

    public Passeggero getPasseggero() {
        return passeggero;
    }

    public void setPasseggero(Passeggero passeggero) {
        this.passeggero = passeggero;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCittaPartenza() {
        return cittaPartenza;
    }

    public void setCittaPartenza(String cittaPartenza) {
        this.cittaPartenza = cittaPartenza;
    }

    public String getCittaDestinazione() {
        return cittaDestinazione;
    }

    public void setCittaDestinazione(String cittaDestinazione) {
        this.cittaDestinazione = cittaDestinazione;
    }

    public OffsetDateTime getDataPartenza() {
        return dataPartenza;
    }

    public void setDataPartenza(OffsetDateTime dataPartenza) {
        this.dataPartenza = dataPartenza;
    }

    public OffsetDateTime getDataArrivo() {
        return dataArrivo;
    }

    public void setDataArrivo(OffsetDateTime dataArrivo) {
        this.dataArrivo = dataArrivo;
    }

    public Aeromobile getAeromobile() {
        return aeromobile;
    }

    public void setAeromobile(Aeromobile aeromobile) {
        this.aeromobile = aeromobile;
    }

    public String getPosto() {
        return posto;
    }

    public void setPosto(String posto) {
        this.posto = posto;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

}
