/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sanjeevani.pojo;

/**
 *
 * @author USER
 */
public class AppointmentPojo {
    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOpd() {
        return opd;
    }

    public void setOpd(String opd) {
        this.opd = opd;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getMoileNo() {
        return moileNo;
    }

    public void setMoileNo(String moileNo) {
        this.moileNo = moileNo;
    }

    public String getApptDate() {
        return apptDate;
    }

    public void setApptDate(String dateTime) {
        this.apptDate = dateTime;
    }
    
    private String patientId;
    private String patientName;
    private String status;
    private String opd;
    private String doctorName;
    private String moileNo;
    private String apptDate;
}
