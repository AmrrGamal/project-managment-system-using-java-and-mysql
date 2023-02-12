package TeamManager_Module;

import Login.LoginForm;
import MainDriver.GlobalVaribles;
import MainDriver.DBConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TeamManager extends GlobalVaribles implements Team_manager_interface {

    @Override
    public void Assign_task_to_empolyee() {
        try {
            int id = Integer.parseInt(TmAssigenTasks.empid2.getText());
            String tname = TmAssigenTasks.tname.getText();
            int pnum = Integer.parseInt(TmAssigenTasks.pnum.getText());
            String state = "uncomplete";
            DBConnection ConnectDB = new DBConnection();

            String sql = "insert into tasks values(" + id + ",'" + tname + "'," + pnum + ",'" + state + "')";
            ConnectDB.Statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Done", "Assgin Task ", JOptionPane.INFORMATION_MESSAGE);
            ConnectDB.CloseDB();
        } catch (SQLException | ClassNotFoundException ex) {
        }
    }

    @Override
    public void AcceptVacation() {
        try {
            DBConnection ConnectDB = new DBConnection();

            int row = Tmvaction.vaction.getSelectedRow();
            int id = Integer.parseInt(Tmvaction.vaction.getValueAt(row, 0).toString());
            String from = Tmvaction.vaction.getValueAt(row, 1).toString();
            String to = Tmvaction.vaction.getValueAt(row, 2).toString();
            String sql = "update vaction set state ='Accept'"
                    + "where id= '" + id + "'"
                    + "and from_d = '" + from + "'"
                    + "and to_d = '" + to + "'";
            ConnectDB.Statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Done", "Accept Vaction ", JOptionPane.INFORMATION_MESSAGE);
            ConnectDB.CloseDB();
        } catch (SQLException ex) {
        } catch (ClassNotFoundException ex) {
        }
    }

    @Override
    public void RefuesVacation() {

        try {

            int row = Tmvaction.vaction.getSelectedRow();
            int Id = Integer.parseInt(Tmvaction.vaction.getValueAt(row, 0).toString());
            String from = Tmvaction.vaction.getValueAt(row, 1).toString();
            String to = Tmvaction.vaction.getValueAt(row, 2).toString();
            DBConnection ConnectDB = new DBConnection();

            String sql = "update vaction set state ='Refused' "
                    + "where id= '" + Id + "'"
                    + "and from_d = '" + from + "'"
                    + "and to_d = '" + to + "'";
            ConnectDB.Statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Done", "Refused Vaction", JOptionPane.INFORMATION_MESSAGE);
            ConnectDB.CloseDB();
        } catch (SQLException ex) {
        } catch (ClassNotFoundException ex) {
        }
    }

    @Override
    public void Empolyee_vaction() {

        Table.addColumn("id");
        Table.addColumn("from");
        Table.addColumn("to");

        Tmvaction.vaction.setModel(Table);

        try {
            DBConnection ConnectDB = new DBConnection();
            String sql = "select id,from_d,to_d from vaction where state ='pending' ";
            ConnectDB.Statement.executeQuery(sql);
            ResultSet result = ConnectDB.Statement.executeQuery(sql);

            while (result.next()) {
                Table.addRow(new String[]{
                    String.valueOf(result.getInt(1)),
                    result.getString(2),
                    result.getString(3)
                });
            }
            ConnectDB.CloseDB();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void CompleteTasks() {
        try {

            Table.addColumn("Id");
            Table.addColumn("Task Name");
            Table.addColumn("Project Number ");
            TmViewComleteTasks.jTable1.setModel(Table);
            DBConnection ConnectDB = new DBConnection();

            String sql = "select * from tasks where state='complete'";
            ResultSet result = ConnectDB.Statement.executeQuery(sql);
            while (result.next()) {
                Table.addRow(new String[]{
                    String.valueOf(result.getInt(1)),
                    result.getString(2),
                    String.valueOf(result.getInt(3))
                });
                ConnectDB.CloseDB();
            }
        } catch (SQLException | ClassNotFoundException ex) {
        }
    }

    @Override
    public void AssignedProject() {

        Table.addColumn("Project Name");
        Table.addColumn("Project Number");
        TmAssignProjectToEMP.jTable1.setModel(Table);
        try {
            DBConnection ConnectDB = new DBConnection();

            int id = Integer.parseInt(LoginForm.loginid.getText());
            String sql = "select p_num , name from project where tm_id = " + id + " ";
            ResultSet result = ConnectDB.Statement.executeQuery(sql);
            while (result.next()) {

                Table.addRow(new String[]{
                    result.getString(2),
                    String.valueOf(result.getInt(1))
                });
            }
            ConnectDB.CloseDB();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void viewReports() {

        try {
            int id = Integer.parseInt(Tmreport.empid2.getText());
            DBConnection ConnectDB = new DBConnection();

            String sql = "select report from report where id = " + id + "";
            ResultSet result = ConnectDB.Statement.executeQuery(sql);
            while (result.next()) {
                Tmreport.reports.setText(result.getString("report"));
            }
            ConnectDB.CloseDB();
        } catch (SQLException ex) {
        } catch (ClassNotFoundException ex) {
        }
    }

    @Override
    public void projectPrograss() {
        try {
            int pNum = Integer.parseInt(Tmprojectprograss.pnum.getText());
            String pop = Tmprojectprograss.prograss.getText();
            DBConnection ConnectDB = new DBConnection();

            String sql = "update project set prograss ='" + pop + "'where p_num = " + pNum + "";
            ConnectDB.Statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Done", "Write Project Prograss", JOptionPane.INFORMATION_MESSAGE);
            ConnectDB.CloseDB();
        } catch (SQLException ex) {
        } catch (ClassNotFoundException ex) {
        }
    }

    @Override
    public void writePenalties() {

        try {
            int id = Integer.parseInt(TmSendPenlaties.empid2.getText());
            String penalties = TmSendPenlaties.penlaties.getText();
            DBConnection ConnectDB = new DBConnection();

            String sql = "insert into penalties values (" + id + ",'" + penalties + "')";
            ConnectDB.Statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Done", "Write Penalties", JOptionPane.INFORMATION_MESSAGE);
            ConnectDB.CloseDB();
        } catch (SQLException ex) {
        } catch (ClassNotFoundException ex) {
        }
    }
}
