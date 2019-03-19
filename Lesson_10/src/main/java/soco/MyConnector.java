package soco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by roi on 3/19/2019.
 */
public class MyConnector {
    public static Statement getConnection() throws SQLException {
        String url = "jdbc:postgresql://localhost/Products_db?user=postgres&password=postgres";
        Connection c = DriverManager.getConnection(url);
        Statement s = c.createStatement();
        return s;
    }
}
