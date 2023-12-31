/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SRC;

import Databases.koneksiDatabases;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author LENOVO
 */
public class Pengeluaran extends javax.swing.JFrame {

    
    public Pengeluaran() {
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

        Txt_Pengeluaran = new javax.swing.JTextField();
        Txt_Nominal = new javax.swing.JTextField();
        Txt_Cari = new javax.swing.JTextField();
        Btn_MenuUtama = new javax.swing.JLabel();
        Btn_Anggota = new javax.swing.JLabel();
        Btn_Pemasukkan = new javax.swing.JLabel();
        Btn_Pengeluaran = new javax.swing.JLabel();
        Btn_Rekap_Data = new javax.swing.JLabel();
        Btn_Exit = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblPengeluaran = new javax.swing.JTable();
        Btn_Tambah = new javax.swing.JLabel();
        Btn_Hapus = new javax.swing.JLabel();
        Btn_Edit = new javax.swing.JLabel();
        Btn_Cari = new javax.swing.JLabel();
        Txt_kode = new javax.swing.JTextField();
        Txt_Tanggal = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Txt_Pengeluaran.setBackground(new java.awt.Color(232, 229, 229));
        Txt_Pengeluaran.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        Txt_Pengeluaran.setBorder(null);
        Txt_Pengeluaran.setOpaque(false);
        Txt_Pengeluaran.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                Txt_PengeluaranCaretUpdate(evt);
            }
        });
        getContentPane().add(Txt_Pengeluaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 400, 210, 30));

        Txt_Nominal.setBackground(new java.awt.Color(232, 229, 229));
        Txt_Nominal.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        Txt_Nominal.setBorder(null);
        Txt_Nominal.setOpaque(false);
        getContentPane().add(Txt_Nominal, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 500, 230, 30));

        Txt_Cari.setBackground(new java.awt.Color(232, 229, 229));
        Txt_Cari.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        Txt_Cari.setBorder(null);
        Txt_Cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_CariActionPerformed(evt);
            }
        });
        getContentPane().add(Txt_Cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 240, 30));

        Btn_MenuUtama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_MenuUtamaMouseClicked(evt);
            }
        });
        getContentPane().add(Btn_MenuUtama, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 270, 40));

        Btn_Anggota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_AnggotaMouseClicked(evt);
            }
        });
        getContentPane().add(Btn_Anggota, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 290, 50));

        Btn_Pemasukkan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_PemasukkanMouseClicked(evt);
            }
        });
        getContentPane().add(Btn_Pemasukkan, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, 290, 70));

        Btn_Pengeluaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_PengeluaranMouseClicked(evt);
            }
        });
        getContentPane().add(Btn_Pengeluaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 660, 290, 60));

        Btn_Rekap_Data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_Rekap_DataMouseClicked(evt);
            }
        });
        getContentPane().add(Btn_Rekap_Data, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 750, 280, 70));

        Btn_Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_ExitMouseClicked(evt);
            }
        });
        getContentPane().add(Btn_Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 900, 260, 60));

        TblPengeluaran.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TblPengeluaran);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 710, 870, 210));

        Btn_Tambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_TambahMouseClicked(evt);
            }
        });
        getContentPane().add(Btn_Tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 560, 180, 60));

        Btn_Hapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_HapusMouseClicked(evt);
            }
        });
        getContentPane().add(Btn_Hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 570, 180, 50));

        Btn_Edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_EditMouseClicked(evt);
            }
        });
        getContentPane().add(Btn_Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 566, 190, 60));

        Btn_Cari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_CariMouseClicked(evt);
            }
        });
        getContentPane().add(Btn_Cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, 60, 50));

        Txt_kode.setBackground(new java.awt.Color(232, 229, 229));
        Txt_kode.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        Txt_kode.setBorder(null);
        Txt_kode.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                Txt_kodeCaretUpdate(evt);
            }
        });
        getContentPane().add(Txt_kode, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 500, 240, 30));
        getContentPane().add(Txt_Tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 240, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Pengeluaran.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(1422, 977));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        for (double i = 0.0; i <=1.0;i = i + 0.1)
        {
            String val = i+ "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try{
                Thread.sleep(40);
                
                
            }
            catch(Exception e)
            {
                
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void Btn_PemasukkanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_PemasukkanMouseClicked
        // TODO add your handling code here: 
          new Pemasukkan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Btn_PemasukkanMouseClicked

    private void Btn_MenuUtamaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_MenuUtamaMouseClicked
        // TODO add your handling code here: 
        new MenuUtama().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Btn_MenuUtamaMouseClicked

    private void Btn_AnggotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_AnggotaMouseClicked
        // TODO add your handling code here: 
          new Anggota().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Btn_AnggotaMouseClicked

    private void Btn_PengeluaranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_PengeluaranMouseClicked
        // TODO add your handling code here: 
        new Pengeluaran().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Btn_PengeluaranMouseClicked

    private void Btn_Rekap_DataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_Rekap_DataMouseClicked
        // TODO add your handling code here: 
         new RekapData().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Btn_Rekap_DataMouseClicked

    private void Btn_ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_ExitMouseClicked
        // TODO add your handling code here: 
        int ex = JOptionPane.showConfirmDialog(null, " Apakah anda akan keluar?", "Anda yakin?", JOptionPane.YES_NO_OPTION);
        if (ex == 0){
            dispose();
        }
        new Login().setVisible(true);
    }//GEN-LAST:event_Btn_ExitMouseClicked

    private void Btn_TambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_TambahMouseClicked
        // TODO add your handling code here:   
    java.util.Date tgl_pengeluaran = (java.util.Date) this.Txt_Tanggal.getDate();
        String kodepengeluaran = this.Txt_kode.getText();
        String nominal = this.Txt_Nominal.getText();
        String jp = this.Txt_Pengeluaran.getText();
        
        if (Txt_kode.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Data Bekum Lengkap, Kode Pengeluaran Tidak Boleh Kosong");
        }else{
            if (Txt_Nominal.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Nominal Pengeluaran Tidak Boleh Kosong");
            }else{
                if (Txt_Pengeluaran.getText().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Jenis Pengeluaran Tidak Boleh Kosong");
                }else{
                    try {
                        Connection c = koneksiDatabases.getkoneksi();
                        String sql = "Insert into pengeluaran values (?,?,?,?)";
                        PreparedStatement p = (PreparedStatement) c.prepareStatement(sql);
                        p.setString(1, kodepengeluaran);
                        p.setString(2, nominal);
                        p.setString(3, jp);
                        p.setDate(4, new java.sql.Date(tgl_pengeluaran.getTime()));
                        p.executeUpdate();
                        p.close();
                        JOptionPane.showMessageDialog(this, "Sukses Tambah Data");
                    }catch (SQLException e){
                        System.out.println(e);
                    }finally{
                    }
                }
            }
        }try{
            Connection c = koneksiDatabases.getkoneksi();
            Statement s = c.createStatement();
            String sql = "Select kd_pengeluaran, nominal_pengeluaran, jenis_pengeluaran, Tgl_pengeluaran from pengeluaran";
            ResultSet r = s.executeQuery(sql);
            TblPengeluaran.setModel(DbUtils.resultSetToTableModel(r));
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void Txt_No_AnggotaCaretUpdate(javax.swing.event.CaretEvent evt) {                                           
        // TODO add your handling code here: 
    }//GEN-LAST:event_Btn_TambahMouseClicked

    private void Btn_HapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_HapusMouseClicked
        // TODO add your handling code here:  
      java.util.Date tgl_pengeluaran = (java.util.Date) this.Txt_Tanggal.getDate();
        try {
                Connection c = koneksiDatabases.getkoneksi();
                String sql = "Delete from pengeluaran Where Tgl_pengeluaran=?";
                PreparedStatement p=(PreparedStatement) c.prepareStatement(sql);
                p.setDate(1, new java.sql.Date(tgl_pengeluaran.getTime()));          

                p.executeUpdate();
                p.close();
                JOptionPane.showMessageDialog(this, "Sukses Hapus Data");
            }catch(SQLException e){
                System.out.println(e);
            }finally{
            }
         try {        
                Connection c=koneksiDatabases.getkoneksi();
                Statement s= c.createStatement();
                String sql="select *from pengeluaran";
                ResultSet r=s.executeQuery(sql);
                TblPengeluaran.setModel(DbUtils.resultSetToTableModel(r));
            }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            }
    }//GEN-LAST:event_Btn_HapusMouseClicked

    private void Btn_EditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_EditMouseClicked
        // TODO add your handling code here: 
        java.util.Date tgl_pengeluaran = (java.util.Date) this.Txt_Tanggal.getDate();
        String kodepengeluaran = this.Txt_kode.getText();
        String nominal = this.Txt_Nominal.getText();
        String jp = this.Txt_Pengeluaran.getText();
        
        if (Txt_kode.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Kode Pengeluaran Tidak Boleh Kosong");
        }else{
            if (Txt_Nominal.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Nominal Pengeluaran Tidak Boleh Kosong");
            }else{
                if (Txt_Pengeluaran.getText().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Jenis Pengeluaran Tidak Boleh Kosong");
                }else{
                    try{
                    Connection c=koneksiDatabases.getkoneksi();
                    String sql="UPDATE `siku1`.`pengeluaran` SET `nominal_pengeluaran`=?,`kd_pengeluaran`=?,`jenis_pengeluaran`=? where Tgl_pengeluaran=?";
                    PreparedStatement p=(PreparedStatement) c.prepareStatement(sql);
                    p.setDate(4, new java.sql.Date(tgl_pengeluaran.getTime()));
                    p.setString(1, nominal);
                    p.setString(2, kodepengeluaran);
                    p.setString(3, jp);
                    p.executeUpdate();
                    p.close();
                    JOptionPane.showMessageDialog(this, "Sukses Update Data");
                    }catch (SQLException e){
                        System.out.println(e);
                    }finally{
                    }
                }
            }
        }try{
            Connection c = koneksiDatabases.getkoneksi();
            Statement s = c.createStatement();
            String sql = "Select kd_pengeluaran, nominal_pengeluaran, jenis_pengeluaran, Tgl_pengeluaran from pengeluaran";
            ResultSet r = s.executeQuery(sql);
            TblPengeluaran.setModel(DbUtils.resultSetToTableModel(r));
        }catch (SQLException e){
            System.out.println("Terjadi Kesalahan" + e);
        }

    }//GEN-LAST:event_Btn_EditMouseClicked

    private void Txt_CariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_CariActionPerformed
        // TODO add your handling code here: 
        DefaultTableModel tabelTampil1= new DefaultTableModel();
          tabelTampil1.addColumn("kd_pengeluaran");
          tabelTampil1.addColumn("nominal_pengeluaran");
          tabelTampil1.addColumn("jenis_pengeluaran");
          tabelTampil1.addColumn("Tgl_pengeluaran");
        try{
          Connection c=koneksiDatabases.getkoneksi();
          Statement s= c.createStatement();
          String sql="Select * from pengeluaran where kd_pengeluaran like '%"+ Txt_Cari.getText() + "%'" + "or nominal_pengeluaran like '%" + Txt_Cari.getText()+ "%'"+ "or jenis_pengeluaran like '%" + Txt_Cari.getText()+ "%'"+ "or Tgl_pengeluaran like '%" + Txt_Cari.getText()+ "%'";
          ResultSet r=s.executeQuery(sql);
          while (r.next()){
           tabelTampil1.addRow(new Object[]{
            r.getString(1),r.getString(2),r.getString(3),r.getString(4),
    });}
              TblPengeluaran.setModel(tabelTampil1);
              }catch(Exception e){}
    }//GEN-LAST:event_Txt_CariActionPerformed

    private void Btn_CariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_CariMouseClicked
        // TODO add your handling code here: 
         DefaultTableModel tabelTampil1= new DefaultTableModel();
          tabelTampil1.addColumn("kd_pengeluaran");
          tabelTampil1.addColumn("nominal_pengeluaran");
          tabelTampil1.addColumn("jenis_pengeluaran");
          tabelTampil1.addColumn("Tgl_pengeluaran");
        try{
          Connection c=koneksiDatabases.getkoneksi();
          Statement s= c.createStatement();
          String sql="Select * from pengeluaran where kd_pengeluaran like '%"+ Txt_Cari.getText() + "%'" + "or nominal_pengeluaran like '%" + Txt_Cari.getText()+ "%'"+ "or jenis_pengeluaran like '%" + Txt_Cari.getText()+ "%'"+ "or Tgl_pengeluaran like '%" + Txt_Cari.getText()+ "%'";
          ResultSet r=s.executeQuery(sql);
          while (r.next()){
           tabelTampil1.addRow(new Object[]{
            r.getString(1),r.getString(2),r.getString(3),r.getString(4),
    });}
              TblPengeluaran.setModel(tabelTampil1);
              }catch(Exception e){}
    }//GEN-LAST:event_Btn_CariMouseClicked

    private void Txt_kodeCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_Txt_kodeCaretUpdate
        // TODO add your handling code here: 
         try{ 
            Connection c = koneksiDatabases.getkoneksi(); 
            Statement s = c.createStatement(); 
           String sql = "Select * from pengeluaran where kd_pengeluaran='" + this.Txt_kode.getText() + " ' "; 
           ResultSet r = s.executeQuery(sql);
            while(r.next()){
                this.Txt_Pengeluaran.setText(r.getString("jenis_pengeluaran"));
                this.Txt_Tanggal.setDate(r.getDate("Tgl_pengeluaran"));
                this.Txt_Nominal.setText(r.getString("nominal_pengeluaran"));
            }
            r.close();
            s.close();
        }catch(SQLException e){
            System.out.println("Terjadi Kesalahan" + e);
        }
    }//GEN-LAST:event_Txt_kodeCaretUpdate

    private void Txt_PengeluaranCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_Txt_PengeluaranCaretUpdate
        // TODO add your handling code here:
        try{ 
            Connection c = koneksiDatabases.getkoneksi(); 
            Statement s = c.createStatement(); 
           String sql = "Select * from pengeluaran where jenis_pengeluaran='" + this.Txt_Pengeluaran.getText() + " ' "; 
           ResultSet r = s.executeQuery(sql);
            while(r.next()){
                this.Txt_Tanggal.setDate(r.getDate("Tgl_pengeluaran"));
                this.Txt_Nominal.setText(r.getString("nominal_pengeluaran"));
            }
            r.close();
            s.close();
        }catch(SQLException e){
            System.out.println("Terjadi Kesalahan" + e);
        }
    }//GEN-LAST:event_Txt_PengeluaranCaretUpdate

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
            java.util.logging.Logger.getLogger(Pengeluaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pengeluaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pengeluaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pengeluaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pengeluaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Btn_Anggota;
    private javax.swing.JLabel Btn_Cari;
    private javax.swing.JLabel Btn_Edit;
    private javax.swing.JLabel Btn_Exit;
    private javax.swing.JLabel Btn_Hapus;
    private javax.swing.JLabel Btn_MenuUtama;
    private javax.swing.JLabel Btn_Pemasukkan;
    private javax.swing.JLabel Btn_Pengeluaran;
    private javax.swing.JLabel Btn_Rekap_Data;
    private javax.swing.JLabel Btn_Tambah;
    private javax.swing.JTable TblPengeluaran;
    private javax.swing.JTextField Txt_Cari;
    private javax.swing.JTextField Txt_Nominal;
    private javax.swing.JTextField Txt_Pengeluaran;
    private com.toedter.calendar.JDateChooser Txt_Tanggal;
    private javax.swing.JTextField Txt_kode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
