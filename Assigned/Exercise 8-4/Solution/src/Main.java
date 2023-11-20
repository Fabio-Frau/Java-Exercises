import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {

    public static String filePath = "D:\\FABIO\\INFORMATICA\\Develhope\\Java\\Java-Exercises\\Assigned\\Exercise 8-4\\Solution\\src\\credentials.txt";

    public static void main(String[] args) {
        addCountryColumn();
        updateCountryColumn();
        printStudent();

    }

    public static void addCountryColumn() {
        try (Connection conn = MySQLJDBCUtil.getConnection(filePath)) {

            Statement statement = conn.createStatement();
            String addCountry = "ALTER TABLE students " +
                                "ADD COLUMN country VARCHAR(30);";
            statement.execute(addCountry);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void updateCountryColumn() {
        try (Connection conn = MySQLJDBCUtil.getConnection(filePath)) {

            Statement statement = conn.createStatement();

            String updateGandalf = "UPDATE students " +
                                    "SET country = 'Italy' " +
                                    "WHERE first_name = 'Gandalf' AND last_name = 'Il Grigio';";
            statement.executeUpdate(updateGandalf);

            String updateAragorn = "UPDATE students " +
                    "SET country = 'Italy' " +
                    "WHERE first_name = 'Aragorn' AND last_name = 'Grampasso';";
            statement.executeUpdate(updateAragorn);

            String updateLegolas= "UPDATE students " +
                    "SET country = 'Germany' " +
                    "WHERE first_name = 'Legolas' AND last_name = 'Verdefoglia';";
            statement.executeUpdate(updateLegolas);

            String updateGimli = "UPDATE students " +
                    "SET country = 'Germany' " +
                    "WHERE first_name = 'Gimli' AND last_name = 'Figlio di Gloin';";
            statement.executeUpdate(updateGimli);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void printStudent() {
        try (Connection conn = MySQLJDBCUtil.getConnection(filePath)) {

            Statement statement = conn.createStatement();
           ResultSet result = statement.executeQuery("SELECT * FROM students");

           while(result.next()) {
               System.out.println(result.getString("student_id") + " " +
                                  result.getString("first_name") + " " +
                                  result.getString("last_name") + " " +
                                  result.getString("country"));
           }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
