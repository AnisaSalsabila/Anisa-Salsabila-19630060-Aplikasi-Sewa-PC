package frame;

import db.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Barang;
import model.Pelanggan;


public class PelangganApp extends javax.swing.JFrame {

    Pelanggan pelanggan;
    /**
     * Creates new form PelangganApp
     */
    public PelangganApp() {
        initComponents();
        setLocationRelativeTo(null);
        resetTable("");
    }
    
   public ArrayList<Pelanggan> getPelangganList(String keyword){
     ArrayList<Pelanggan> pelangganList = new ArrayList<Pelanggan>();
     Koneksi koneksi =  new Koneksi();
     Connection connection = koneksi.getConnection();
     
     String query ="SELECT * FROM sewa"+keyword;
     Statement st;
     ResultSet rs;
     
     try{
         st = connection.createStatement();
         rs = st.executeQuery(query);
         while (rs.next()){
             pelanggan = new Pelanggan(
                     rs.getInt("id"),
                     rs.getString("nama"),
                     rs.getString("merk"),
                     rs.getString("lama"),
                     rs.getString("biaya"));
                     pelangganList.add(pelanggan);
         }
     } catch (SQLException | NullPointerException ex){
         System.err.println(ex);
     }
        return pelangganList;
    }
    
    public void selectPelanggan(String keyword){
        ArrayList<Pelanggan> list = getPelangganList(keyword);
        DefaultTableModel model = (DefaultTableModel)tabelPelanggan2.getModel();
        Object[] row = new Object[5];
        
        for (int i = 0; i <list.size(); i++){
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getNama();
            row[2] = list.get(i).getMerk();
            row[3] = list.get(i).getLama();
            row[4] = list.get(i).getBiaya();
            model.addRow(row);
        }
    }
    
    public final void resetTable(String keyword){
        DefaultTableModel model = (DefaultTableModel)tabelPelanggan2.getModel();
        model.setRowCount(0);
        selectPelanggan(keyword);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tNama = new javax.swing.JTextField();
        bCari = new javax.swing.JButton();
        tMerk = new javax.swing.JTextField();
        tBiaya = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cSewa = new javax.swing.JComboBox<>();
        bTambah = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        bUbah = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        bHapus = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        bBatal = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        bTutup = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tId = new javax.swing.JTextField();
        tCari = new javax.swing.JTextField();
        bTransaksi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelPelanggan2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        bCari.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        bCari.setText("CARI");
        bCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCariActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("PELANGGAN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(369, 369, 369)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cSewa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 Hari", "5 Hari", "7 Hari", "10 Hari", "14 Hari" }));

        bTambah.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        bTambah.setText("TAMBAH");
        bTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTambahActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Id Pelanggan");

        bUbah.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        bUbah.setText("UBAH");
        bUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUbahActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nama Pelanggan");

        bHapus.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        bHapus.setText("HAPUS");
        bHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHapusActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Merk PC/Laptop");

        bBatal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        bBatal.setText("BATAL");
        bBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBatalActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Lama Sewa");

        bTutup.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        bTutup.setText("TUTUP");
        bTutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTutupActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Biaya Sewa");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Pencarian");

        bTransaksi.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        bTransaksi.setText("TRANSAKSI");
        bTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTransaksiActionPerformed(evt);
            }
        });

        tabelPelanggan2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Pelanggan", "Nama Pelanggan", "Merk PC/Laptop", "Lama Sewa", "Biaya Sewa"
            }
        ));
        tabelPelanggan2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelPelanggan2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelPelanggan2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tNama)
                            .addComponent(tMerk)
                            .addComponent(cSewa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tBiaya)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tId, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bTambah))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(bUbah)
                        .addGap(73, 73, 73)
                        .addComponent(bHapus)
                        .addGap(88, 88, 88)
                        .addComponent(bBatal)
                        .addGap(95, 95, 95)
                        .addComponent(bTutup)
                        .addGap(0, 77, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(tCari, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(bCari)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bTransaksi)))
                .addGap(80, 80, 80))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tMerk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cSewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tBiaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bTambah)
                            .addComponent(bHapus)
                            .addComponent(bBatal)
                            .addComponent(bTutup))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bTransaksi)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bUbah)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(bCari)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTambahActionPerformed
     try{
            Koneksi koneksi = new Koneksi();
            Connection con = koneksi.getConnection();
            PreparedStatement ps;
                String executeQuery =  "Insert into sewa "
                        + "(id,nama,merk,lama,biaya) value(?,?,?,?,?)";
                ps = con.prepareStatement(executeQuery);
                ps.setString(1, tId.getText());
                ps.setString(2, tNama.getText());
                ps.setString(3, tMerk.getText());
                ps.setString(4, cSewa.getSelectedItem().toString().trim());
                ps.setString(5, tBiaya.getText());
                JOptionPane.showMessageDialog(null, "Berhasil simpan data");

            ps.executeUpdate();

        }catch(SQLException ex){
            System.err.println(ex);
        }
    }//GEN-LAST:event_bTambahActionPerformed

    private void bUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUbahActionPerformed
          try{
            Koneksi koneksi = new Koneksi();
            Connection con = koneksi.getConnection();
            PreparedStatement ps;
                String executeQuery =  "UPDATE sewa SET "
                        + "nama=?,merk=?,lama=?,biaya=? WHERE id=?";
                ps = con.prepareStatement(executeQuery);
                ps.setString(1, tNama.getText());
                ps.setString(2, tMerk.getText());
                ps.setString(3, cSewa.getSelectedItem().toString().trim());
                ps.setString(4, tBiaya.getText());
                ps.setString(5, tId.getText());
                JOptionPane.showMessageDialog(null, "Berhasil Edit data");

            ps.executeUpdate();

        }catch(SQLException ex){
            System.err.println(ex);
        }
       resetTable("");              
    }//GEN-LAST:event_bUbahActionPerformed

    private void bTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTransaksiActionPerformed
     Transaksi pembayaran = new Transaksi();
        pembayaran.setVisible(true);
        dispose();
    }//GEN-LAST:event_bTransaksiActionPerformed

    private void bCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCariActionPerformed
       resetTable(" WHERE merk like '%"+bCari.getText()+"%'");
    }//GEN-LAST:event_bCariActionPerformed

    private void tabelPelanggan2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelPelanggan2MouseClicked
       int tabelPelanggan = tabelPelanggan2.getSelectedRow();
       tId.setText(tabelPelanggan2.getValueAt(tabelPelanggan,0).toString());
       tNama.setText(tabelPelanggan2.getValueAt(tabelPelanggan,1).toString());
       tMerk.setText(tabelPelanggan2.getValueAt(tabelPelanggan,2).toString());
       cSewa.setSelectedItem(tabelPelanggan2.getValueAt(tabelPelanggan,3).toString());
       tBiaya.setText(tabelPelanggan2.getValueAt(tabelPelanggan,4).toString());
    }//GEN-LAST:event_tabelPelanggan2MouseClicked

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
      int i = tabelPelanggan2.getSelectedRow();
            int pilihan = JOptionPane.showConfirmDialog(
                    null,
                    "Yakin mau Hapus ?",
                    "Konfirmasi Hapus",
                    JOptionPane.YES_NO_OPTION);
            if(pilihan==0){
                if(i>0){
                    try{
                        TableModel mode = tabelPelanggan2.getModel();
                        Koneksi koneksi = new Koneksi();
                        Connection con  = koneksi.getConnection();
                        String executeQuery = "delete from sewa where id=?";
                        PreparedStatement ps = con.prepareStatement(executeQuery);
                        ps.setString(1, mode.getValueAt(1,0).toString());
                        ps.executeUpdate();
                    }catch(SQLException ex){
                        System.err.println(ex);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Pilih data yang ingin dihapus"); 
                }
            }
            resetTable("");  
    }//GEN-LAST:event_bHapusActionPerformed

    private void bBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBatalActionPerformed
        tId.setText("");
        tNama.setText(""); 
        tMerk.setText("");
        cSewa.setSelectedItem("");
        tBiaya.setText("");
    }//GEN-LAST:event_bBatalActionPerformed

    private void bTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTutupActionPerformed
       dispose();
    }//GEN-LAST:event_bTutupActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        resetTable("");  
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(PelangganApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PelangganApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PelangganApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PelangganApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PelangganApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBatal;
    private javax.swing.JButton bCari;
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bTambah;
    private javax.swing.JButton bTransaksi;
    private javax.swing.JButton bTutup;
    private javax.swing.JButton bUbah;
    private javax.swing.JComboBox<String> cSewa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tBiaya;
    private javax.swing.JTextField tCari;
    private javax.swing.JTextField tId;
    private javax.swing.JTextField tMerk;
    private javax.swing.JTextField tNama;
    private javax.swing.JTable tabelPelanggan2;
    // End of variables declaration//GEN-END:variables
}
