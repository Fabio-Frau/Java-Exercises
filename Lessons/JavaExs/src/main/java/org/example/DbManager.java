package org.example;

import java.sql.*;
import java.util.ArrayList;

public class DbManager {
    static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/world";
    static final String USER = "test_eser";
    static final String PASSWORD = "password1234";

    public static ArrayList<City> getAllCities() throws SQLException {
        String q1 = "SELECT * FROM city;";

        try (Statement statement = createStatementForDb()) {
            ResultSet rs = statement.executeQuery(q1);
            return dataMapper(rs);
        }
    }

    public static void addStudents(ArrayList<Studente> studenti) throws SQLException {
        for (Studente studente: studenti) {
            addStudent(studente);
        }
    }

    public static void addStudent(Studente s) throws SQLException {
        String q1 = "INSERT INTO Studenti (nome, cognome) VALUES ('" + s.getNome() + "', '" + s.getCognome() + "');";
        try (Statement statement = createStatementForDb()) {
            statement.execute(q1);
        }
    }

    public static ArrayList<City> getCityDetails(ArrayList<String> cities) throws SQLException {
        StringBuilder sb = new StringBuilder();
        for (String city : cities) {
            sb.append("'" + city + "',");
        }
        String q1 = "select * from city c where c.Name in (" + sb.deleteCharAt(sb.length() - 1) + ");";
        try (Statement statement = createStatementForDb()) {
            ResultSet rs = statement.executeQuery(q1);
            return dataMapper(rs);
        }
    }

    private static Statement createStatementForDb() {
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            return conn.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static ArrayList<City> dataMapper(ResultSet rs) throws SQLException {
        ArrayList<City> cities = new ArrayList<>();
        while (rs.next()) {
            City city = new City(
                    rs.getInt("ID"),
                    rs.getString("Name"),
                    rs.getString("CountryCode"),
                    rs.getString("District"),
                    rs.getInt("Population")
            );
            cities.add(city);
        }
        return cities;
    }
}
