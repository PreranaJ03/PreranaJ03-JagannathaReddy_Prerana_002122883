/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class ManageRestroInfo extends javax.swing.JPanel {

    /**
     * Creates new form ManageRestroInfo
     */
    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private UserAccount account;
    
    public ManageRestroInfo(JPanel userProcessContainer,UserAccount account, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.account = account;
        
        txtUserName.setText(account.getUsername());
        
        populateTextFields();
    }

    public void populateTextFields(){
        for(Restaurant restaurant: ecosystem.getRestaurantDirectory().getRestaurantDirectory()){
            if(restaurant.getUserName().equals(account.getUsername())){
                txtRestaurantName.setText(restaurant.getName());
                txtAddress.setText(restaurant.getAddress());
                txtPhoneNumber.setText(restaurant.getNumber());
            }
        }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtRestaurantName = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Restaurant Name:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 230, 150, -1));

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Phone Number:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 140, -1));

        jLabel3.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Address:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 104, -1));

        txtRestaurantName.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        txtRestaurantName.setEnabled(false);
        add(txtRestaurantName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 143, -1));

        txtPhoneNumber.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        txtPhoneNumber.setEnabled(false);
        add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 143, -1));

        txtAddress.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        txtAddress.setEnabled(false);
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 143, -1));

        jLabel4.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("More info about your Restaurant!");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        btnUpdate.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 100, 35));

        btnSave.setBackground(new java.awt.Color(255, 255, 255));
        btnSave.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, 100, 35));

        jLabel5.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("User Name:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 104, -1));

        txtUserName.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        txtUserName.setEnabled(false);
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 143, -1));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\prerana\\Desktop\\rest 3.jfif")); // NOI18N
        jLabel6.setText("jLabel6");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 340, 230, 290));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\prerana\\Desktop\\restaurant img 1.jfif")); // NOI18N
        jLabel7.setText("jLabel6");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 290, 290));
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        txtPhoneNumber.setEnabled(true);
        txtRestaurantName.setEnabled(true);
        txtAddress.setEnabled(true);
        btnUpdate.setEnabled(false);
        
       
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        for(Restaurant restro: ecosystem.getRestaurantDirectory().getRestaurantDirectory()){
            if(restro.getUserName().equals(account.getUsername())){
                ecosystem.getRestaurantDirectory().updateRestaurantInfo(restro, txtRestaurantName.getText(), txtPhoneNumber.getText(), txtAddress.getText());
            }
        }
        
        
        btnUpdate.setEnabled(true);
        txtRestaurantName.setEnabled(false);
        txtAddress.setEnabled(false);
        txtPhoneNumber.setEnabled(false);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtRestaurantName;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
