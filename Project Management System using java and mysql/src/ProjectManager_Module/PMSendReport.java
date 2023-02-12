/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectManager_Module;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author myoss
 */
public class PMSendReport extends javax.swing.JFrame {

    /**
     * Creates new form Pmreport
     */
    public PMSendReport() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        empid2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        report = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        send = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 200));
        setMinimumSize(new java.awt.Dimension(650, 450));
        setResizable(false);
        setSize(new java.awt.Dimension(651, 451));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Write Report to TM");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 0, 380, 60);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Employee Id :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 60, 170, 30);

        empid2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        empid2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empid2ActionPerformed(evt);
            }
        });
        getContentPane().add(empid2);
        empid2.setBounds(110, 100, 250, 40);

        report.setColumns(20);
        report.setRows(5);
        jScrollPane1.setViewportView(report);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(90, 190, 420, 130);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Report:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 150, 170, 30);

        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(450, 350, 150, 40);

        send.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        send.setText("Send");
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });
        getContentPane().add(send);
        send.setBounds(40, 350, 130, 40);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 700, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        ProjectManagerForm e = new ProjectManagerForm();
        e.setLocation(400, 200);
        e.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void empid2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empid2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empid2ActionPerformed

    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed
        // TODO add your handling code here:
        try {
            ProjectManager c = new ProjectManager();
            c.Pmrepots_to_team_manger();
            empid2.setText("");
            report.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_sendActionPerformed
 
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
            java.util.logging.Logger.getLogger(PMSendReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PMSendReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PMSendReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PMSendReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PMSendReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    public static javax.swing.JTextField empid2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextArea report;
    private javax.swing.JButton send;
    // End of variables declaration//GEN-END:variables
}
