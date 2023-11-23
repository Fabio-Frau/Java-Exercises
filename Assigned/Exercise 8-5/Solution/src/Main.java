import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {

    private static String url = "jdbc:mysql://localhost:3306/newdb";
    private static String user = "developer";
    private static String password = "Nerissa3091?";


    public static void main(String[] args) {

        createGermanyView();
        createItalyView();

        try {
            ArrayList<Student> germanStudents = getGermanStudentsFromDB();
            ArrayList<Student> italianStudents = getItalianStudentsFromDB();

            System.out.println("The students from Germany are: ");
            for (Student s : germanStudents) {
                System.out.println(s.getName() + " " + s.getSurname());
            }
            System.out.println();
            System.out.println("The students from Italy are: ");
            for (Student s : italianStudents) {
                System.out.println(s.getName() + " " + s.getSurname());
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static ArrayList<Student> getGermanStudentsFromDB() throws Exception{
        try (Connection conn = MySQLJDBCUtil.getConnection(url, user, password)) {

            Statement statement = conn.createStatement();
            String getGermanStudents = "SELECT * FROM german_students;";
            ResultSet resultSet= statement.executeQuery(getGermanStudents);

            ArrayList<Student> germanStudents = new ArrayList<>();

            while(resultSet.next()) {
                germanStudents.add(new Student(resultSet.getString("name"), resultSet.getString("surname")));
            }

            return germanStudents;

        } catch (Exception e) {
            throw e;
        }
    }

    public static ArrayList<Student> getItalianStudentsFromDB() throws Exception{
        try (Connection conn = MySQLJDBCUtil.getConnection(url, user, password)) {

            Statement statement = conn.createStatement();
            String getItalianStudents = "SELECT * FROM italian_students;";
            ResultSet resultSet= statement.executeQuery(getItalianStudents);

            ArrayList<Student> italianStudents = new ArrayList<>();

            while(resultSet.next()) {
                italianStudents.add(new Student(resultSet.getString("name"), resultSet.getString("surname")));
            }

            return italianStudents;

        } catch (Exception e) {
            throw e;
        }
    }

    public static void createGermanyView() {
        try (Connection conn = MySQLJDBCUtil.getConnection(url, user, password)) {

            Statement statement = conn.createStatement();
            String germanView = "CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER" +
                    " VIEW `german_students` AS SELECT first_name AS name, last_name AS surname FROM students WHERE country = 'Germany'" +
                    " WITH CASCADED CHECK OPTION;";

            statement.execute(germanView);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void createItalyView() {
        try (Connection conn = MySQLJDBCUtil.getConnection(url, user, password)) {

            Statement statement = conn.createStatement();
            String italyView = "CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER" +
                    " VIEW `italian_students` AS SELECT first_name AS name, last_name AS surname FROM students WHERE country = 'Italy'" +
                    " WITH CASCADED CHECK OPTION;";

            statement.execute(italyView);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }






}
