import java.util.Random;

public class User {

    String id, username, nome, cognome, email;
    Status status;
    LoginType loginType;
    enum Status {
        ONLINE,
        OFFLINE
    }

    enum LoginType {
        FACEBOOK,
        GOOGLE,
        APPLE
    }

    public User(String username, String nome, String cognome, String email, Status status, LoginType loginType) {

        Random r = new Random();

        this.id = String.valueOf(r.nextInt());
        this.username = username;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.status = status;
        this.loginType = loginType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}



class Google extends User {
    public Google(String username, String nome, String cognome, String email, Status status) {
        super( username,  nome,  cognome, email,  status, LoginType.GOOGLE);

    }


}