/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeamManager_Module;

import Login.LoginForm;

/**
 *
 * @author amr
 */
public class Teamleader extends javax.swing.JFrame {

    /**
     * Creates new form Teamleader
     */
    public Teamleader() {
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
        prograss = new javax.swing.JButton();
        Assigntask = new javax.swing.JButton();
        ctask = new javax.swing.JButton();
        assproject = new javax.swing.JButton();
        Vaction = new javax.swing.JButton();
        report = new javax.swing.JButton();
        Penalties = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        exit1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 200));
        setMinimumSize(new java.awt.Dimension(650, 450));
        setResizable(false);
        setSize(new java.awt.Dimension(651, 651));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Team Leader");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, -10, 240, 60);

        prograss.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        prograss.setText("Add Project Prograss");
        prograss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prograssActionPerformed(evt);
            }
        });
        getContentPane().add(prograss);
        prograss.setBounds(40, 200, 270, 40);

        Assigntask.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Assigntask.setText("Assigen tasks to Employee");
        Assigntask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssigntaskActionPerformed(evt);
            }
        });
        getContentPane().add(Assigntask);
        Assigntask.setBounds(350, 130, 270, 40);

        ctask.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ctask.setText("Complete tasks");
        ctask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctaskActionPerformed(evt);
            }
        });
        getContentPane().add(ctask);
        ctask.setBounds(40, 130, 270, 40);

        assproject.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        assproject.setText("Assigened Projects");
        assproject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assprojectActionPerformed(evt);
            }
        });
        getContentPane().add(assproject);
        assproject.setBounds(350, 200, 270, 40);

        Vaction.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Vaction.setText("Vactions Respond");
        Vaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VactionActionPerformed(evt);
            }
        });
        getContentPane().add(Vaction);
        Vaction.setBounds(350, 60, 270, 40);

        report.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        report.setText("  Reports from PM about Employee");
        report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportActionPerformed(evt);
            }
        });
        getContentPane().add(report);
        report.setBounds(40, 260, 580, 40);

        Penalties.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Penalties.setText(" Add Penalties");
        Penalties.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PenaltiesActionPerformed(evt);
            }
        });
        getContentPane().add(Penalties);
        Penalties.setBounds(40, 60, 270, 40);

        exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exit.setText("Log out");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(150, 330, 160, 50);

        exit1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exit1.setText("Exit");
        exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit1ActionPerformed(evt);
            }
        });
        getContentPane().add(exit1);
        exit1.setBounds(350, 330, 160, 50);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 750, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        LoginForm log=new LoginForm();
        log.setVisible(true);
        this.setVisible(false);           // TODO add your handling code here:
      
    }//GEN-LAST:event_exitActionPerformed

    private void AssigntaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssigntaskActionPerformed
        // TODO add your handling code here:
        TmAssigenTasks e = new TmAssigenTasks();
        e.setLocation(400, 150);
        e.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AssigntaskActionPerformed

    private void VactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VactionActionPerformed
        // TODO add your handling code here:
        Tmvaction e = new Tmvaction();
        e.setLocation(400, 150);
        e.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VactionActionPerformed

    private void PenaltiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PenaltiesActionPerformed
        // TODO add your handling code here:
        TmSendPenlaties e = new TmSendPenlaties();
        e.setLocation(400, 150);
        e.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PenaltiesActionPerformed

    private void ctaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctaskActionPerformed
        // TODO add your handling code here:
        TmViewComleteTasks e = new TmViewComleteTasks();
        e.setLocation(400, 150);
        e.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ctaskActionPerformed

    private void assprojectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assprojectActionPerformed
        // TODO add your handling code here:
        TmAssignProjectToEMP e = new TmAssignProjectToEMP();
        e.setLocation(400, 150);
        e.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_assprojectActionPerformed

    private void prograssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prograssActionPerformed
        // TODO add your handling code here:
        Tmprojectprograss e = new Tmprojectprograss();
        e.setLocation(400, 150);
        e.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_prograssActionPerformed

    private void reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportActionPerformed
        // TODO add your handling code here:
        Tmreport e = new Tmreport();
        e.setLocation(400, 150);
        e.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_reportActionPerformed

    private void exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exit1ActionPerformed

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
            java.util.logging.Logger.getLogger(Teamleader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teamleader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teamleader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teamleader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teamleader().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Assigntask;
    private javax.swing.JButton Penalties;
    private javax.swing.JButton Vaction;
    private javax.swing.JButton assproject;
    private javax.swing.JButton ctask;
    private javax.swing.JButton exit;
    private javax.swing.JButton exit1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton prograss;
    private javax.swing.JButton report;
    // End of variables declaration//GEN-END:variables
}
