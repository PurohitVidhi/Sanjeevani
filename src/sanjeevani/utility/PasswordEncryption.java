/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sanjeevani.utility;

import java.util.Base64;

public class PasswordEncryption {
    public static String getEncryptedPassword(String password) 
    {    
        Base64.Encoder en = Base64.getEncoder();
        byte[]arr = password.getBytes();
        String encPwd = en.encodeToString(arr);
        return encPwd;
    }  
}
