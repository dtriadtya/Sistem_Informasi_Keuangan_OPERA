/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SRC;

import javax.swing.JOptionPane;
import Databases.koneksiDatabases;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author LENOVO
 */
public class Anggota extends javax.swing.JFrame {

   
    public Anggota() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        Btn_MenuUtama = new javax.swing.JLabel();
        Btn_Anggota = new javax.swing.JLabel();
        Btn_Pemasukkan = new javax.swing.JLabel();
        Btn_Pengeluaran = new javax.swing.JLabel();
        Btn_RekapData = new javax.swing.JLabel();
        Btn_Keluar = new javax.swing.JLabel();
        Txt_Cari = new javax.swing.JTextField();
        Txt_No_Anggota = new javax.swing.JTextField();
        Txt_Nama = new javax.swing.JTextField();
        Txt_Nohp = new javax.swing.JTextField();
        Rd_Perempuan = new javax.swing.JRadioButton();
        Rd_Laki = new javax.swing.JRadioButton();
        Btn_Hapus = new javax.swing.JLabel();
        Btn_Tambah = new javax.swing.JLabel();
        Btn_Edit = new javax.swing.JLabel();
        Btn_Cari = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tbl_Anggota = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_MenuUtama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_MenuUtamaMouseClicked(evt);
            }
        });
        getContentPane().add(Btn_MenuUtama, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 270, 60));

        Btn_Anggota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_AnggotaMouseClicked(evt);
            }
        });
        getContentPane().add(Btn_Anggota, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 496, 290, 50));

        Btn_Pemasukkan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_PemasukkanMouseClicked(evt);
            }
        });
        getContentPane().add(Btn_Pemasukkan, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, 280, 50));

        Btn_Pengeluaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_PengeluaranMouseClicked(evt);
            }
        });
        getContentPane().add(Btn_Pengeluaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 666, 290, 50));

        Btn_RekapData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_RekapDataMouseClicked(evt);
            }
        });
        getContentPane().add(Btn_RekapData, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 756, 260, 50));

        Btn_Keluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_KeluarMouseClicked(evt);
            }
        });
        getContentPane().add(Btn_Keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 910, 260, 60));

        Txt_Cari.setBackground(new java.awt.Color(232, 229, 229));
        Txt_Cari.setBorder(null);
        Txt_Cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_CariActionPerformed(evt);
            }
        });
        getContentPane().add(Txt_Cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 240, 30));

        Txt_No_Anggota.setBackground(new java.awt.Color(232, 229, 229));
        Txt_No_Anggota.setBorder(null);
        Txt_No_Anggota.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                Txt_No_AnggotaCaretUpdate(evt);
            }
        });
        Txt_No_Anggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_No_AnggotaActionPerformed(evt);
            }
        });
        getContentPane().add(Txt_No_Anggota, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 406, 220, 30));

        Txt_Nama.setBackground(new java.awt.Color(232, 229, 229));
        Txt_Nama.setBorder(null);
        getContentPane().add(Txt_Nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 500, 220, 40));

        Txt_Nohp.setBackground(new java.awt.Color(232, 229, 229));
        Txt_Nohp.setBorder(null);
        getContentPane().add(Txt_Nohp, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 400, 270, 40));

        buttonGroup1.add(Rd_Perempuan);
        Rd_Perempuan.setText("Perempuan");
        Rd_Perempuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rd_PerempuanActionPerformed(evt);
            }
        });
        getContentPane().add(Rd_Perempuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 510, 120, -1));

        buttonGroup1.add(Rd_Laki);
        Rd_Laki.setText("Laki-Laki");
        Rd_Laki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rd_LakiActionPerformed(evt);
            }
        });
        getContentPane().add(Rd_Laki, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 510, 100, -1));

        Btn_Hapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_HapusMouseClicked(evt);
            }
        });
        getContentPane().add(Btn_Hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 580, 120, 40));

        Btn_Tambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_TambahMouseClicked(evt);
            }
        });
        getContentPane().add(Btn_Tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 586, 110, 30));

        Btn_Edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_EditMouseClicked(evt);
            }
        });
        getContentPane().add(Btn_Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(771, 580, 120, 40));

        Btn_Cari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_CariMouseClicked(evt);
            }
        });
        getContentPane().add(Btn_Cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(741, 220, 50, 50));

        Tbl_Anggota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
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
        jScrollPane2.setViewportView(Tbl_Anggota);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 701, 880, 250));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Anggota.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 1024));

        setSize(new java.awt.Dimension(1440, 1024));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i <=1.0;i = i + 0.1)
        {
            String val = i+ "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try{
                Thread.sleep(50);
                
                
            }
            catch(Exception e)
            {
                
            }
        }
    }//GEN-LAST:event_formWindowOpened

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

    private void Btn_PemasukkanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_PemasukkanMouseClicked
        // TODO add your handling code here: 
        new Pemasukkan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Btn_PemasukkanMouseClicked

    private void Btn_PengeluaranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_PengeluaranMouseClicked
        // TODO add your handling code here: 
         new Pengeluaran().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Btn_PengeluaranMouseClicked

    private void Btn_RekapDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_RekapDataMouseClicked
        // TODO add your handling code here: 
        new Pengeluaran().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Btn_RekapDataMouseClicked

    private void Btn_KeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_KeluarMouseClicked
        // TODO add your handling code here: 
       int ex = JOptionPane.showConfirmDialog(null, " Apakah anda akan keluar?", "Anda yakin?", JOptionPane.YES_NO_OPTION);
        if (ex == 0){
            dispose();
        }
        new Login().setVisible(true);
    }//GEN-LAST:event_Btn_KeluarMouseClicked

    private void Txt_CariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_CariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_CariActionPerformed

    private void Txt_No_AnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_No_AnggotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_No_AnggotaActionPerformed

    private void Rd_PerempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rd_PerempuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rd_PerempuanActionPerformed

    private void Btn_TambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_TambahMouseClicked
        // TODO add your handling code here: 
         String no_anggota = this.Txt_No_Anggota.getText();
        String nama = this.Txt_Nama.getText();
        
        String jk = null;
        if (Rd_Laki.isSelected()){
            jk = "Laki-laki";
        }else if(Rd_Perempuan.isSelected()){
            jk = "Perempuan";
        }
        String nohp = this.Txt_Nohp.getText();
        if(Txt_No_Anggota.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Nomor Identitas Pelanggan Tidak Boleh Kosong");
        }else{
            if (Txt_Nama.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Nama Pelanggan Tidak Boleh Kosong");
            }else{
                    if (Txt_Nohp.getText().isEmpty()){
                        JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Nomor HP Tidak Boleh Kosong");
                    }else{
                        try{
                            Connection c = koneksiDatabases.getkoneksi();
                            String sql = "Insert into anggota values (?,?,?,?)";
                            PreparedStatement p = (PreparedStatement) c.prepareStatement(sql);
                            p.setString(1, no_anggota);
                            p.setString(2, nama);
                            p.setString(3, nohp);
                            p.setString(4, jk);
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
            String sql = "select no_anggota, nama_anggota, no_hp, jk from anggota";
            ResultSet r = s.executeQuery(sql);
            Tbl_Anggota.setModel(DbUtils.resultSetToTableModel(r));
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_Btn_TambahMouseClicked

    private void Btn_CariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_CariMouseClicked
        // TODO add your handling code here: 
          DefaultTableModel tabelTampil1= new DefaultTableModel();
          tabelTampil1.addColumn("no_anggota");
          tabelTampil1.addColumn("nama_anggota");
          tabelTampil1.addColumn("no_hp");
          tabelTampil1.addColumn("jk");
        try{
          Connection c=koneksiDatabases.getkoneksi();
          Statement s= c.createStatement();
          String sql="Select * from anggota where no_anggota like '%"+ Txt_Cari.getText() + "%'" + "or nama_anggota like '%" + Txt_Cari.getText()+ "%'"+ "or no_hp like '%" + Txt_Cari.getText()+ "%'"+ "or jk like '%" + Txt_Cari.getText()+ "%'";
          ResultSet r=s.executeQuery(sql);
          while (r.next()){
           tabelTampil1.addRow(new Object[]{
            r.getString(1),r.getString(2),r.getString(3),r.getString(4),
    });}
              Tbl_Anggota.setModel(tabelTampil1);
              }catch(Exception e){}
    }//GEN-LAST:event_Btn_CariMouseClicked

    private void Btn_HapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_HapusMouseClicked
        // TODO add your handling code here: 
        String no_anggota = this.Txt_No_Anggota.getText();
        try{
            Connection c = koneksiDatabases.getkoneksi();
            String sql = "Delete from anggota where no_anggota=?";
            PreparedStatement p = (PreparedStatement) c.prepareStatement(sql);
            p.setString(1, no_anggota);
            
            p.executeUpdate();
            p.close();
            JOptionPane.showMessageDialog(this, "Sukses Hapus Data");
        }catch(SQLException e){
            System.out.println(e);
        }finally{
        
    }try{
        Connection c = koneksiDatabases.getkoneksi();
        Statement s = c.createStatement();
        String sql = "select no_anggota, nama_anggota, no_hp, jk from anggota";
        ResultSet r = s.executeQuery(sql);
        Tbl_Anggota.setModel(DbUtils.resultSetToTableModel(r));
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    }//GEN-LAST:event_Btn_HapusMouseClicked

    private void Txt_No_AnggotaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_Txt_No_AnggotaCaretUpdate
        // TODO add your handling code here: 
         try{
            Connection c = koneksiDatabases.getkoneksi();
            Statement s = c.createStatement();
            String sql = "Select * from anggota where no_anggota='" + this.Txt_No_Anggota.getText() + " ' ";
            ResultSet r = s.executeQuery(sql);
            while(r.next()){
                this.Txt_Nama.setText(r.getString(2));
                this.Txt_Nohp.setText(r.getString("no_hp"));
                if("Laki-laki".equalsIgnoreCase(r.getString("jk"))){
                    Rd_Laki.setSelected(true);
                }else{
                    Rd_Perempuan.setSelected(true);
                }
            }
            r.close();
            s.close();
        }catch(SQLException e){
            System.out.println("Terjadi Kesalahan" + e);
        }
    }//GEN-LAST:event_Txt_No_AnggotaCaretUpdate

    private void Btn_EditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_EditMouseClicked
        // TODO add your handling code here: 
         String no_anggota = this.Txt_No_Anggota.getText();
        String nama = this.Txt_Nama.getText();
        String jk = null;
            if (Rd_Laki.isSelected()){
            jk="Laki-laki";
            }
            else if(Rd_Perempuan.isSelected()){
            jk= "Perempuan";
            }
            String nohp=this.Txt_Nohp.getText();
            if(Txt_No_Anggota.getText().isEmpty())
            {
            JOptionPane.showMessageDialog(this, "Data Belum Lengkap,Nomor Identitas Pelanggan Tidak Boleh Kosong");
            }
            else{
            if (Txt_Nama.getText().isEmpty())
            {
                    JOptionPane.showMessageDialog(this, "Data Belum Lengkap,Nama Pelanggan Tidak Boleh Kosong");
            }else{
                           if(Txt_Nohp.getText().isEmpty())
                           {
                               JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Nomor HP Tidak Boleh Kosong");
                           }
            else {
                    try{
                    Connection c=koneksiDatabases.getkoneksi();
                    String sql="UPDATE `siku1`.`anggota` SET `nama_anggota`=?,`no_hp`=?,`jk`=? where no_anggota=?";
                    PreparedStatement p=(PreparedStatement) c.prepareStatement(sql);
                    p.setString(4, no_anggota);
                    p.setString(1, nama);
                    p.setString(2, nohp);
                    p.setString(3, jk);
                    p.executeUpdate();
                    p.close();
                    JOptionPane.showMessageDialog(this, "Sukses Update Data");
                    }catch(SQLException e){
                    System.out.println(e);
                    }finally{
                    }}}}
                    try{
                       Connection c=koneksiDatabases.getkoneksi();
                       Statement s=c.createStatement();
                       String sql="select no_anggota, nama_anggota, no_hp, jk from anggota";
                       ResultSet r=s.executeQuery(sql);
                       Tbl_Anggota.setModel(DbUtils.resultSetToTableModel(r));
                    }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                    }
    }//GEN-LAST:event_Btn_EditMouseClicked

    private void Rd_LakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rd_LakiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rd_LakiActionPerformed

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
            java.util.logging.Logger.getLogger(Anggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Anggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Anggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Anggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Anggota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Btn_Anggota;
    private javax.swing.JLabel Btn_Cari;
    private javax.swing.JLabel Btn_Edit;
    private javax.swing.JLabel Btn_Hapus;
    private javax.swing.JLabel Btn_Keluar;
    private javax.swing.JLabel Btn_MenuUtama;
    private javax.swing.JLabel Btn_Pemasukkan;
    private javax.swing.JLabel Btn_Pengeluaran;
    private javax.swing.JLabel Btn_RekapData;
    private javax.swing.JLabel Btn_Tambah;
    private javax.swing.JRadioButton Rd_Laki;
    private javax.swing.JRadioButton Rd_Perempuan;
    private javax.swing.JTable Tbl_Anggota;
    private javax.swing.JTextField Txt_Cari;
    private javax.swing.JTextField Txt_Nama;
    private javax.swing.JTextField Txt_No_Anggota;
    private javax.swing.JTextField Txt_Nohp;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
