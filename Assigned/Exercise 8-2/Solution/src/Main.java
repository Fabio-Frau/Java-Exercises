import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static String filePath ="D:\\FABIO\\INFORMATICA\\Develhope\\Java\\Java-Exercises\\Assigned\\Exercise 8-2\\Solution\\src\\credentials.txt";

    public static void main(String[] args) {

        tryConnection();
        createStudentsTable();
        populateStudentsTable();
        printStudents();
    }

    public static void printStudents() {
        try (Connection conn = MySQLJDBCUtil.getConnection(filePath)) {
            Statement statement = conn.createStatement();
            String selectStudents = "SELECT * FROM students;";
            ResultSet result = statement.executeQuery(selectStudents);

            while(result.next()) {
                System.out.println(
                        result.getString("student_id") + " " +
                        result.getString("last_name") + " " +
                        result.getString("first_name"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void populateStudentsTable() {
        try (Connection conn = MySQLJDBCUtil.getConnection(filePath)) {
            Statement statement = conn.createStatement();
            String insertStudents = "INSERT INTO students (first_name, last_name) \n" +
                    "VALUES \n" +
                    "\t('Gandalf', 'Il Grigio'),\n" +
                    "\t('Aragorn', 'Grampasso'),\n" +
                    "\t('Legolas', 'Verdefoglia'),\n" +
                    "\t('Gimli',  'Figlio di Gloin');";
            int result = statement.executeUpdate(insertStudents);
            System.out.println("Rows affected " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void tryConnection() {
        try( Connection conn = MySQLJDBCUtil.getConnection(filePath)) {
            System.out.println(String.format("Connected to database %s "
                    + "successfully.", conn.getCatalog()));
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static void createStudentsTable() {
        try (Connection conn = MySQLJDBCUtil.getConnection(filePath)) {
            Statement statement = conn.createStatement();
            String create = "CREATE TABLE IF NOT EXISTS students (\n" +
                    "\tstudent_id INTEGER(10) NOT NULL AUTO_INCREMENT,\n" +
                    "\tlast_name VARCHAR(30),\n" +
                    "\tfirst_name VARCHAR(30),\n" +
                    "\tPRIMARY KEY (student_id)\n" +
                    ");";
            int result = statement.executeUpdate(create);
            System.out.println("Rows affected " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
