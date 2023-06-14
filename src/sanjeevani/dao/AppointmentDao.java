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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sanjeevani.dbutil.DBConnection;
import sanjeevani.pojo.AppointmentPojo;
import sanjeevani.pojo.PatientPojo;


public class AppointmentDao {
public static boolean addAppointment(AppointmentPojo appt)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Insert into appointments values(?,?,?,?,?,?,?)");
     ps.setString(1,appt.getPatientId());
     ps.setString(2, appt.getPatientName());
     ps.setString(3,appt.getStatus());
     ps.setString(4, appt.getOpd());
     ps.setString(5, appt.getApptDate());
     ps.setString(6,appt.getDoctorName());
     ps.setString(7,appt.getMoileNo());
     return ps.executeUpdate()==1;
}

    public static List<AppointmentPojo> getAllAppointmentsByDoctorName(String doctorName) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Select * from appointments where doctor_name=? and status='REQUEST' order by patient_id");
        ps.setString(1, doctorName);
        ResultSet rs = ps.executeQuery();
        List<AppointmentPojo> appList = new ArrayList<>();
        while (rs.next()) {
            AppointmentPojo app = new AppointmentPojo();
            app.setPatientId(rs.getString("patient_id"));
            app.setPatientName(rs.getString("patient_name"));
            app.setOpd(rs.getString("opd"));
            app.setApptDate(rs.getString("date_time"));
            app.setStatus(rs.getString("status"));
            app.setMoileNo(rs.getString("mobile_no"));
            app.setDoctorName(doctorName);
            appList.add(app);
        }
        return appList;
    }
    
    public static List<AppointmentPojo> getConfirmedAppointmentsByDoctorName(String doctorName) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Select * from appointments where doctor_name=? and status='CONFIRM' order by patient_id");
        ps.setString(1, doctorName);
        ResultSet rs = ps.executeQuery();
        List<AppointmentPojo> appList = new ArrayList<>();
        while (rs.next()) {
            AppointmentPojo app = new AppointmentPojo();
            app.setPatientId(rs.getString("patient_id"));
            app.setPatientName(rs.getString("patient_name"));
            app.setOpd(rs.getString("opd"));
            app.setApptDate(rs.getString("date_time"));
            app.setStatus(rs.getString("status"));
            appList.add(app);
        }
        return appList;
    }

    public static boolean updateStatus(AppointmentPojo app) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Update patients set status=?,p_date=? where patient_id=?");
        ps.setString(1, app.getStatus());
        ps.setString(2, app.getApptDate());
        ps.setString(3, app.getPatientId());
        return ps.executeUpdate() == 1;
    }
    
    public static void deleteAppointment(String patId) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("delete from appointments where patient_id=?");
        ps.setString(1, patId);
        ps.executeUpdate();
    }
    
    public static boolean updateAppointment(AppointmentPojo app) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Update appointments set patient_name=?,opd=?,mobile_no=? where patient_id=?");
        ps.setString(1, app.getPatientName());
        ps.setString(2, app.getOpd());
        ps.setString(3, app.getMoileNo());
        ps.setString(4, app.getPatientId());
        return ps.executeUpdate() == 1;
    }
}

    

