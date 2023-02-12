package Login;

import MainDriver.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login  {
      
    public ResultSet open_empolyee() throws SQLException, ClassNotFoundException {
        DBConnection ConnectDB =new DBConnection();
        String sql = "Select id,pass,position from users where position = 'employee' and id=? and pass = ? ";
        PreparedStatement pst =ConnectDB.conn.prepareStatement(sql);
        pst.setString(1, LoginForm.loginid.getText());
        pst.setString(2, LoginForm.password.getText());
        ResultSet rs = pst.executeQuery();
        return rs;
    }

    public ResultSet open_team_manager() throws SQLException, ClassNotFoundException {
        DBConnection ConnectDB =new DBConnection();
        String sql = "Select id,pass,position from users where position = 'team leader' and id=? and pass = ? ";
        PreparedStatement pst = ConnectDB.conn.prepareStatement(sql);
        pst.setString(1, LoginForm.loginid.getText());
        pst.setString(2, LoginForm.password.getText());
        ResultSet rs = pst.executeQuery();
        return rs;

    }

    public ResultSet open_progect_manager() throws SQLException, ClassNotFoundException {
       DBConnection ConnectDB=new DBConnection();
        String sql = "Select id,pass,position from users where position = 'project manger' and id=? and pass = ? ";
        PreparedStatement pst = ConnectDB.conn.prepareStatement(sql);
        pst.setString(1, LoginForm.loginid.getText());
        pst.setString(2, LoginForm.password.getText());
        ResultSet rs = pst.executeQuery();
        return rs;

    }

    public ResultSet open_admin() throws SQLException, ClassNotFoundException {
        DBConnection ConnectDB=new DBConnection();
        String sql = "Select id,pass from Admin where   id=? and pass = ? ";
        PreparedStatement pst = ConnectDB.conn.prepareStatement(sql);
        pst.setString(1, LoginForm.loginid.getText());
        pst.setString(2, LoginForm.password.getText());
        ResultSet rs = pst.executeQuery();
        return rs;

    }

}
