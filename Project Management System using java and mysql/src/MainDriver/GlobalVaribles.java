
package MainDriver;
import Login.LoginForm;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


public class GlobalVaribles {
    
public  int LoginId = Integer.parseInt(LoginForm.loginid.getText());
public  int LoginPassword = Integer.parseInt(LoginForm.password.getText());
public  DefaultTableModel Table= new DefaultTableModel();
public  Connection conn;
public  Statement Statement;  
}
