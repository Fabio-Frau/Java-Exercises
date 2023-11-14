import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.time.OffsetDateTime;
import java.util.ArrayList;

public class MyJDBC {

    public static void main(String[] args)  {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc-video","Fabio", "Nerissa3091?" );

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from people");

            while(resultSet.next()) {
                System.out.println(resultSet.getString("firstname"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

       
    }

}
