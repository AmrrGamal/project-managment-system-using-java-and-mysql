package Admin_Module;

import MainDriver.DBConnection;
import MainDriver.GlobalVaribles;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Admin extends GlobalVaribles implements Admin_interface {

    
    @Override
    public void AddUsers() {
        try {
            int id = Integer.parseInt(Add_user.id.getText());
            String Name = Add_user.name.getText();
            int Pass = Integer.parseInt(Add_user.pass.getText());
            float Salary = Float.parseFloat(Add_user.salary.getText());
            String Poss = Add_user.poss.getSelectedItem().toString();

            DBConnection ConnectDB = new DBConnection();

            String sql = "insert into users values(" + id + ",'" + Name + "'," + Pass + "," + Salary + ",'" + Poss + "')";
            ConnectDB.Statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Done", "ADD User ", JOptionPane.INFORMATION_MESSAGE);
            ConnectDB.CloseDB();
        } catch (SQLException ex) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    @Override
    public void UpdateUsers() {
        try {
            int Id = Integer.parseInt(Update.id.getText());
            float Salary = Float.parseFloat(Update.salary.getText());
            String Poss = Update.poss.getSelectedItem().toString();

            DBConnection ConnectDB = new DBConnection();

            String sql = "update users set salary=" + Salary + ""
                    + ",position='" + Poss + "'"
                    + "where id=" + Id + "";
            ConnectDB.Statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Done", "Update User ", JOptionPane.INFORMATION_MESSAGE);
            ConnectDB.CloseDB();
        } catch (SQLException ex) {
        } catch (ClassNotFoundException ex) {
        }
    }

    @Override
    public void Viewusers() {

        Table.addColumn("ID");
        Table.addColumn("Name");
        Table.addColumn("Salary");
        Table.addColumn("Position");
        DeleteUsers.view.setModel(Table);
        try {

            DBConnection ConnectDB = new DBConnection();

            String sql = "select id,name,salary,position from users";
            ResultSet result = ConnectDB.Statement.executeQuery(sql);

            while (result.next()) {
                Table.addRow(new String[]{
                    String.valueOf(result.getInt(1)),
                    result.getString(2),
                    String.valueOf(result.getFloat(3)),
                    result.getString(4)
                });
            }

            ConnectDB.CloseDB();

        } catch (SQLException ex) {
        } catch (ClassNotFoundException ex) {
        }
    }

    @Override
    public void Viewprojects() {

        Table.addColumn("Project number");
        Table.addColumn("Progress");
        Table.addColumn("Project name");
        AllProjects.view.setModel(Table);
        try {

            DBConnection ConnectDB = new DBConnection();

            String sql = "select p_num,prograss,name from project";
            ResultSet result = ConnectDB.Statement.executeQuery(sql);

            while (result.next()) {
                Table.addRow(new String[]{String.valueOf(result.getInt(1)), result.getString(2), result.getString(3)});
            }
            ConnectDB.CloseDB();

        } catch (SQLException ex) {
        } catch (ClassNotFoundException ex) {
        }
    }

    @Override
    public void deleteuser() {
        try {

            DBConnection ConnectDB = new DBConnection();

            int row = DeleteUsers.view.getSelectedRow();
            int id = Integer.parseInt(DeleteUsers.view.getValueAt(row, 0).toString());
            String sql = "delete from users where id = " + id;
            ConnectDB.Statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Done", "Delete User ", JOptionPane.INFORMATION_MESSAGE);
            Viewusers();
            ConnectDB.CloseDB();
        } catch (SQLException ex) {

        } catch (ClassNotFoundException ex) {
        }

    }
    
    public void Viewusers2() {

        Table.addColumn("ID");
        Table.addColumn("Name");
        Table.addColumn("Salary");
        Table.addColumn("Position");
        ViewUser.view.setModel(Table);
        try {

            DBConnection ConnectDB = new DBConnection();

            String sql = "select id,name,salary,position from users";
            ResultSet result = ConnectDB.Statement.executeQuery(sql);

            while (result.next()) {
                Table.addRow(new String[]{
                    String.valueOf(result.getInt(1)),
                    result.getString(2),
                    String.valueOf(result.getFloat(3)),
                    result.getString(4)
                });
            }

            ConnectDB.CloseDB();

        } catch (SQLException ex) {
        } catch (ClassNotFoundException ex) {
        }
    }

 
    
    
    
    
    
    
    
    
    
    
}
