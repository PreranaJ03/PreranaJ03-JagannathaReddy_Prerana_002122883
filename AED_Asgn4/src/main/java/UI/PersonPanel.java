/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UI;

import Model.City;
import Model.Community;
import Model.Home;
import Model.Person;
import Model.System;
import java.text.ParseException;
import javax.swing.JOptionPane;

/**
 *
 * @author prerana
 */
public class PersonPanel extends javax.swing.JPanel {

    /** Creates new form Person */
    
    System sys;
    public PersonPanel(System sys) {
        initComponents();
        this.sys = sys;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblEmail_ID = new javax.swing.JLabel();
        lblHome = new javax.swing.JLabel();
        lblcity = new javax.swing.JLabel();
        txtUniqueID = new javax.swing.JTextField();
        txtEmail_ID = new javax.swing.JTextField();
        txtHome = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        lblCommunity = new javax.swing.JLabel();
        txtcommunity = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblsearch = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        lbluniqueID = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 204, 204));

        lblTitle.setBackground(new java.awt.Color(204, 255, 204));
        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("PERSON MANAGEMENT ");

        lblName.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblName.setText("NAME :");

        lblAge.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblAge.setText("AGE :");

        lblEmail_ID.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblEmail_ID.setText("EMAIL ID :");

        lblHome.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblHome.setText("HOME :");

        lblcity.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblcity.setText("CITY :");

        txtUniqueID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUniqueIDFocusLost(evt);
            }
        });

        txtEmail_ID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmail_IDFocusLost(evt);
            }
        });

        txtHome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHomeFocusLost(evt);
            }
        });

        txtAge.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAgeFocusLost(evt);
            }
        });

        txtCity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCityFocusLost(evt);
            }
        });

        lblCommunity.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblCommunity.setText("COMMUNITY :");

        txtcommunity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcommunityFocusLost(evt);
            }
        });
        txtcommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcommunityActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(0, 0, 0));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(0, 0, 0));
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(0, 0, 0));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblsearch.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblsearch.setText("UNIQUE ID :");

        txtsearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtsearchFocusLost(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(0, 0, 0));
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lbluniqueID.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbluniqueID.setText("UNIQUE ID :");

        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(338, 338, 338)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHome, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcity, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbluniqueID, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHome, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUniqueID, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(358, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(lblsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtsearch, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbluniqueID)
                    .addComponent(txtUniqueID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail_ID)
                    .addComponent(txtEmail_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunity)
                    .addComponent(txtcommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(236, 236, 236))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        
        
        City ci = null;
        for(City i : sys.getCity()){
        if(i.getCityName().equals(txtCity.getText())){
        ci = i;
        break;
        }
        }
        if(ci == null){
        ci = new City(txtCity.getText());
        sys.getCity().add(ci);
        }
        
        Community c = null;
        for(Community i : ci.getCommunities()){
            if(i.getCommunityName().equals(txtcommunity.getText())){
                c = i;
                break;
            }
        }
        if(c == null){
            c = new Community(txtcommunity.getText());
            c.setCity(ci);
            ci.getCommunities().add(c);
        }
         
        Home h = new Home(txtHome.getText(), c);
        Person p = new Person(txtUniqueID.getText(), txtName.getText(),Integer.parseInt(txtAge.getText()), txtEmail_ID.getText(), h);
        sys.getPersondir().getListofpersons().add(p);
        
        JOptionPane.showMessageDialog(null, "The person's details were added");
        txtUniqueID.setText("");
        txtName.setText("");
        txtAge.setText("");
        txtEmail_ID.setText("");
        txtHome.setText("");
        txtCity.setText("");
        txtcommunity.setText("");
        
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        for(Person p : sys.getPersondir().getListofpersons()){
        if(p.getUnique_ID().equals(txtUniqueID.getText())){
        sys.getPersondir().getListofpersons().remove(p);
        btnAdd.doClick();
        break;
        
        
    }//GEN-LAST:event_btnUpdateActionPerformed
        }
        JOptionPane.showMessageDialog(null, "The person's details were updated");
        txtUniqueID.setText("");
        txtName.setText("");
        txtAge.setText("");
        txtEmail_ID.setText("");
        txtHome.setText("");
        txtCity.setText("");
        txtcommunity.setText("");
    }
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        for(Person p : sys.getPersondir().getListofpersons()){
        if(p.getUnique_ID().equals(txtUniqueID.getText())){
        sys.getPersondir().getListofpersons().remove(p);
        break;
    }
}
        JOptionPane.showMessageDialog(null, "The person's details were deleted");
        txtUniqueID.setText("");
        txtName.setText("");
        txtAge.setText("");
        txtEmail_ID.setText("");
        txtHome.setText("");
        txtCity.setText("");
        txtcommunity.setText("");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String searchbtn = txtsearch.getText();
        for(Person p : sys.getPersondir().getListofpersons()){
        if(p.getUnique_ID().equals(txtsearch.getText())){
            txtUniqueID.setText(p.getUnique_ID());
            txtName.setText(p.getName());
            txtAge.setText( String.valueOf(p.getAge()));
            txtEmail_ID.setText(p.getEmail_ID());
            txtHome.setText(p.getHome().getApt_Name());
            txtCity.setText(p.getHome().getCommunity().getCity().getCityName());
            txtcommunity.setText(p.getHome().getCommunity().getCommunityName());
        }
        
    }//GEN-LAST:event_btnSearchActionPerformed
    }
    
    private void txtsearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtsearchFocusLost
        // TODO add your handling code here:
        if(!(txtsearch.getText().matches("[A-Z][0-9]{3}"))){
            JOptionPane.showMessageDialog(null, "Invalid input");
            txtsearch.setText("");
        }
    }//GEN-LAST:event_txtsearchFocusLost

    private void txtUniqueIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUniqueIDFocusLost
        // TODO add your handling code here:
        if(!(txtUniqueID.getText().matches("[A-Z]{1}[0-9]{3}"))){
            JOptionPane.showMessageDialog(this, "Invalid input");
            txtUniqueID.setText("");
        }
    }//GEN-LAST:event_txtUniqueIDFocusLost

    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost
        // TODO add your handling code here:
        if(txtName.getText().trim().length() != 0) {
           if(!(txtName.getText().matches("[a-zA-Z ]+"))) {
           JOptionPane.showMessageDialog(null, "Invalid name");
           txtName.setText("");
       } 
       }
    }//GEN-LAST:event_txtNameFocusLost

    private void txtAgeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAgeFocusLost
        // TODO add your handling code here:
        if(!(txtAge.getText().matches("[0-9]+"))){
            JOptionPane.showMessageDialog(null, "Invalid input");
            txtAge.setText("");
        }
    }//GEN-LAST:event_txtAgeFocusLost

    private void txtEmail_IDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmail_IDFocusLost
        // TODO add your handling code here:
         if(!(txtEmail_ID.getText().matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$"))) {
            JOptionPane.showMessageDialog(null, "Enter a valid email address!");
            txtEmail_ID.setText("");
        }
    }//GEN-LAST:event_txtEmail_IDFocusLost

    private void txtHomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHomeFocusLost
        // TODO add your handling code here:
        if(!(txtHome.getText().matches("[a-zA-Z0-9,. ]+"))) {
           JOptionPane.showMessageDialog(null, "Location not found. ");
           txtHome.setText("");
       } 
    }//GEN-LAST:event_txtHomeFocusLost

    private void txtCityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCityFocusLost
        // TODO add your handling code here:
        if(!(txtCity.getText().matches("[a-zA-Z]+"))) {
           JOptionPane.showMessageDialog(null, "Invalid Input. City not found. ");
           txtCity.setText("");
       }
    }//GEN-LAST:event_txtCityFocusLost

    private void txtcommunityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcommunityFocusLost
        // TODO add your handling code here:
//        if(!(txtcommunity.getText().matches("[Downtown],[Roxbury],[Boylston]"))) {
//           JOptionPane.showMessageDialog(null, "Invalid Input.");
//           txtcommunity.setText("");
//       }
    }//GEN-LAST:event_txtcommunityFocusLost

    private void txtcommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcommunityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcommunityActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblEmail_ID;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblcity;
    private javax.swing.JLabel lblsearch;
    private javax.swing.JLabel lbluniqueID;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtEmail_ID;
    private javax.swing.JTextField txtHome;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtUniqueID;
    private javax.swing.JTextField txtcommunity;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables

}
