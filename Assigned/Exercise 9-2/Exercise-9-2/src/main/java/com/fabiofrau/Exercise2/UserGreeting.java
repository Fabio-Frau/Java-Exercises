package com.fabiofrau.Exercise2;

public class UserGreeting {
    public String nome;
    public String provincia;
    public String saluto;

    public UserGreeting(String nome, String provincia) {
        this.nome = nome;
        this.provincia = provincia;
        this.saluto = "Ciao " + nome + ", com'è il tempo in " + provincia + "?";
    }
}
