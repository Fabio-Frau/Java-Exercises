public class Forma {

    protected String nome;

    public Forma()  {
        setNome();
    }

    public void calcolaArea(){
        System.out.println("L'area di una forma generica è indefinita");
    }

    public String getNome() {
        return nome;
    }

    public void setNome() {
        this.nome = "Forma";
    }
}
