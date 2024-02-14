import java.util.*;

public class Main {

    public static void main(String[] args) {

    String ruolo = "ATTACCANTE";

    String prova = Arrays.stream(Ruolo.values()).toString();

        for(Ruolo c : Ruolo.values())
            System.out.println(c);


        List<Ruolo> list = Collections.list(Ruolo);

    //List<String> prova = Arrays.stream(Ruolo.values().toString()).toList();

        //System.out.println(Arrays.toString(Ruolo.values()));


    }

}
