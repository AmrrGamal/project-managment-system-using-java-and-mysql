/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectManager_Module;

import javax.swing.JOptionPane;

/**
 *
 * @author amr
 */
public class PMViewPrograssofProject extends javax.swing.JFrame {

    /**
     * Creates new form Pmproprograss
     */
    public PMViewPrograssofProject() {
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

        jLabel4 = new javax.swing.JLabel();
        send1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        pnum1 = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        prograss = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 200));
        setMinimumSize(new java.awt.Dimension(650, 450));
        setResizable(false);
        setSize(new java.awt.Dimension(651, 451));
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Project Number :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 80, 220, 30);

        send1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        send1.setText("View");
        send1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send1ActionPerformed(evt);
            }
        });
        getContentPane().add(send1);
        send1.setBounds(430, 170, 130, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" Prograss of Project :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 260, 260, 30);

        pnum1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pnum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnum1ActionPerformed(evt);
            }
        });
        getContentPane().add(pnum1);
        pnum1.setBounds(310, 80, 250, 40);

        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(250, 350, 150, 40);

        prograss.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        prograss.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(prograss);
        prograss.setBounds(310, 250, 120, 50);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("View Projects Prograss");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 0, 410, 64);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(-30, 0, 790, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnum1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnum1ActionPerformed

    private void send1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_send1ActionPerformed
        // TODO add your handling code here:
        try {
            ProjectManager c = new ProjectManager();
            c.Viewproject_prograss();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_send1ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        ProjectManagerForm e = new ProjectManagerForm();
        e.setLocation(400, 200);
        e.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(PMViewPrograssofProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PMViewPrograssofProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PMViewPrograssofProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PMViewPrograssofProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PMViewPrograssofProject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField pnum1;
    public static javax.swing.JLabel prograss;
    private javax.swing.JButton send1;
    // End of variables declaration//GEN-END:variables
}
