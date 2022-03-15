/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopet;

/**
 *
 * @author Indri
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Karyawan extends javax.swing.JFrame {

    /**
     * Creates new form Karyawan
     */
    
     DefaultTableModel model;
     
    public Karyawan() {
        initComponents(); 
       
        /*
        Code untuk membuat nama kolom pada tabel produk
        */
        
            String [] judul = {"ID Employee","Name Employee","Gender","Telephone Number","Sallary","Address"};
            model = new DefaultTableModel(judul,0);
            tabelEmployee.setModel(model);
            Tampil(); // Methode untuk menampilkan database di GUI
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gender = new javax.swing.ButtonGroup();
        search = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        karyawan = new javax.swing.JLabel();
        namakaryawan = new javax.swing.JLabel();
        JenisKelamin = new javax.swing.JLabel();
        InformasiGaji = new javax.swing.JLabel();
        AlamatKaryawan = new javax.swing.JLabel();
        IDEmployee = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        Sallary = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Address = new javax.swing.JTextArea();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelEmployee = new javax.swing.JTable();
        noTlpn = new javax.swing.JLabel();
        TelephoneNumber = new javax.swing.JTextField();
        rbMale = new javax.swing.JRadioButton();
        rbFemale = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        search.setBackground(new java.awt.Color(244, 245, 240));
        search.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/loupe.png"))); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(1085, 160, 120, 40));

        txtCari.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        getContentPane().add(txtCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 167, 260, -1));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(124, 68, 39));
        jLabel1.setText("Data Employee Shopet");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/KARYAWAN 64.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 35, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(124, 68, 39));
        jLabel3.setText("Save, Edit and Delete Employee Data");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, -1, -1));

        karyawan.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        karyawan.setText("ID Employee");
        getContentPane().add(karyawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 165, -1, -1));

        namakaryawan.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        namakaryawan.setText("Name");
        getContentPane().add(namakaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));

        JenisKelamin.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        JenisKelamin.setText("Gender");
        getContentPane().add(JenisKelamin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        InformasiGaji.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        InformasiGaji.setText("Sallary");
        getContentPane().add(InformasiGaji, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 412, -1, -1));

        AlamatKaryawan.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        AlamatKaryawan.setText("Address");
        getContentPane().add(AlamatKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, -1, -1));

        IDEmployee.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        IDEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDEmployeeActionPerformed(evt);
            }
        });
        getContentPane().add(IDEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 240, -1));

        Name.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 225, 240, -1));

        Sallary.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        getContentPane().add(Sallary, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 407, 240, -1));

        Address.setColumns(20);
        Address.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        Address.setRows(5);
        jScrollPane1.setViewportView(Address);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, 240, 140));

        btnEdit.setBackground(new java.awt.Color(244, 245, 240));
        btnEdit.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/EDIT 32.png"))); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 565, 130, 50));

        btnHapus.setBackground(new java.awt.Color(244, 245, 240));
        btnHapus.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/DELETE 32.png"))); // NOI18N
        btnHapus.setText("Delete");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 565, 130, 50));

        btnReset.setBackground(new java.awt.Color(244, 245, 240));
        btnReset.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/RESET 32.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 565, 130, 50));

        btnHome.setBackground(new java.awt.Color(244, 245, 240));
        btnHome.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/MENU 32.png"))); // NOI18N
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 565, 130, 50));

        btnSave.setBackground(new java.awt.Color(244, 245, 240));
        btnSave.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/SIMPAN 32.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 565, 140, 50));

        tabelEmployee.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        tabelEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        tabelEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelEmployeeMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelEmployee);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 680, 330));

        noTlpn.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        noTlpn.setText("Telephone Number");
        getContentPane().add(noTlpn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        TelephoneNumber.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        getContentPane().add(TelephoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 345, 240, -1));

        rbMale.setBackground(new java.awt.Color(244, 245, 240));
        gender.add(rbMale);
        rbMale.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        rbMale.setText("Male");
        getContentPane().add(rbMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));

        rbFemale.setBackground(new java.awt.Color(244, 245, 240));
        gender.add(rbFemale);
        rbFemale.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        rbFemale.setText("Female");
        getContentPane().add(rbFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, -1));

        jPanel1.setBackground(new java.awt.Color(250, 177, 160));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1260, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1260, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/backg.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        
        /*
        Masuk ke Page Menu
        */
        
            Menu mn =  new Menu();
            mn.setVisible(true);
            mn.pack();
            mn.setLocationRelativeTo(null);
            mn.setDefaultCloseOperation(Menu.EXIT_ON_CLOSE);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        //Membuat Radio Button pada pilihan jenis kelamin, supaya saat diklik hanya bisa 1 perempuan/laki laki saja, dan tidak bisa dua duanya
        
            String Jenis_Kelamin = null;
            if (rbMale.isSelected()){
                Jenis_Kelamin = "Male";
            } else if (rbFemale.isSelected()) {
                Jenis_Kelamin = "Female";
            }
        
        /*
        Untuk nge-save ke dalam Database MYSQL shopet
        Jika berhasil akan langsung muncul di tabel GUI
        dan jika ada yang salah atau primary key nya sama maka akan muncul JOptionPane
        */
        
            try {
              Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/shopet2","root","");
              cn.createStatement().executeUpdate("insert into employee values"+
                                                 "('"+IDEmployee.getText()+
                                                 "','"+Name.getText()+
                                                 "','"+Jenis_Kelamin+
                                                 "','"+TelephoneNumber.getText()+
                                                 "','"+Sallary.getText()+
                                                 "','"+Address.getText()+"')");
              Tampil(); //Methode untuk menampilkan ke GUI
              reset(); //untuk membersihkan data inputan di textfield setelah di save
            } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Some are not filled in, Please check again !!");
            }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void IDEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDEmployeeActionPerformed

    private void tabelEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelEmployeeMouseClicked
        // TODO add your handling code here:  
            int i = tabelEmployee.getSelectedRow();
        
        /* 
        Buat Munculin Isi tabel di text field saat tabel di klik
        */
        
            if (i>-1){
                IDEmployee.setText(model.getValueAt(i,0).toString());
                Name.setText(model.getValueAt(i,1).toString());
                TelephoneNumber.setText(model.getValueAt(i,3).toString());
                Sallary.setText(model.getValueAt(i,4).toString());
                Address.setText(model.getValueAt(i,5).toString());
             }
    }//GEN-LAST:event_tabelEmployeeMouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        
        /* 
        Mau me-reset atau kosongin text field 
        */
            reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        
            String Jenis_Kelamin =null;
            if (rbMale.isSelected()) {
                Jenis_Kelamin = "Male";
            } else if (rbFemale.isSelected()){
                Jenis_Kelamin = "Female";
            }
        /*
        Button untuk mengedit bila ada data yang ingin diubah atau ada yang salah
        */
        
            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/shopet2","root","");
                cn.createStatement().executeUpdate("update employee set "
                                                   + "NameEmp ='"+Name.getText()+
                                                   "',Gender ='"+Jenis_Kelamin+
                                                   "',TelephoneNumber ='"+TelephoneNumber.getText()+
                                                   "',Sallary ='"+Sallary.getText()+
                                                   "',Address ='"+Address.getText()+
                                                   "' where IDEmployee ='"+IDEmployee.getText()+"'");
                Tampil(); // Methode Untuk menampilkan ke tabel GUI
                JOptionPane.showMessageDialog(null, "Successful");
                reset(); // Untuk membersihkan data inputan di textfield setelah di save
            } catch (SQLException ex) {
                Logger.getLogger(Karyawan.class.getName()).log(Level.SEVERE, null, ex);            
            }
        
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        
        /*
        Untuk menghapus data yang tidak dibutuhkan lagi, akan otomatis terhapus juga data yang ada di Dtabase MYSQL
        */
        
            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/shopet2","root","");
                cn.createStatement().executeUpdate("delete from employee where IDEmployee = '"+IDEmployee.getText()+"'");
                Tampil();
                JOptionPane.showMessageDialog(null, "Successful");
                reset();
            } catch (SQLException ex) {
                Logger.getLogger(Karyawan.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        
         /*
        Button search untuk mencari data yang diinginkan secara cepat
        pencarian berdasarkan IDEMPLOYEE dan Nama Karyawan
        */
         
        try {
            int row = tabelEmployee.getRowCount();
            for(int a= 0; a<row;a++){
                model.removeRow(0);
            }
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/shopet2","root","");
            ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM employee where IDEmployee like '%" +
                                                             txtCari.getText()+"%'" + "or NameEmp like '%" + 
                                                             txtCari.getText() + "%'");
            while(rs.next()) {
                String data [] = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)};
                model.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Karyawan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchActionPerformed

    private void reset(){
        /* 
        Mau me-reset atau kosongin text field 
        */
        
        IDEmployee.setText("");
        Name.setText("");
        TelephoneNumber.setText("");
        Sallary.setText("");
        Address.setText("");
    }
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
            java.util.logging.Logger.getLogger(Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
               new Karyawan().setVisible(true);
           }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Address;
    private javax.swing.JLabel AlamatKaryawan;
    private javax.swing.JLabel Background;
    private javax.swing.JTextField IDEmployee;
    private javax.swing.JLabel InformasiGaji;
    private javax.swing.JLabel JenisKelamin;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Sallary;
    private javax.swing.JTextField TelephoneNumber;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel karyawan;
    private javax.swing.JLabel namakaryawan;
    private javax.swing.JLabel noTlpn;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JButton search;
    private javax.swing.JTable tabelEmployee;
    private javax.swing.JTextField txtCari;
    // End of variables declaration//GEN-END:variables

    /*
    Membuat Method "Tampil" untuk menampilkan data Karyawan di GUI setelah disave ke database MYSQL-employee
    */
    
    private void Tampil() {
        // untuk menambahkan baris pada tabel
        int row = tabelEmployee.getRowCount();
        for(int a= 0; a<row;a++){
            model.removeRow(0);}
           
          try {
              Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/shopet2","root","");
              ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM employee");
                while(rs.next()) {
                    String data [] = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)};
                    model.addRow(data);}
          } catch (SQLException ex) {
            Logger.getLogger(Karyawan.class.getName()).log(Level.SEVERE, null, ex);
          }
    }
}


