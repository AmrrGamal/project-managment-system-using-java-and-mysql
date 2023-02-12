package MainDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection extends GlobalVaribles {
    
    public DBConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/finalproject ","root","");
        Statement = conn.createStatement();
        System.out.println("ssucses");
       
    }
    public void CloseDB() throws SQLException
    {
        Statement.close();
        conn.close(); 
    }

}
