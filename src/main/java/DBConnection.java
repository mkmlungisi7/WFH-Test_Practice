import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static Connection connect() throws ClassNotFoundException{
        String databaseURL = "jdbc:mysql://localhost:3306/test";//wait....isnt it @localhost?
        String user = "root";
        String password = "Cmd.123456";
        String driverName = "com.mysql.jdbc.Driver";
        Connection conn = null;
        try {


            conn = DriverManager.getConnection(databaseURL, user, password);
            if (conn != null) {
                System.out.println("Connected to the database");
            }


        } catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();

        }
        return conn;
    }
}
