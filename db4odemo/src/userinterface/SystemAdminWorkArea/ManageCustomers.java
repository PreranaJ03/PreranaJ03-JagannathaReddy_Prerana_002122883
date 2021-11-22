/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Role.CustomerRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class ManageCustomers extends javax.swing.JPanel {

    /**
     * Creates new form ManageCustomers
     */
    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private UserAccount user;
    
    public ManageCustomers(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        populateCustomerTable();
    }
    
    

    public void populateCustomerTable(){
        
        DefaultTableModel tablemodel = (DefaultTableModel) tblCustomers.getModel();
        
        tablemodel.setRowCount(0);
        for(UserAccount user: ecosystem.getUserAccountDirectory().getUserAccountList()){
            if(user.getRole().getClass().getName()=="Business.Role.CustomerRole"){
                Object [] row = new Object[3];
                row[0] = user.getName();
                row[1] = user.getUsername();
                row[2] = user.getPassword();
                
                tablemodel.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomers = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnCreateCustomer = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(1000, 900));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblCustomers.setBackground(new java.awt.Color(204, 204, 204));
        tblCustomers.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        tblCustomers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "User Name", "Password"
            }
        ));
        jScrollPane1.setViewportView(tblCustomers);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 540, 123));

        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("UserName:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        txtName.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 144, -1));

        txtUserName.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 144, -1));

        txtPassword.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 144, -1));

        btnUpdate.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setBorder(null);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 580, 80, 24));

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setBorder(null);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 580, 80, 24));

        btnSave.setBackground(new java.awt.Color(255, 255, 255));
        btnSave.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.setBorder(null);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 580, 70, 24));

        btnCreateCustomer.setBackground(new java.awt.Color(255, 255, 255));
        btnCreateCustomer.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        btnCreateCustomer.setText("Create Customer");
        btnCreateCustomer.setBorder(null);
        btnCreateCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCustomerActionPerformed(evt);
            }
        });
        add(btnCreateCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 160, 26));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.setBorderPainted(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCustomerActionPerformed
        // TODO add your handling code here:
        if(ecosystem.getUserAccountDirectory().checkIfUsernameIsUnique(txtUserName.getText())){
             UserAccount userAccount = ecosystem.getUserAccountDirectory().createUserAccount(txtName.getText(), txtUserName.getText(), txtPassword.getText(), null, new CustomerRole());
            Customer customer = ecosystem.getCustomerDirectory().createUserAccount(txtUserName.getText());
            populateCustomerTable();
            txtName.setText("");
            txtUserName.setText("");
            txtPassword.setText("");
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Username is not unique");
        }
        
       
    }//GEN-LAST:event_btnCreateCustomerActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectRow = tblCustomers.getSelectedRow();

        if(selectRow>=0){
            String name = (String) tblCustomers.getValueAt(selectRow, 0);
            String username= (String) tblCustomers.getValueAt(selectRow, 1);
            String password= (String) tblCustomers.getValueAt(selectRow, 2);
            user=ecosystem.getUserAccountDirectory().authenticateUser(username, password);

            txtName.setText(name+"");
            txtUserName.setText(username+"");
            txtPassword.setText(password+"");
            
            JOptionPane.showMessageDialog(null,"Please press save button to save the profile after updating the text field");
            

        }
        else {
            JOptionPane.showMessageDialog(null,"Please select a row to update a profile");
        }
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        ecosystem.getUserAccountDirectory().updateUserAccount(user, txtName.getText(), txtUserName.getText(), txtPassword.getText());
        populateCustomerTable();
        
            txtName.setText("");
            txtUserName.setText("");
            txtPassword.setText("");
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCustomers.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Confirm delete?","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                String username= (String) tblCustomers.getValueAt(selectedRow, 1);
                String pwd= (String) tblCustomers.getValueAt(selectedRow, 2);
                UserAccount user=ecosystem.getUserAccountDirectory().authenticateUser(username, pwd);

               
                ecosystem.getUserAccountDirectory().deleteUserAccount(user);
                ecosystem.getCustomerDirectory().deleteCustomer(user.getUsername());
                populateCustomerTable();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a row to delete the account");
        }
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateCustomer;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCustomers;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
