package ProjectManager_Module;

import MainDriver.DBConnection;
import MainDriver.GlobalVaribles;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ProjectManager extends GlobalVaribles implements Project_manager_interface {

    @Override
    public void Viewproject_prograss() {
        try {
            int id = Integer.parseInt(PMViewPrograssofProject.pnum1.getText());
            DBConnection ConnectDB = new DBConnection();

            String sql = "select prograss from project where p_num = '" + id + "'";
            ResultSet result = ConnectDB.Statement.executeQuery(sql);
            while (result.next()) {
                String p = result.getString("prograss");
                PMViewPrograssofProject.prograss.setText(p + "\n");
            }
        } catch (SQLException ex) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProjectManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Pmrepots_to_team_manger() {
        try {

            int id = Integer.parseInt(PMSendReport.empid2.getText());
            String report = (PMSendReport.report.getText());
            DBConnection ConnectDB = new DBConnection();
            String sql = "insert into report values('" + id + "','" + report + "')";
            ConnectDB.Statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Done", "Report ", JOptionPane.INFORMATION_MESSAGE);
            ConnectDB.CloseDB(); 
        } catch (SQLException ex) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProjectManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Add_project() {
        try {

            int id = Integer.parseInt(Add_project.tmid.getText());
            String name = (Add_project.pname.getText());
            int num = Integer.parseInt(Add_project.pnum.getText());
            DBConnection ConnectDB = new DBConnection();

            String sql = "insert into project values('" + num + "','0 ','" + name + "','" + id + "')";
            ConnectDB.Statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Done", "Assgin Project", JOptionPane.INFORMATION_MESSAGE);
            ConnectDB.CloseDB();
        } catch (SQLException ex) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProjectManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void view_attendance() {
        try {

            Table.addColumn("ID");
            Table.addColumn("Enter Time");
            Table.addColumn("Exit Time");
            Table.addColumn("Date");
            PMViewAttendance.jTable1.setModel(Table);
            DBConnection ConnectDB = new DBConnection();

            String sql = "select * from attendance";
            ResultSet result = ConnectDB.Statement.executeQuery(sql);

            while (result.next()) {
                Table.addRow(new String[]{
                    String.valueOf(result.getInt("id")),
                    result.getString("enter_time"),
                    result.getString("exit_time"),
                    result.getString("datee")

                });
            }
        } catch (SQLException ex) {
        } catch (ClassNotFoundException ex) {
        }
    }

}
