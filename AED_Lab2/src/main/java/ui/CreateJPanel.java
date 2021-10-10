/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.CarFleet;
import model.CarFleetHistory;

/**
 *
 * @author prerana
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    CarFleetHistory history;
    private String availability;
    public CreateJPanel(CarFleetHistory history) {
        initComponents();
        this.history = history;
        
        File f = new File("table.csv");
        long lastModified = f.lastModified();
        Date date = new Date(lastModified);
        lblTime.setText("Table was last updated on: " + date.toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lbllisence_no = new javax.swing.JLabel();
        lblserial_no = new javax.swing.JLabel();
        lblcar_type = new javax.swing.JLabel();
        lblmodel_no = new javax.swing.JLabel();
        lblbrand = new javax.swing.JLabel();
        lblavailability = new javax.swing.JLabel();
        lbllocation = new javax.swing.JLabel();
        lblseats = new javax.swing.JLabel();
        lblyear_manufactured = new javax.swing.JLabel();
        lblmaintenance_due = new javax.swing.JLabel();
        txtlisence_no = new javax.swing.JTextField();
        txtserial_no = new javax.swing.JTextField();
        txtmodel_no = new javax.swing.JTextField();
        txtseats = new javax.swing.JTextField();
        txtyear_manufactured = new javax.swing.JTextField();
        txtmaintenance_due = new javax.swing.JTextField();
        btbSave = new javax.swing.JButton();
        comboCarType = new javax.swing.JComboBox<>();
        comboBrand = new javax.swing.JComboBox<>();
        comboLocation = new javax.swing.JComboBox<>();
        chkboxNo = new javax.swing.JCheckBox();
        chkboxYes = new javax.swing.JCheckBox();
        btnAutofill = new javax.swing.JButton();
        lblTime = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));
        setPreferredSize(new java.awt.Dimension(600, 600));

        lblTitle.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("ENTER CAR DETAILS");

        lbllisence_no.setBackground(new java.awt.Color(255, 255, 255));
        lbllisence_no.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbllisence_no.setText("Lisence Number :");

        lblserial_no.setBackground(new java.awt.Color(255, 255, 255));
        lblserial_no.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblserial_no.setText("Serial Number :");

        lblcar_type.setBackground(new java.awt.Color(255, 255, 255));
        lblcar_type.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblcar_type.setText("Type of Car :");

        lblmodel_no.setBackground(new java.awt.Color(255, 255, 255));
        lblmodel_no.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblmodel_no.setText("Model Number :");

        lblbrand.setBackground(new java.awt.Color(255, 255, 255));
        lblbrand.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblbrand.setText("Brand :");

        lblavailability.setBackground(new java.awt.Color(255, 255, 255));
        lblavailability.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblavailability.setText("Availability :");

        lbllocation.setBackground(new java.awt.Color(255, 255, 255));
        lbllocation.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbllocation.setText("Location :");

        lblseats.setBackground(new java.awt.Color(255, 255, 255));
        lblseats.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblseats.setText("Seats :");

        lblyear_manufactured.setBackground(new java.awt.Color(255, 255, 255));
        lblyear_manufactured.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblyear_manufactured.setText("Manufacture Year :");

        lblmaintenance_due.setBackground(new java.awt.Color(255, 255, 255));
        lblmaintenance_due.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblmaintenance_due.setText("Maintenance Due :");

        txtlisence_no.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        txtserial_no.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        txtmodel_no.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        txtseats.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        txtyear_manufactured.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        txtmaintenance_due.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        btbSave.setBackground(new java.awt.Color(0, 0, 0));
        btbSave.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        btbSave.setForeground(new java.awt.Color(255, 255, 255));
        btbSave.setText("SAVE");
        btbSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btbSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbSaveActionPerformed(evt);
            }
        });

        comboCarType.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        comboCarType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Sports Car", "ABC", " " }));

        comboBrand.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        comboBrand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Toyota", "Wolksvagen", " " }));

        comboLocation.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        comboLocation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Boston", "New Hamshire", "Vermont", "Amherst", " ", " " }));

        chkboxNo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        chkboxNo.setText("No");
        chkboxNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkboxNoActionPerformed(evt);
            }
        });

        chkboxYes.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        chkboxYes.setText("Yes");
        chkboxYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkboxYesActionPerformed(evt);
            }
        });

        btnAutofill.setText("AUTOFILL");
        btnAutofill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutofillActionPerformed(evt);
            }
        });

        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTime.setText("jLabel1");
        lblTime.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblcar_type, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbllisence_no, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblbrand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbllocation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblyear_manufactured, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtlisence_no, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(txtyear_manufactured, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(comboCarType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboBrand, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboLocation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblseats, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblserial_no)
                        .addComponent(lblmodel_no, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblavailability, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblmaintenance_due, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtserial_no, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmodel_no, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtseats, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmaintenance_due, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(chkboxYes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chkboxNo)
                        .addGap(64, 64, 64))))
            .addComponent(btbSave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAutofill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblTime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbllisence_no)
                        .addComponent(txtlisence_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblserial_no)
                    .addComponent(txtserial_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblcar_type)
                            .addComponent(lblmodel_no)
                            .addComponent(txtmodel_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkboxNo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(comboCarType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblavailability)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkboxYes, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblbrand))))))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbllocation)
                    .addComponent(lblseats)
                    .addComponent(txtseats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblyear_manufactured)
                    .addComponent(txtyear_manufactured, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblmaintenance_due)
                    .addComponent(txtmaintenance_due, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(btbSave)
                .addGap(36, 36, 36)
                .addComponent(btnAutofill)
                .addGap(47, 47, 47)
                .addComponent(lblTime)
                .addContainerGap(138, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btbSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbSaveActionPerformed
        // TODO add your handling code here:
        String lisence_no = txtlisence_no.getText();
        String serial_no = txtserial_no.getText();
        String car_type = comboCarType.getSelectedItem().toString();
        //String car_type = txtcar_type.getText();
        int model_no = Integer.parseInt(txtmodel_no.getText());
        String brand = comboBrand.getSelectedItem().toString();
        //String brand = txtbrand.getText();
        //String availability = txtavailability.getText();
        String location = comboLocation.getSelectedItem().toString();
        //String location = txtlocation.getText();
        int seats = Integer.parseInt(txtseats.getText());
        String year_manufactured = txtyear_manufactured.getText();
        String maintenance_due = txtmaintenance_due.getText();
        
        CarFleet cf = history.addNewCar();
        
        cf.setLisence_no(lisence_no);
        cf.setSerial_no(serial_no);
        cf.setCar_type(car_type);
        cf.setModel_no(model_no);
        cf.setBrand(brand);
        cf.setAvailability(availability);
        cf.setLocation(location);
        cf.setSeats(seats);
        cf.setYear_manufactured(year_manufactured);
        cf.setMaintenance_due(maintenance_due);
        
        
//        String print = lisence_no + "," + serial_no + "," + car_type + "," + model_no + "," + brand + "," + availability + "," + location + "," + seats + "," + year_manufactured + "," + maintenance_due;
//        try {
//            FileWriter csvWriter = new FileWriter("table.csv");
//            csvWriter.append(print + "\n");
//            csvWriter.flush();
//            csvWriter.close();
//        } catch (IOException ex) {
//            Logger.getLogger(CreateJPanel.class.getName()).log(Level.SEVERE, null, ex);
//        }
  
        
        JOptionPane.showMessageDialog(this, "New Car - details added.");
        
        txtlisence_no.setText("");
        txtserial_no.setText("");
        comboCarType.setToolTipText("");
        //txtcar_type.setText("");
        txtmodel_no.setText("");
        comboBrand.setToolTipText("");
        //txtbrand.setText("");
        //txtavailability.setText("");
        comboLocation.setToolTipText("");
        //txtlocation.setText("");
        txtseats.setText("");
        txtyear_manufactured.setText("");
        txtmaintenance_due.setText("");
      
    }//GEN-LAST:event_btbSaveActionPerformed

    private void chkboxNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkboxNoActionPerformed
        // TODO add your handling code here:
        if(chkboxNo.isSelected()) {
            availability = chkboxNo.getText();
       }
    }//GEN-LAST:event_chkboxNoActionPerformed

    private void chkboxYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkboxYesActionPerformed
        // TODO add your handling code here:
        if(chkboxYes.isSelected()) {
            availability = chkboxYes.getText();
       }
    }//GEN-LAST:event_chkboxYesActionPerformed

    private void btnAutofillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutofillActionPerformed
        // TODO add your handling code here:
        String row;
        BufferedReader csvReader = null;
        try {
            csvReader = new BufferedReader(new FileReader("table.csv"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CreateJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while ((row = csvReader.readLine()) != null) {
                String[] data = row.split(",");
                CarFleet temp = new CarFleet(data);
                history.getHistory().add(temp);
                
            }
        } catch (IOException ex) {
            Logger.getLogger(CreateJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            csvReader.close();
        } catch (IOException ex) {
            Logger.getLogger(CreateJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAutofillActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbSave;
    private javax.swing.JButton btnAutofill;
    private javax.swing.JCheckBox chkboxNo;
    private javax.swing.JCheckBox chkboxYes;
    private javax.swing.JComboBox<String> comboBrand;
    private javax.swing.JComboBox<String> comboCarType;
    private javax.swing.JComboBox<String> comboLocation;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblavailability;
    private javax.swing.JLabel lblbrand;
    private javax.swing.JLabel lblcar_type;
    private javax.swing.JLabel lbllisence_no;
    private javax.swing.JLabel lbllocation;
    private javax.swing.JLabel lblmaintenance_due;
    private javax.swing.JLabel lblmodel_no;
    private javax.swing.JLabel lblseats;
    private javax.swing.JLabel lblserial_no;
    private javax.swing.JLabel lblyear_manufactured;
    private javax.swing.JTextField txtlisence_no;
    private javax.swing.JTextField txtmaintenance_due;
    private javax.swing.JTextField txtmodel_no;
    private javax.swing.JTextField txtseats;
    private javax.swing.JTextField txtserial_no;
    private javax.swing.JTextField txtyear_manufactured;
    // End of variables declaration//GEN-END:variables
}
