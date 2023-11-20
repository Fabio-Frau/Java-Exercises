import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {

    public static String filePath = "D:\\FABIO\\INFORMATICA\\Develhope\\Java\\Java-Exercises\\Assigned\\Exercise 8-3\\Solution\\src\\credentials.txt";

    public static void main(String[] args) {

        ArrayList<String> surnames = printStudents();
        System.out.println("Surnames: ");
        System.out.println(surnames);

    }

    public static ArrayList<String> printStudents() {
        try (Connection conn = MySQLJDBCUtil.getConnection(filePath)) {

            Statement statement = conn.createStatement();
            String selectStudents = "SELECT * FROM students;";
            ResultSet result = statement.executeQuery(selectStudents);
            ArrayList<String> surnames = new ArrayList<>();

            while (result.next()) {

                surnames.add(result.getString("last_name"));
                System.out.println(
                        result.getString("last_name") + " " +
                        result.getString("first_name")
                );
            }

            return surnames;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
