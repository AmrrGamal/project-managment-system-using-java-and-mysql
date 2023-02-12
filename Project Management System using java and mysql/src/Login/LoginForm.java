/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;
import Empolyee_Module.EmployeeForm;
import TeamManager_Module.Teamleader;
import ProjectManager_Module.ProjectManagerForm;
import Admin_Module.AdminForm; 
import MainDriver.DBConnection;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author amr
 */
public class LoginForm extends javax.swing.JFrame {

   
    public LoginForm() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        loginid = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        jTextField2.setText("jTextField2");

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("Login Form");

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login Form");
        setBackground(new java.awt.Color(0, 204, 204));
        setForeground(new java.awt.Color(0, 204, 204));
        setLocation(new java.awt.Point(400, 200));
        setMinimumSize(new java.awt.Dimension(650, 450));
        setResizable(false);
        setSize(new java.awt.Dimension(650, 450));
        getContentPane().setLayout(null);

        loginid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(loginid);
        loginid.setBounds(220, 130, 240, 50);

        login.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login);
        login.setBounds(250, 320, 160, 40);

        password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password);
        password.setBounds(220, 210, 240, 50);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Password :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 210, 140, 50);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ID :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 130, 60, 40);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Login Form");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(200, 30, 230, 60);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(-10, 0, 710, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed

        Login LOGIN = new Login();

        int x=0;
        // emplyee
        try {
            DBConnection d = new DBConnection();
            ResultSet rs = LOGIN.open_empolyee();
            if (rs.next()) {
                x=1;
                EmployeeForm a = new EmployeeForm();
                a.setLocation(400, 150);
                a.setVisible(true);
                this.dispose();
            }
            d.CloseDB();
        } catch (Exception e) {
            System.out.println (e);
        }

        //team leader
        try {
            DBConnection d = new DBConnection();
            ResultSet rs = LOGIN.open_team_manager();
            if (rs.next()) {
                x=1;
                Teamleader tm = new Teamleader();
                tm.setLocation(400, 150);
                tm.setVisible(true);
                this.dispose();
            }
            d.CloseDB();
        } catch (Exception e) {
            System.out.println (e);
        } // project manager
        try {
            DBConnection d = new DBConnection();

            ResultSet rs = LOGIN.open_progect_manager();
            if (rs.next()) {
                x=1;
                ProjectManagerForm m = new ProjectManagerForm();
                m.setLocation(400, 150);
                m.setVisible(true);
                this.dispose();
            }
            d.CloseDB();
        } catch (Exception e) {
            System.out.println (e);
        }
        //admin
        try {
            DBConnection d = new DBConnection();
            ResultSet rs = LOGIN.open_admin();
            if (rs.next()) {
                x=1;
                AdminForm a = new AdminForm();
                a.setLocation(400, 150);
                a.setVisible(true);
                this.dispose();
            }

            d.CloseDB();
        } catch (Exception e) {
            System.out.println (e);
        }
        if(x==0){
            JOptionPane.showMessageDialog(null, "Username or password not Correct");
        }
    }//GEN-LAST:event_loginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton login;
    public static javax.swing.JTextField loginid;
    public static javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
