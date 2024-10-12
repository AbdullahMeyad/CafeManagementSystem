package User;

import java.sql.*;

public class DbConnection {
    static private String url = "jdbc:mysql://sql12.freesqldatabase.com	:3306/sql12707531";
    static private String id = "sql12707531";
    static private String pass = "eWKaGtvyr1";
    static public Connection connection;

    static {
        try {
            connection = DriverManager.getConnection(url, id, pass);
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database!");
            e.printStackTrace();
        }
    }
}
