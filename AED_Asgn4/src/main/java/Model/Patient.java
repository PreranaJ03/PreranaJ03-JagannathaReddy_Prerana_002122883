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
    private int pID;
    private String docName;
    private String bloodGroup;
    private String medHistory;
    EncounterHistory encounterhistory = new EncounterHistory();

    public Patient(String Unique_ID, String pName, int pID, String docName, String bloodGroup, String medHistory) {
        this.Unique_ID = Unique_ID;
        this.pName = pName;
        this.pID = pID;
        this.docName = docName;
        this.bloodGroup = bloodGroup;
        this.medHistory = medHistory;
    }
    
    

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

    public int getpID() {
        return pID;
    }

    public void setpID(int pID) {
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

    public EncounterHistory getEncounterhistory() {
        return encounterhistory;
    }

    public void setEncounterhistory(EncounterHistory encounterhistory) {
        this.encounterhistory = encounterhistory;
    }
    
    
    
    
}
