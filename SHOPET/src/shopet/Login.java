/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopet;

import javax.swing.JOptionPane;

/**
 *
 * @author Indri
 */

public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    
    public static String namakar;
    
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        pass = new javax.swing.JLabel();
        noEmp = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/ICONSHOPET2.png"))); // NOI18N
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, -1, -1));

        user.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        user.setForeground(new java.awt.Color(124, 68, 39));
        user.setText("Username :");
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 395, -1, -1));

        pass.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        pass.setForeground(new java.awt.Color(124, 68, 39));
        pass.setText("Password :");
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 475, -1, -1));

        noEmp.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        getContentPane().add(noEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 315, 340, -1));

        username.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 395, 340, -1));

        password.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 475, 340, -1));

        btnLogin.setBackground(new java.awt.Color(244, 245, 240));
        btnLogin.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btnLogin.setText("Log In");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 550, 100, 45));

        btnKeluar.setBackground(new java.awt.Color(244, 245, 240));
        btnKeluar.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btnKeluar.setText("Exit");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(btnKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 550, 100, 45));

        name.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        name.setForeground(new java.awt.Color(124, 68, 39));
        name.setText("ID Employee :");
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 315, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(124, 68, 39));
        jLabel4.setText("Login");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, -1, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/backg.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        namakar     = noEmp.getText();
        
        /*
        Untuk Username dan password telah ditentukan oleh system, Hanya beberapa karyawan yang bertugas
        yang mengetahuinya, Jika Salah maka akan muncul JOptionpane, Dan jika benar maka akan dibawa ke Page Menu
        */
        
        String usern = "admin";
        String Boss  = "Boss";
        String passw = "admin123";
        
            if (usern.equalsIgnoreCase(username.getText()) || Boss.equalsIgnoreCase(username.getText()) 
                && passw.equalsIgnoreCase(password.getText()))
                 {
                    JOptionPane.showMessageDialog(null, "Login Succesfull");
                    Menu mn =  new Menu();
                    mn.setVisible(true);
                    mn.pack();
                    mn.setLocationRelativeTo(null);
                    mn.setDefaultCloseOperation(Menu.EXIT_ON_CLOSE); 
                 }
            else {
                JOptionPane.showMessageDialog(null, "Sorry Your Username or Password Wrong !");
                 }        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        
        /*
        Untuk keluar dari sistem Shopet
        */
        
        System.exit(0);
    }//GEN-LAST:event_btnKeluarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
                Login lg = new Login();
                lg.setSize(1258, 645);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel name;
    private javax.swing.JTextField noEmp;
    private javax.swing.JLabel pass;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel user;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
