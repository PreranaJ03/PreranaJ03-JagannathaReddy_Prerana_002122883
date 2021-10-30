/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author prerana
 */
public class Patient {
    
    private String Unique_ID;
    private String pName;
    private String pID;
    private String docName;
    private String bloodGroup;
    private String medHistory;

    public String getUnique_ID() {
        return Unique_ID;
    }

    public void setUnique_ID(String Unique_ID) {
        this.Unique_ID = Unique_ID;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpID() {
        return pID;
    }

    public void setpID(String pID) {
        this.pID = pID;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getMedHistory() {
        return medHistory;
    }

    public void setMedHistory(String medHistory) {
        this.medHistory = medHistory;
    }       
    
    
    
}
