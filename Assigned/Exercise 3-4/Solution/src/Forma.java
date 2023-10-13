public abstract class Forma {

    protected String nome;

    public Forma()  {
        setNome();
    }

    public abstract void calcolaArea();

    public String getNome() {
        return nome;
    }

    public void setNome() {
        this.nome = "Forma";
    }
}
