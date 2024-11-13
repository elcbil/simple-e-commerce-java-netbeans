package ecommerce;
import java.sql.*;

public class DBConnection {
    
    static final String DB_URL = "jdbc:mysql://localhost/demo";
    static final String USER = "root";
    static final String PASS = "bilabil";
    
    public static Connection ConnectDB(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            return conn;
        } catch (Exception ex){
            System.out.println("There were error while connecting to DB.");
            return null;
        }
    }
    
}
