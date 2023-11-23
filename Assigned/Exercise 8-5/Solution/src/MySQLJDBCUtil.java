import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

    public class MySQLJDBCUtil {



        public static Connection getConnection(String url, String user, String password) throws SQLException {

            Connection conn = null;
            conn = DriverManager.getConnection(url, user, password);
            return conn;

        }
    }


