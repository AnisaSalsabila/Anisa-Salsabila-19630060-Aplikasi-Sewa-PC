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
import model.Pembayaran;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;


public class Transaksi extends javax.swing.JFrame {

    Pembayaran transaksi;
    
    public Transaksi() {
        initComponents();
        setLocationRelativeTo(null);
        resetTable("");
    }

    public ArrayList<Pembayaran> getPembayaranList(String keyword){
     ArrayList<Pembayaran> PembayaranList = new ArrayList<Pembayaran>();
     Koneksi koneksi =  new Koneksi();
     Connection connection = koneksi.getConnection();
     
     String query ="SELECT * FROM transaksi"+keyword;
     Statement st;
     ResultSet rs;
     
     try{
         st = connection.createStatement();
         rs = st.executeQuery(query);
         while (rs.next()){
             transaksi = new Pembayaran(
                     rs.getInt("id"),
                     rs.getString("no"),
                     rs.getString("nama"),
                     rs.getString("merk"),
                     rs.getString("lama"),
                     rs.getString("biaya"));
                    PembayaranList.add(transaksi);
         }
     } catch (SQLException | NullPointerException ex){
         System.err.println(ex);
     }
        return PembayaranList;
    }
    
    public void selectPembayaran(String keyword){
        ArrayList<Pembayaran> list = getPembayaranList(keyword);
        DefaultTableModel model = (DefaultTableModel)tabelTransaksi.getModel();
        Object[] row = new Object[6];
        
        for (int i = 0; i <list.size(); i++){
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getNo();
            row[2] = list.get(i).getNama();
            row[3] = list.get(i).getMerk();
            row[4] = list.get(i).getLama();
            row[5] = list.get(i).getBiaya();
            model.addRow(row);
        }
    }
    
    public final void resetTable(String keyword){
        DefaultTableModel model = (DefaultTableModel)tabelTransaksi.getModel();
        model.setRowCount(0);
        selectPembayaran(keyword);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tId = new javax.swing.JTextField();
        tNo = new javax.swing.JTextField();
        tNama = new javax.swing.JTextField();
        tMerk = new javax.swing.JTextField();
        cLama = new javax.swing.JComboBox<>();
        tBiaya = new javax.swing.JTextField();
        bTambah = new javax.swing.JButton();
        bUbah = new javax.swing.JButton();
        bHapus = new javax.swing.JButton();
        bBatal = new javax.swing.JButton();
        bTutup = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelTransaksi = new javax.swing.JTable();
        bCetak = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("TRANSAKSI");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(334, 334, 334)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(19, 19, 19))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("No Transaksi");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Id Pelanggan");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Nama Pelanggan");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Merk PC / Laptop");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Lama Sewa");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Biaya Sewa");

        tMerk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tMerkActionPerformed(evt);
            }
        });

        cLama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 Hari", "5 Hari", "7 Hari", "10 Hari", "14 Hari" }));

        tBiaya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tBiayaActionPerformed(evt);
            }
        });

        bTambah.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        bTambah.setText("TAMBAH");
        bTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTambahActionPerformed(evt);
            }
        });

        bUbah.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        bUbah.setText("UBAH");
        bUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUbahActionPerformed(evt);
            }
        });

        bHapus.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        bHapus.setText("HAPUS");
        bHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHapusActionPerformed(evt);
            }
        });

        bBatal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        bBatal.setText("BATAL");
        bBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBatalActionPerformed(evt);
            }
        });

        bTutup.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        bTutup.setText("TUTUP");
        bTutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTutupActionPerformed(evt);
            }
        });

        tabelTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Pelanggan", "No Transaksi", "Nama Pelanggan", "Merk PC / Laptop", "Lama Sewa", "Biaya Sewa"
            }
        ));
        tabelTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelTransaksiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelTransaksi);

        bCetak.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        bCetak.setText("CETAK");
        bCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCetakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel2))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tNama)
                        .addComponent(tMerk)
                        .addComponent(cLama, 0, 511, Short.MAX_VALUE)
                        .addComponent(tBiaya)
                        .addComponent(tNo, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                        .addComponent(tId))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bTambah)
                        .addGap(18, 18, 18)
                        .addComponent(bUbah)
                        .addGap(18, 18, 18)
                        .addComponent(bHapus)
                        .addGap(18, 18, 18)
                        .addComponent(bBatal)
                        .addGap(18, 18, 18)
                        .addComponent(bTutup)
                        .addGap(77, 77, 77)
                        .addComponent(bCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tMerk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cLama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tBiaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bTambah)
                    .addComponent(bUbah)
                    .addComponent(bHapus)
                    .addComponent(bBatal)
                    .addComponent(bTutup)
                    .addComponent(bCetak))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tMerkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tMerkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tMerkActionPerformed

    private void tBiayaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tBiayaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tBiayaActionPerformed

    private void bTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTambahActionPerformed
   try{
            Koneksi koneksi = new Koneksi();
            Connection con = koneksi.getConnection();
            PreparedStatement ps;
                String executeQuery =  "Insert into transaksi "
                        + "(id,no,nama,merk,lama,biaya) value(?,?,?,?,?,?)";
                ps = con.prepareStatement(executeQuery);
                ps.setString(1, tId.getText());
                ps.setString(2, tNo.getText());
                ps.setString(3, tNama.getText());
                ps.setString(4, tMerk.getText());
                ps.setString(5, cLama.getSelectedItem().toString().trim());
                ps.setString(6, tBiaya.getText());
                JOptionPane.showMessageDialog(null, "Berhasil simpan data");

            ps.executeUpdate();

        }catch(SQLException ex){
            System.err.println(ex);
        }
       resetTable("");       
    }//GEN-LAST:event_bTambahActionPerformed

    private void bUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUbahActionPerformed
       try{
            Koneksi koneksi = new Koneksi();
            Connection con = koneksi.getConnection();
            PreparedStatement ps;
                String executeQuery =  "UPDATE transaksi SET "
                        + "no=?,nama=?,merk=?,lama=?,biaya=? WHERE id=?";
                ps = con.prepareStatement(executeQuery);
                ps.setString(1, tNo.getText());
                ps.setString(2, tNama.getText());
                ps.setString(3, tMerk.getText());
                ps.setString(4, cLama.getSelectedItem().toString().trim());
                ps.setString(5, tBiaya.getText());
                ps.setString(6, tId.getText());
                JOptionPane.showMessageDialog(null, "Berhasil Edit data");

            ps.executeUpdate();

        }catch(SQLException ex){
            System.err.println(ex);
        }
       resetTable("");                
    }//GEN-LAST:event_bUbahActionPerformed

    private void tabelTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelTransaksiMouseClicked
        int tabelPembayaran = tabelTransaksi.getSelectedRow();
        tId.setText(tabelTransaksi.getValueAt(tabelPembayaran, 0).toString());
        tNo.setText(tabelTransaksi.getValueAt(tabelPembayaran, 1).toString());
        tNama.setText(tabelTransaksi.getValueAt(tabelPembayaran, 2).toString()); 
        tMerk.setText(tabelTransaksi.getValueAt(tabelPembayaran, 3).toString());
        cLama.setSelectedItem(tabelTransaksi.getValueAt(tabelPembayaran, 4).toString());
        tBiaya.setText(tabelTransaksi.getValueAt(tabelPembayaran,5).toString());
    }//GEN-LAST:event_tabelTransaksiMouseClicked

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
        int i = tabelTransaksi.getSelectedRow();
            int pilihan = JOptionPane.showConfirmDialog(
                    null,
                    "Yakin mau Hapus ?",
                    "Konfirmasi Hapus",
                    JOptionPane.YES_NO_OPTION);
            if(pilihan==0){
                if(i>0){
                    try{
                        TableModel mode = tabelTransaksi.getModel();
                        Koneksi koneksi = new Koneksi();
                        Connection con  = koneksi.getConnection();
                        String executeQuery = "delete from transaksi where id=?";
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
        tNo.setText("");
        tNama.setText(""); 
        tMerk.setText("");
        cLama.setSelectedItem("");
        tBiaya.setText("");
    }//GEN-LAST:event_bBatalActionPerformed

    private void bTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTutupActionPerformed
    dispose();
    }//GEN-LAST:event_bTutupActionPerformed

    private void bCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCetakActionPerformed
      try{
            Koneksi koneksi =  new Koneksi();
            Connection cn = koneksi.getConnection();
            JasperPrint jp = JasperFillManager.fillReport(getClass().getResourceAsStream("../Laporan/LaporanTransaksi.jasper"), null, cn);
            JasperViewer.viewReport(jp, false);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_bCetakActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBatal;
    private javax.swing.JButton bCetak;
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bTambah;
    private javax.swing.JButton bTutup;
    private javax.swing.JButton bUbah;
    private javax.swing.JComboBox<String> cLama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tBiaya;
    private javax.swing.JTextField tId;
    private javax.swing.JTextField tMerk;
    private javax.swing.JTextField tNama;
    private javax.swing.JTextField tNo;
    private javax.swing.JTable tabelTransaksi;
    // End of variables declaration//GEN-END:variables
}
