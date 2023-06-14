/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sanjeevani.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql. SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */

public class DBConnection {
    private static Connection conn = null;

    static {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@//DESKTOP-K2TMEP9/xe", "project", "project1");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Cannot load driver:" + ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "DB Error:" + ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return conn;
    }

    public static void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
                JOptionPane.showMessageDialog(null, "Disconnected Succesfully!", "Success!", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "DB Error:" + ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        }
    }

}
