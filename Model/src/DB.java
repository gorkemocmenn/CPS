

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
    public  Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "CPSdataBase", "admin");
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }

}