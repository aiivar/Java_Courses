import java.sql.*;

public class TestDatabase {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost/Products_db?user=postgres&password=postgres";
        Connection c = DriverManager.getConnection(url);
        Statement s = c.createStatement();
        ResultSet rs = s.executeQuery("SELECT * FROM \"user\"");
        while (rs.next()) {
            int id = rs.getInt("id");
            String username = rs.getString("username");
            String password = rs.getString("password");
            System.out.println(id + " " + username + " " + password);
        }
    }
}