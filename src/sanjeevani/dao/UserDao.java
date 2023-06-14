
package sanjeevani.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import sanjeevani.dbutil.DBConnection;
import sanjeevani.pojo.User;
import sanjeevani.pojo.UserPojo;

public class UserDao {

    
    public static UserPojo getReceptionistsDetailsFromUsers(String userName) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Select login_id,password from users where user_name=?");
        ps.setString(1, userName);
        ResultSet rs = ps.executeQuery();
        UserPojo user = new UserPojo();
        if (rs.next()) {
//            System.out.println(rs.getString("login_id"));
//            System.out.println(rs.getString("password"));
            user.setLoginId(rs.getString("login_id"));
            user.setPassword(rs.getString("password"));
        }

        return user;
    }
    
    public static boolean updateUser(UserPojo user, String oldName) throws SQLException {
        Connection conn = DBConnection.getConnection();
        System.out.println(oldName);
        PreparedStatement ps = conn.prepareStatement("Update users set user_name=?,login_id=?,password=?,user_type=? where user_name=?");
        ps.setString(1, user.getUserName());
        ps.setString(2, user.getLoginId());
        ps.setString(3, user.getPassword());
        ps.setString(4, user.getUserType());
        ps.setString(5, oldName);
        return ps.executeUpdate() == 1;
    }
    
    
    public static String validateUser(User user) throws SQLException {
        Connection conn = DBConnection.getConnection();
        String qry = "Select user_name from users where login_id=? AND password=? AND user_type=?";
        PreparedStatement ps = conn.prepareStatement(qry);
        ps.setString(1, user.getUserId());
        ps.setString(2, user.getPassword());
        ps.setString(3, user.getUserType());
        ResultSet rs = ps.executeQuery();     
        String username = null;     
        if (rs.next()) {      
            username = rs.getString("user_name");    
        }
        return username;
    }

    public static void updateName(String currName, String newName) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Update users set user_name=? where user_name=?");
        ps.setString(1, newName);
        ps.setString(2, currName);
        ps.executeUpdate();
    }
    
    
    
      public static boolean addUser(UserPojo user)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Insert into users values(?,?,?,?)");
          System.out.println(user);
     ps.setString(1,user.getLoginId());
     ps.setString(2,user.getLoginId());
     ps.setString(3,user.getPassword());
     ps.setString(4, user.getUserType().toUpperCase());
     return ps.executeUpdate()==1;
}
     public static void deleteUserByName(String name)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("delete from users where user_name=?");
     ps.setString(1, name);
     ps.executeUpdate();
}
}

