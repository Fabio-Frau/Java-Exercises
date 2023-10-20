import java.util.Random;

public class User {
    String id, username, nome, cognome, email;
    LoginType loginType;
    Status status;

    enum Status{
        ONLINE,
        OFFLINE
    }

    enum LoginType{
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
        this.loginType = loginType;
        this.status = status;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void generateCorrectUser() {
        switch (this.loginType) {
            case FACEBOOK:
                Facebook f = new Facebook(this.username, this.nome, this.cognome, this.email, this.status);
                System.out.println("Test " + f);
                break;
            case GOOGLE:
                Google g = new Google(this.username, this.nome, this.cognome, this.email, this.status);
                System.out.println("Test " + g);
                break;
            case APPLE:
                Apple a = new Apple(this.username, this.nome, this.cognome, this.email, this.status);
                System.out.println("Test " + a);
                break;
        }
    }
}


class Google extends User {
    public Google(String username, String nome, String cognome, String email, Status status) {
        super(username, nome, cognome, email, status, LoginType.GOOGLE);
    }
}

class Facebook extends User {
    public Facebook(String username, String nome, String cognome, String email, Status status) {
        super(username, nome, cognome, email, status, LoginType.FACEBOOK);
    }
}

class Apple extends User {
    public Apple(String username, String nome, String cognome, String email, Status status) {
        super(username, nome, cognome, email, status, LoginType.APPLE);
    }
}
