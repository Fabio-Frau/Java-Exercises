package org.example;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
//            ArrayList<String> cities = new ArrayList<>(Arrays.asList("Napoli", "Firenze", "Roma"));
//            System.out.println(DbManager.getCityDetails(cities));

            Studente s = new Studente("Luca", "Di Grigoli");
            Studente s1 = new Studente("Fabio", "Frau");
            Studente s2 = new Studente("Andrea", "Lirosi");
            Studente s3 = new Studente("Pietro", "Di Giovanni");
            ArrayList<Studente> studenti = new ArrayList<>(Arrays.asList(s, s1, s2, s3));

            DbManager.addStudents(studenti);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

