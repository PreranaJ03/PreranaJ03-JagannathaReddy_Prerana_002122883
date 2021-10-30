/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Model.Home;
import Model.PatientDirectory;
import Model.PersonDirectory;
import java.util.List;
import Model.System;
import Model.*;

/**
 *
 * @author prerana
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    System sys;
    public MainFrame() {
        initComponents();
        sys = new System();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        splitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        lblPersonM = new javax.swing.JButton();
        lblPatientM = new javax.swing.JButton();
        lblEncounterM = new javax.swing.JButton();
        lblDisplay = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        splitPane.setDividerLocation(200);

        lblPersonM.setText("PERSON MANAGEMENT");
        lblPersonM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblPersonMActionPerformed(evt);
            }
        });

        lblPatientM.setText("PATIENT MANAGEMENT ");
        lblPatientM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblPatientMActionPerformed(evt);
            }
        });

        lblEncounterM.setText("ENCOUNTER MANAGEMENT");
        lblEncounterM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblEncounterMActionPerformed(evt);
            }
        });

        lblDisplay.setText("DISPLAY");
        lblDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblDisplayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDisplay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEncounterM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPatientM, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPersonM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(lblPersonM, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(lblPatientM, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(lblEncounterM, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(lblDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(256, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 979, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 739, Short.MAX_VALUE)
        );

        splitPane.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1140, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblPersonMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblPersonMActionPerformed
        // TODO add your handling code here:
        
        PersonPanel personPanel = new PersonPanel();
        splitPane.setRightComponent(personPanel);
        
    }//GEN-LAST:event_lblPersonMActionPerformed

    private void lblPatientMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblPatientMActionPerformed
        // TODO add your handling code here:
        
        PatientPanel patientPanel = new PatientPanel();
        splitPane.setRightComponent(patientPanel);
        
    }//GEN-LAST:event_lblPatientMActionPerformed

    private void lblEncounterMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblEncounterMActionPerformed
        // TODO add your handling code here:
        Encounter encounterPanel = new Encounter();
        splitPane.setRightComponent(encounterPanel);
    }//GEN-LAST:event_lblEncounterMActionPerformed

    private void lblDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblDisplayActionPerformed
        // TODO add your handling code here:
        Display displayPanel = new Display();
        splitPane.setRightComponent(displayPanel);
    }//GEN-LAST:event_lblDisplayActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    
    void instantiatevalues() {
        sys.setPersondir(new PersonDirectory());
        sys.setPatientdir(new PatientDirectory());
        

        List<Person> persons = sys.getPersondir().getListofpersons();
        List<Patient> patients = sys.getPatientdir().getListofpatients();
        

        persons.add(new Person("R101","Prer","03-06-1998","23","prer@gmail.com",new Home("1102","JVUE","75 St Alphonsus", "Boston")));
        persons.add(new Person("Doe",new Home("10 davis","Brokline","Boston"), "03-07-1997", "5346547687", "sdsdssdsd@gmail.com", "12346"));
        persons.add(new Person("Mack",new Home("11 davis","Brokline","Boston"), "12-08-1985", "7564787654", "sdsergdfgh@gmail.com", "12347"));
        persons.add(new PersonPanel("Jack",new Home("11 davis","Brokline","Boston"), "01-01-1957", "0987465376", "sdsgsrfdh@gmail.com", "12348"));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton lblDisplay;
    private javax.swing.JButton lblEncounterM;
    private javax.swing.JButton lblPatientM;
    private javax.swing.JButton lblPersonM;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}
