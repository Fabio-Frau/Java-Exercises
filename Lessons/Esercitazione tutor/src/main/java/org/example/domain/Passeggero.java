package org.example.domain;

enum TipoDocumento {
    PATENTE,
    CARTA_IDENTITA,
    PASSAPORTO
}

public class Passeggero {
    String id;
    String nome;
    String cognome;
    String numDocumento;
    TipoDocumento tipoDocumento;
    String email;

    public Passeggero(String id, String nome, String cognome, String numDocumento, TipoDocumento tipoDocumento, String email) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.numDocumento = numDocumento;
        this.tipoDocumento = tipoDocumento;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
