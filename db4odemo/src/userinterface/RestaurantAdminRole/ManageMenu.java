/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Restaurant.Dishes;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class ManageMenu extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem ecosystem;
    private Dishes menu;
    public ManageMenu(JPanel userProcessContainer,UserAccount account, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.ecosystem = ecosystem;
        
        populateFoodCatalogue();
    }

    public void populateFoodCatalogue(){
            DefaultTableModel tablemodel = (DefaultTableModel) tblMenuCatalogue.getModel();
        
        tablemodel.setRowCount(0);
        
       
        for (Restaurant restro:ecosystem.getRestaurantDirectory().getRestaurantDirectory()) {
           
            if (restro.getUserName().equals(account.getUsername())) {
                System.out.println("1");
                if(!(restro.getMenu().isEmpty())){
                    for(Dishes menu:restro.getMenu()){
                    System.out.println("2");
                    Object[] row = new Object[3];
                    row[0] = menu.getName();
                    row[1] = menu.getDescription();
                    row[2] = menu.getPrice();
                    tablemodel.addRow(row);
               }
                }
               
                
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
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFoodName = new javax.swing.JTextField();
        txtFoodDescription = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnAddFoodItem = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMenuCatalogue = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Food Name:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Food Description:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        jLabel3.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Price:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 100, -1));

        txtFoodName.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        add(txtFoodName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 140, -1));

        txtFoodDescription.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        add(txtFoodDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 140, -1));

        txtPrice.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 140, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Add Menu Details");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 45, 200, -1));

        btnAddFoodItem.setBackground(new java.awt.Color(255, 255, 255));
        btnAddFoodItem.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        btnAddFoodItem.setText("Add Food Item");
        btnAddFoodItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFoodItemActionPerformed(evt);
            }
        });
        add(btnAddFoodItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, -1, -1));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        tblMenuCatalogue.setBackground(new java.awt.Color(204, 204, 204));
        tblMenuCatalogue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food Name", "Description", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblMenuCatalogue);
        if (tblMenuCatalogue.getColumnModel().getColumnCount() > 0) {
            tblMenuCatalogue.getColumnModel().getColumn(0).setResizable(false);
            tblMenuCatalogue.getColumnModel().getColumn(1).setResizable(false);
            tblMenuCatalogue.getColumnModel().getColumn(2).setResizable(false);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 480, 150));

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 550, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\prerana\\Desktop\\managemenu.jfif")); // NOI18N
        jLabel5.setText("jLabel5");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 40, 220, 180));
    }// </editor-fold>//GEN-END:initComponents

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void btnAddFoodItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFoodItemActionPerformed
        // TODO add your handling code here:
        for(Restaurant restro : ecosystem.getRestaurantDirectory().getRestaurantDirectory()){
            if(restro.getUserName().equals(account.getUsername())){
                menu = ecosystem.getRestaurantDirectory().AddMenuDishes(restro, txtFoodName.getText(), txtFoodDescription.getText(), txtPrice.getText());
            }
        }
        
        populateFoodCatalogue();
        
    }//GEN-LAST:event_btnAddFoodItemActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
         int selectedRow = tblMenuCatalogue.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Confirm delete??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                
                for(Restaurant restro:ecosystem.getRestaurantDirectory().getRestaurantDirectory()){
                    if(restro.getUserName().equals(account.getUsername())){
                        ecosystem.getRestaurantDirectory().DeleteDishes(restro, menu);
                    }   
                }
                populateFoodCatalogue();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a row to proceed for deletion");
        }
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddFoodItem;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblMenuCatalogue;
    private javax.swing.JTextField txtFoodDescription;
    private javax.swing.JTextField txtFoodName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
