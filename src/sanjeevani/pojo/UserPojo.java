/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sanjeevani.pojo;

/**
 *
 * @author USER
 */
public class UserPojo {

    public UserPojo(String loginId, String userName, String password, String userType) {
        this.loginId = loginId;
        this.userName = userName;
        this.password = password;
        this.userType = userType;
    }

    public UserPojo() {

    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
    private String loginId;
    private String userName;
    private String password;
    private String userType;


}

