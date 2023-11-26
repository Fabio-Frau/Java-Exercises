import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static String DB_URL = "jdbc:mysql://localhost:3306/world";
    public static String USER = "root";
    public static String PASSWORD = "Nerissa3091?";


    public static void main(String[] args) {


        try {

            Statement statement = createStatementForDb();
            String q1 = "SELECT * FROM city LIMIT 10";
            ResultSet rs = statement.executeQuery(q1);
            ArrayList<City> cities = dataMapper(rs);

            for (City city : cities) {
                System.out.println(city);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static Statement createStatementForDb() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            return conn.createStatement();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<City> dataMapper(ResultSet rs) throws SQLException {
        ArrayList<City> cities = new ArrayList<>();

        while(rs.next()) {
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
