import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;

public class ToDoList {

    private ArrayList<Task> listaCompiti;

    public ToDoList(ArrayList<Task> listaCompiti) {
        this.listaCompiti = listaCompiti;
    }

    public boolean verificaPresenza(Task task) {
        return this.listaCompiti.contains(task);
    }

    public ArrayList<Task> aggiungiTask(Task task) {
        if (!verificaPresenza(task)) {
            this.listaCompiti.add(task);
        } else {
            throw new RuntimeException("Task già presente");
        }
        return this.listaCompiti;
    }

    public ArrayList<Task> rimuoviTask(Task task) {
        if (verificaPresenza(task)) {
            this.listaCompiti.remove(task);
        } else {
            throw new RuntimeException("Il task non è presente");
        }
        return this.listaCompiti;
    }

    public void stampaListaCompiti() {
        if(this.listaCompiti.isEmpty()) {
            System.out.println("La lista è vuota");
        } else {
            for (Task t : this.listaCompiti) {
                System.out.println(t);
            }
        }
    }

    public Task settaCompitoCompletato(Task task) {
        if(verificaPresenza(task)) {
            for(Task t : this.listaCompiti) {
                if(t.equals(task)) {
                    if (task.isStato()) {
                        return task;
                    } else {
                        task.setStato(true);
                        return task;
                    }
                }
            }
         }

        throw new RuntimeException("Task non presente");


    }


    public void cercaPerDescrizione(String descrizione) {
        boolean match = false;
        for(Task task : this.listaCompiti) {
            if(task.getDescrizione().equals(descrizione)) {
                System.out.println(task);
                match = true;
            }
        }

        if (!match) {
            System.out.println("Task non trovato");
        }

    }

    public ArrayList<Task> scadenzaxGiorni(OffsetDateTime start, OffsetDateTime end) {
        ArrayList<Task> compitiScadenza = new ArrayList<>();

        for(Task task : this.listaCompiti) {
            if (task.getScadenza().isAfter(start) && task.getScadenza().isBefore(end)) {
                compitiScadenza.add(task);
            }
        }

        return compitiScadenza;
    }

    public void stampaScadenze(ArrayList<Task> compitiInScadenza) {
        for(Task task : compitiInScadenza) {
            System.out.println(task.getDescrizione() + ": " + task.getScadenza().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
        }
    }

}


/*Visualizzare il dettaglio di un compito identificato attraverso un parametro specifico.
Visualizzare i compiti in scadenza nei prossimi 2 giorni formattando la data in un formato comprensibile all’utente.
Partendo dall’ultimo punto bonus “Visualizzare i compiti in scadenza nei prossimi 2 giorni formattando la data in un formato comprensibile all’utente” aggiungere almeno 2 test che provino il funzionamento del metodo.*/


/*La classe TodoList dovrebbe gestire una lista di compiti. Deve fornire le seguenti funzionalità:
Aggiungere un nuovo compito alla lista.
Rimuovere un compito dalla lista.
Visualizzare l'elenco completo dei compiti.
Contrassegnare un compito specifico come completato.
Utilizzare il main per testare che tutte le funzionalità eseguano i propri compiti.*/
