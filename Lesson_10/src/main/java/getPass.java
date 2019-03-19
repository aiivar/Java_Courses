import soco.MyConnector;

import java.sql.*;
import java.util.Scanner;
import static soco.MyConnector.*;

/**
 * Created by roi on 3/19/2019.
 */
public class getPass {
    public static void main(String[] args) throws SQLException {

        Statement s = getConnection();
        System.out.println("Insert username: ");
        Scanner sc = new Scanner(System.in);
        String username=sc.nextLine();

        String query = "SELECT password from \"user\" "+"WHERE username='"+username+"'";
        ResultSet rs = s.executeQuery(query);
        boolean notEm = rs.next();
        if (notEm){
            System.out.println(rs.getString("password"));
        }
        else {
            System.out.println("This user doesnt exist");
        }
    }
}
