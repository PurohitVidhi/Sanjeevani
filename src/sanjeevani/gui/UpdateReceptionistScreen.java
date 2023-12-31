/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sanjeevani.gui;

import java.util.List;
import javax.swing.JOptionPane;
import sanjeevani.dao.ReceptionistDao;
import sanjeevani.dao.UserDao;
import sanjeevani.pojo.ReceptionistPojo;
import sanjeevani.pojo.UserPojo;
import java.sql.SQLException;
import sanjeevani.dao.EmpDao;
import sanjeevani.utility.PasswordEncryption;

/**
 *
 * @author USER
 */


public class UpdateReceptionistScreen extends javax.swing.JFrame {

 String oldName;
    String recepName,loginId,gender,password,rePassword;
    public UpdateReceptionistScreen() {
        initComponents();
          loadRegIds();
        super.setLocationRelativeTo(null);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jcRecName = new javax.swing.JTextField();
        Pwd = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtLginId = new javax.swing.JTextField();
        RePwd = new javax.swing.JPasswordField();
        jcRecID = new javax.swing.JComboBox<>();
        jcgender = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Receptionist Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcRecName.setText(" ");
        jPanel3.add(jcRecName, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 56, 481, -1));
        jPanel3.add(Pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 112, 481, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText(" Receptionist ID");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 24, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText(" Receptionist Name");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 56, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Login ID");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 84, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Password");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 112, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Gender");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 168, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Retype Password");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 140, -1, -1));

        txtLginId.setText(" ");
        jPanel3.add(txtLginId, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 84, 481, -1));
        jPanel3.add(RePwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 140, 481, -1));

        jcRecID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcRecIDActionPerformed(evt);
            }
        });
        jPanel3.add(jcRecID, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 24, 481, -1));

        jcgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other", " " }));
        jPanel3.add(jcgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 168, 481, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 710, 240));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevani/icons/images (2).jpg"))); // NOI18N
        jLabel2.setText(" ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(797, 6, 221, 221));

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 204, 204));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(797, 233, 221, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("Update Receptionist");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 204, 204));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel2.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(797, 266, 104, -1));

        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(0, 204, 204));
        btnLogout.setText("LogOut");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(907, 266, 111, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 392, 1030, 310));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Sanjeevani Application");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 390, 50));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevani/icons/HomePageBG1.jpg"))); // NOI18N
        jLabel12.setText(" ");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 390));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 702, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        ManageReceptionistScreen frame = new ManageReceptionistScreen();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        LoginScreen frame = new LoginScreen();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
  if (validateInputs() == false) {
            JOptionPane.showMessageDialog(null, "Please input all the fields");
            return;
        }
        String passwordValid = matchPassword();
        if (passwordValid != null) {
            JOptionPane.showMessageDialog(null, passwordValid);
            Pwd.requestFocus();
            return;
        }
       try {
          UserPojo user = new UserPojo();
           user.setLoginId(loginId);
          String encPassword = new String(PasswordEncryption.getEncryptedPassword(password));
           user.setPassword(encPassword);
           user.setUserType("RECEPTIONIST");
           user.setUserName(recepName);
           ReceptionistPojo recep = new ReceptionistPojo();
           recep.setReceptionistId(this.jcRecID.getSelectedItem().toString());
            recep.setGender(this.jcgender.getSelectedItem().toString());
           recep.setReceptionistName(recepName);
            oldName = this.jcRecName.getText();
          System.out.println(oldName);
           boolean resp1 = UserDao.updateUser(user,oldName);
           System.out.println("resp1"+resp1);
            boolean empRest = EmpDao.updateEmployeeByName(oldName,recepName);
           boolean resp2 = ReceptionistDao.updateReceptionist(recep);
           System.out.println("resp2"+resp2);
           if (resp1 == true && resp2 == true && empRest == true) {
               JOptionPane.showMessageDialog(null, "Receptionist Updated Successfully!");
              return;
          }
           JOptionPane.showMessageDialog(null, "Receptioist Updated unsuccessfully!");
        } 
        catch(SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error in DB from register actionPerformed:" + ex);
           ex.printStackTrace();
      }
      
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jcRecIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcRecIDActionPerformed
        // TODO add your handling code here:
         try{
          
            String recepId=this.jcRecID.getSelectedItem().toString();
            ReceptionistPojo recep = ReceptionistDao.getRecepDetails(recepId);
            this.jcgender.setSelectedItem(recep.getGender().toUpperCase());
            this.jcRecName.setText(recep.getReceptionistName());
             oldName = this.jcRecName.getText();

        
            UserPojo user = UserDao.getReceptionistsDetailsFromUsers(recep.getReceptionistName());
//            System.out.println(user.getLoginId()+","+user.getPassword());
            this.txtLginId.setText(user.getLoginId());
            this.Pwd.setText(user.getPassword());
            this.RePwd.setText(user.getPassword());
            
        }
        catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Error In DB"+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
        }

        
        
        
    }//GEN-LAST:event_jcRecIDActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdateReceptionistScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateReceptionistScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateReceptionistScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateReceptionistScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateReceptionistScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Pwd;
    private javax.swing.JPasswordField RePwd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JComboBox<String> jcRecID;
    private javax.swing.JTextField jcRecName;
    private javax.swing.JComboBox<String> jcgender;
    private javax.swing.JTextField txtLginId;
    // End of variables declaration//GEN-END:variables

    
    private void loadRegIds() {
         try
        {
            List<String>regIdList=ReceptionistDao.getAllRecepId();
            for(String id:regIdList){
                this.jcRecID.addItem(id);
            }            
        }
        catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Error In DB from updateReceptionostFrame"+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
        }
    }
    
    private boolean validateInputs() {
         recepName = this.jcRecName.getText().trim();
         loginId = this.txtLginId.getText().trim();
         gender = this.jcgender.getSelectedItem().toString();
        char[] pw1 = this.Pwd.getPassword();
        char[] pw2 = this.RePwd.getPassword();
        if (recepName.isEmpty() || pw1.length == 0 || pw2.length == 0 || loginId.isEmpty()) {
            return false;
        }
        password = new String(pw1).trim();
        rePassword = new String(pw2).trim();
        return true;
    }

    private String matchPassword() {
        if (password.length() < 3 || rePassword.length() < 3) {
            return "PASSWORD MUST BE ATLEAST 3 CHARACTERS LONG";
        }
        if (password.equals(rePassword) == false) {
            return "PASSWORDS DO NOT MATCH";
        }
        return null;
    }  

}
