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
public class VitalSigns {
    private double body_temperature;
    private int pulse_rate;
    private int respiration_rate;
    private int systolic_pressure;
    private int diastolic_pressure;

    public VitalSigns(double body_temperature, int pulse_rate, int respiration_rate, int systolic_pressure, int diastolic_pressure) {
        this.body_temperature = body_temperature;
        this.pulse_rate = pulse_rate;
        this.respiration_rate = respiration_rate;
        this.systolic_pressure = systolic_pressure;
        this.diastolic_pressure = diastolic_pressure;
    }
    
    

    public double getBody_temperature() {
        return body_temperature;
    }

    public void setBody_temperature(double body_temperature) {
        this.body_temperature = body_temperature;
    }

    public int getPulse_rate() {
        return pulse_rate;
    }

    public void setPulse_rate(int pulse_rate) {
        this.pulse_rate = pulse_rate;
    }

    public int getRespiration_rate() {
        return respiration_rate;
    }

    public void setRespiration_rate(int respiration_rate) {
        this.respiration_rate = respiration_rate;
    }

    public int getSystolic_pressure() {
        return systolic_pressure;
    }

    public void setSystolic_pressure(int systolic_pressure) {
        this.systolic_pressure = systolic_pressure;
    }

    public int getDiastolic_pressure() {
        return diastolic_pressure;
    }

    public void setDiastolic_pressure(int diastolic_pressure) {
        this.diastolic_pressure = diastolic_pressure;
    }

    
    
    
    
}
