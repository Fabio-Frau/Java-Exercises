import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

    public class MySQLJDBCUtil {

        /**Get database connection
         * @return Connection
         * @throws SQLException
         */

        public static Connection getConnection(String filePath) throws SQLException {
            Connection conn = null;

            try (FileInputStream f = new FileInputStream(filePath)) {

                Properties pros = new Properties();
                pros.load(f);

                String url = pros.getProperty("url");
                String user = pros.getProperty("user");
                String password = pros.getProperty("password");


                conn = DriverManager.getConnection(url, user, password);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            return conn;
        }
    }


