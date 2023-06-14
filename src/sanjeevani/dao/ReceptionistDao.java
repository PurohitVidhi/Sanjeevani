package sanjeevani.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import sanjeevani.dbutil.DBConnection;
import sanjeevani.pojo.ReceptionistPojo;


public class ReceptionistDao {

    
    
    
   public static void updateName(String currName, String newName) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Update users set user_name=? where user_name=?");
        ps.setString(1, newName);
        ps.setString(2, currName);
        ps.executeUpdate();
    }

    public static void deleteUserByName(String name) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("delete from receptionists where receptionist_name=?");
        ps.setString(1, name);
        ps.executeUpdate();
    }

    public static String getNewRecId() throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("Select max(receptionist_id) from receptionists");
        rs.next();
        int recId = 101;
        String id = rs.getString(1);
        if (id != null) {
            String num = id.substring(3);
            recId = Integer.parseInt(num) + 1;
        }
        return "REC" + recId;
    }

    public static boolean addReceptionist(ReceptionistPojo rec) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Insert into receptionists values(?,?,?)");
        ps.setString(1, rec.getReceptionistId());
        ps.setString(2, rec.getReceptionistName());
        ps.setString(3, rec.getGender());
        return ps.executeUpdate() == 1;
    }
    
    public static List<ReceptionistPojo> getAllRecepDetails() throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("Select * from receptionists order by receptionist_id");
        List<ReceptionistPojo> recpList = new ArrayList<>();
        while (rs.next()) {
            ReceptionistPojo recp = new ReceptionistPojo();
            recp.setReceptionistId(rs.getString("receptionist_id"));
            recp.setReceptionistName(rs.getString("receptionist_name"));
            recp.setGender(rs.getString("gender"));
            recpList.add(recp);
        }
        return recpList;
    }
    
    public static boolean deleteRecepById(String recepId) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Select receptionist_name from receptionists where receptionist_id=?");
        ps.setString(1, recepId);
        ResultSet rs = ps.executeQuery();
        rs.next();
        String docName = rs.getString(1);
        UserDao.deleteUserByName(docName);
        ps = conn.prepareStatement("Delete from receptionists where receptionist_id=?");
        ps.setString(1, recepId);
        return ps.executeUpdate() == 1;
    }
    
    public static List<String> getAllRecepId() throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("Select receptionist_id from receptionists");
        List<String> recepList = new ArrayList<>();
        while (rs.next()) {
            recepList.add(rs.getString(1));
        }
        return recepList;
    }
    
    public static ReceptionistPojo getRecepDetails(String empId) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Select * from receptionists where receptionist_id=?");
        ps.setString(1, empId);
        ResultSet rs = ps.executeQuery();
        rs.next();
        ReceptionistPojo recep = new ReceptionistPojo();
        recep.setReceptionistId(rs.getString(1));
        recep.setReceptionistName(rs.getString(2));
        recep.setGender(rs.getString(3));
        return recep;
    }
    
    public static boolean updateReceptionist(ReceptionistPojo recep) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Update receptionists set receptionist_name=?,gender=? where receptionist_id=?");
        ps.setString(1, recep.getReceptionistName());
        ps.setString(2, recep.getGender());
        ps.setString(3, recep.getReceptionistId());
        return ps.executeUpdate() == 1;
    }
}