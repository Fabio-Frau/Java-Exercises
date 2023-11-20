import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.time.OffsetDateTime;
import java.util.ArrayList;

public class MyJDBC {

    public static void main(String[] args)  {

        try( Connection conn = MySQLJDBCUtil.getConnection()) {
            System.out.println(String.format("Connected to database %s "
                    + "successfully.", conn.getCatalog()));
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

//        try {
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc-video","Fabio", "Nerissa3091?" );
//
//            Statement statement = connection.createStatement();
//
//            ResultSet resultSet = statement.executeQuery("select * from people");
//
//            while(resultSet.next()) {
//                System.out.println(resultSet.getString("firstname"));
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

       
    }

}
