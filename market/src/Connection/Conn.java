package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {

    private static final String url = "jdbc:mysql://localhost:3306/market";
    private static final String user = "root";
    private static final String password = "root";

    private static Connection conn;

    public static Connection getConnection() {
        try {
            if(conn == null) {
                conn = DriverManager.getConnection(url, user, password);
                System.out.println("You are connect");
            }
            return conn;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("No connection");
            return null;
        }
    }
}
