/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sanjeevani.dao;

/**
 *
 * @author USER
 */


import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sanjeevani.dbutil.DBConnection;
import sanjeevani.pojo.PatientPojo;

public class PatientDao {
    
public static String getNewPatientId() throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("Select max(patient_id) from patients");
        rs.next();
        int patId = 101;
        String id = rs.getString(1);
        if (id != null) {
            String num = id.substring(3);
            patId = Integer.parseInt(num) + 1;
        }
        return "PAT" + patId;
    }

    public static boolean addPatient(PatientPojo pat) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Insert into patients values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1, pat.getPatientId());
        ps.setString(2, pat.getFirstName());
        ps.setString(3, pat.getLastName());
        ps.setInt(4, pat.getAge());
        ps.setString(5, pat.getGender());
        ps.setString(6, pat.getMarriedStatus());
        ps.setString(7, pat.getAddress());
        ps.setString(8, pat.getCity());
        ps.setString(9, pat.getMno());
        ps.setDate(10, pat.getDate());
        ps.setInt(11, pat.getOtp());
        ps.setString(12, pat.getOpd());
        ps.setString(13, pat.getDoctorId());
        ps.setString(14, pat.getAptStatus());
        return ps.executeUpdate() == 1;
    }

    public static List<PatientPojo> getAllPatientsDetails() throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("Select * from patients order by patient_id");
        List<PatientPojo> patList = new ArrayList<>();
        while (rs.next()) {
            PatientPojo pat = new PatientPojo();
            pat.setFirstName(rs.getString("first_name"));
            pat.setLastName(rs.getString("last_name"));
            pat.setPatientId(rs.getString("patient_id"));
            pat.setAge(rs.getInt("age"));
            pat.setOpd(rs.getString("opd"));
            pat.setGender(rs.getString("gender"));
            pat.setMarriedStatus(rs.getString("m_status"));
            pat.setDate(rs.getDate("p_date"));
            pat.setAddress(rs.getString("address"));
            pat.setCity(rs.getString("city"));
            pat.setMno(rs.getString("mobile_no"));
            pat.setDoctorId(rs.getString("doctor_id"));
            patList.add(pat);
        }
        return patList;
    }
    
    public static List<String> getAllPatientId() throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("Select patient_id from patients");
        List<String> patList = new ArrayList<>();
        while (rs.next()) {
            patList.add(rs.getString(1));
        }
        return patList;
    }

    public static List<PatientPojo> getAllPatientsByDoctorId(String doctorId) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from patients where doctor_id=? ans status='REQUEST' order by patient_id");
        ps.setString(1, doctorId);
        ResultSet rs = ps.executeQuery();
        List<PatientPojo> patList = new ArrayList<>();
        while (rs.next()) {
            PatientPojo pat = new PatientPojo();
            pat.setPatientId(rs.getString("patient_id"));
            pat.setFirstName(rs.getString("first_name") + " " + rs.getString("last_name"));;
            pat.setDate(rs.getDate("p_date"));
            pat.setOpd(rs.getString("opd"));
            patList.add(pat);
        }
        return patList;
    }

    public static boolean updateStatus(String patientId) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("update patients set status='CONFIRM' where patient_id=?");
        ps.setString(1, patientId);
        return ps.executeUpdate() == 1;
    }


public static boolean deletePatientById(String patId) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("delete from patients where patient_id=?");
        ps.setString(1, patId);
        AppointmentDao.deleteAppointment(patId);
        return ps.executeUpdate() == 1;
    }

    public static PatientPojo getPatientDetails(String patId) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Select * from patients where patient_id=?");
        ps.setString(1, patId);
        ResultSet rs = ps.executeQuery();
        rs.next();
        PatientPojo pat = new PatientPojo();
        pat.setFirstName(rs.getString("first_name"));
        pat.setLastName(rs.getString("last_name"));
        pat.setPatientId(rs.getString("patient_id"));
        pat.setAge(rs.getInt("age"));
        pat.setOpd(rs.getString("opd"));
        pat.setGender(rs.getString("gender"));
        pat.setMarriedStatus(rs.getString("m_status"));
        pat.setDate(rs.getDate("p_date"));
        pat.setAddress(rs.getString("address"));
        pat.setCity(rs.getString("city"));
        pat.setMno(rs.getString("mobile_no"));
        pat.setDoctorId(rs.getString("doctor_id"));
        return pat;
    }
    
    public static boolean updatePatient(PatientPojo pat) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Update patients set opd=?,age=?,city=?,address=?,first_name=?,last_name=?,mobile_no=? where patient_id=?");
        ps.setString(1, pat.getOpd());
        ps.setString(2, pat.getAge()+"");
        ps.setString(3, pat.getCity()+"");
        ps.setString(4, pat.getAddress()+"");
        ps.setString(5, pat.getFirstName()+"");
        ps.setString(6, pat.getLastName()+"");
        ps.setString(7, pat.getMno()+"");
        ps.setString(8, pat.getPatientId()+"");
        return ps.executeUpdate() == 1;
    }

}
