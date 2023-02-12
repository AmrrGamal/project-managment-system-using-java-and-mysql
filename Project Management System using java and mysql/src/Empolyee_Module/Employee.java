package Empolyee_Module;

import MainDriver.DBConnection;
import MainDriver.GlobalVaribles;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.showMessageDialog;


public class Employee extends GlobalVaribles implements Employee_interface {

    

    @Override
    public void UploadFinishedTasks() {
        try {
            String task = Uploadtask.taskname.getText();
            int projectnum = Integer.parseInt(Uploadtask.pnum.getText());
            DBConnection ConnectDB = new DBConnection();

            String sql = "update tasks set state ='complete' "
                    + "where id= '" + LoginId + "'"
                    + "and tname = '" + task + "'"
                    + "and pnum = '" + projectnum + "'";
            ConnectDB.Statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Done", "Upload sucssefuly", JOptionPane.INFORMATION_MESSAGE);
            ConnectDB.CloseDB();
        } catch (SQLException ex) {
        } catch (ClassNotFoundException ex) {
        }
    }

    @Override
    public void EnterWork() {

        try {
             DBConnection ConnectDB = new DBConnection();

            String sql = "insert into attendance values('" + java.time.LocalTime.now() + "','00:00:00','" + java.time.LocalDate.now() + "'," + LoginId + ")";
            ConnectDB.Statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Start your work", "Enter ", JOptionPane.INFORMATION_MESSAGE);
            ConnectDB.CloseDB();
        } catch (SQLException ex) {
        } catch (ClassNotFoundException ex) {
        }

    }

    @Override
    public void EndWork() {
        try {
            DBConnection ConnectDB = new DBConnection();

            String sql = "update attendance set exit_time ='" + java.time.LocalTime.now() + "'"
                    + "where id= '" + LoginId + "'"
                    + "and datee = '" + java.time.LocalDate.now() + "'and exit_time='00:00:00' ";      // WILL may by a problem in TM
            ConnectDB.Statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Finish,Enjoy your life ", "Exit ", JOptionPane.INFORMATION_MESSAGE);
            ConnectDB.CloseDB();
        } catch (SQLException ex) {
        } catch (ClassNotFoundException ex) {
        }
    }

    @Override
    public void RequestVacation() {

        try {
            DBConnection ConnectDB = new DBConnection();
 
            String from1 = EmpolyeeRequestVacation.from1.getText();
            String to = EmpolyeeRequestVacation.to.getText();
            String s = "pending";

            String sql = "insert into vaction values(" + LoginId + ",'" + from1 + "','" + to + "','" + s + "')";
            ConnectDB.Statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Done", "Requestvacatin ", JOptionPane.INFORMATION_MESSAGE);
            ConnectDB.CloseDB();
        } catch (SQLException ex) {
        } catch (ClassNotFoundException ex) {
        }
    }

    @Override
    public void vacationstate() {
        

        Table.addColumn("from");
        Table.addColumn("to");
        Table.addColumn("state");
        Vacationstate.jTable1.setModel(Table);

        try {

            DBConnection ConnectDB = new DBConnection();

            String sql = "select from_d,to_d,state from vaction where id =" + LoginId;
            ResultSet result = ConnectDB.Statement.executeQuery(sql);
            while (result.next()) {
                Table.addRow(new String[]{
                    result.getString(1),
                    result.getString(2),
                    result.getString(3)
                });
            }
            ConnectDB.CloseDB();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
        }
    }

    @Override
    public void viewpenalties() {
        try {
            DBConnection ConnectDB = new DBConnection();

            String sql = "select id ,p from penalties where id =" + LoginId;
            ResultSet result = ConnectDB.Statement.executeQuery(sql);
            while (result.next()) {
                String p = result.getString("p");
                ViewPenalties.jTextArea1.setText(p + "\n");
            }
        } catch (SQLException ex) {
        } catch (ClassNotFoundException ex) {
        }

    }

    @Override
    public void MyTasks() {
       
        Table.addColumn("Task Name");
        Table.addColumn("Project Number");
        mytasks.jTable1.setModel(Table);
        try {
            DBConnection ConnectDB = new DBConnection();

            String sql = "select tname,pnum from tasks where id =' " + LoginId + "'and state ='complete' ";
            ResultSet result = ConnectDB.Statement.executeQuery(sql);
            while (result.next()) {
                Table.addRow(new String[]{
                    result.getString(1),
                    String.valueOf(result.getInt(2))
                });
            }
            ConnectDB.CloseDB();
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void AssignedTask() {
        
        Table.addColumn("Task Name");
        Table.addColumn("Project Number");
        Assigentask.jTable1.setModel(Table);
        try {
            DBConnection ConnectDB = new DBConnection();

            String sql = "select tname , pnum from tasks where id = " + LoginId + " and state = 'uncomplete' ";
            ResultSet result = ConnectDB.Statement.executeQuery(sql);
            while (result.next()) {
                Table.addRow(new String[]{
                    result.getString(1),   
                    String.valueOf(result.getInt(2))
                });
            }
            ConnectDB.CloseDB();
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

}
