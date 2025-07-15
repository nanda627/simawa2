/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tugasproject1;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class matkul_admin extends javax.swing.JFrame {

    DefaultTableModel model;
   
    public matkul_admin() {
        initComponents();
        String[] judul = {"no","kode MK","Nama matkul", "ruangan", "sks", "jam",
            "kelas", "hari", "nama dosen"};
        model = new DefaultTableModel(judul,0);
        tbl1.setModel(model);
        getData();
        
        
        cmbHari1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{
            "senin","selasa","rabu","kamis","jumat","sabtu"}));
        
        
        tbl1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int row =tbl1.getSelectedRow();
                
                txtkode.setText(tbl1.getValueAt(row, 1).toString());
                txtnama1.setText(tbl1.getValueAt(row, 2).toString());
                txtruangan1.setText(tbl1.getValueAt(row, 3).toString());
                txtsks1.setText(tbl1.getValueAt(row, 4).toString());
                txtkelas1.setText(tbl1.getValueAt(row, 5).toString());
                txtjam1.setText(tbl1.getValueAt(row, 6).toString());
                cmbHari1.setSelectedItem(tbl1.getValueAt(row, 7).toString());
                txtdosen1.setText(tbl1.getValueAt(row, 8).toString());
              
            }
        });
    }
    public void saveTableToCSV(JTable table, String path) {
    try (FileWriter csv = new FileWriter(path))  {
        TableModel model = table.getModel();
        
        for (int i = 0; i < model.getColumnCount(); i++) {
           csv.write(model.getColumnName(i));
           if (i !=model.getColumnCount() - 1) {
               csv.write(",");
           }
        }
        csv.write("\n");
        
        for (int i = 0; i< model.getRowCount(); i++) {
            for (int j = 0; j < model.getColumnCount(); j++) {
                Object cell = model.getValueAt(i, j);
                String cellText = cell == null ? "" : cell.toString();
                csv.write(cellText);
                
                if (j != model.getColumnCount() - 1) {
                    csv.write(",");
                }
            }
            csv.write("\n");
        }
        
        csv.flush();
        System.out.println("data tabel berhasil disimpan ke: " + path);
    }   catch (IOException ex) {
            ex.printStackTrace();
            System.err.println("gagal menyimpan data tabel");
        }
    }
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtnama1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtruangan1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtjam1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtsks1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        cmbHari1 = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtdosen1 = new javax.swing.JTextField();
        btninput1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl1 = new javax.swing.JTable();
        btndelete1 = new javax.swing.JButton();
        btnedit1 = new javax.swing.JButton();
        txtkelas1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnsimpan = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtkode = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 184, 35));

        jLabel19.setText("Nama mata kuliah");

        jLabel20.setText("Ruangan");

        jLabel21.setText("Jam");

        jLabel22.setText("SKS");

        cmbHari1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel23.setText("Hari");

        jLabel24.setText("Nama Dosen");

        btninput1.setBackground(new java.awt.Color(255, 241, 202));
        btninput1.setText("Input");
        btninput1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninput1ActionPerformed(evt);
            }
        });

        tbl1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        jScrollPane1.setViewportView(tbl1);

        btndelete1.setBackground(new java.awt.Color(255, 241, 202));
        btndelete1.setText("Delete");
        btndelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelete1ActionPerformed(evt);
            }
        });

        btnedit1.setBackground(new java.awt.Color(255, 241, 202));
        btnedit1.setText("Edit");
        btnedit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnedit1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Kelas");

        btnsimpan.setText("simpan");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        jLabel2.setText("Kode MK");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtruangan1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsks1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtjam1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtkelas1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnama1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbHari1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24)
                            .addComponent(txtdosen1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btninput1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btndelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnsimpan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnedit1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))))
                    .addComponent(txtkode, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel23))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbHari1)
                            .addComponent(txtnama1))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jLabel24))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtruangan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdosen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtsks1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtjam1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtkelas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btninput1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btndelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnedit1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtkode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        jMenu1.setText("beranda");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem11.setText("kembali");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem11);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Informasi Akademik");

        jMenuItem1.setText("mata kuliah");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Profil Kampus");

        jMenuItem12.setText("Wisudawan terbaik_admin");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem12);

        jMenuItem15.setText("Falkultas_admin");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem15);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btninput1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninput1ActionPerformed
    try {
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/simawa",
                "root","");
        
       
        String nama = txtnama1.getText();
        String kode = txtkode.getText();
        String ruangan = txtruangan1.getText();
        String sks = txtsks1.getText();
        String jam = txtjam1.getText();
        String kelas = txtkelas1.getText();
        String hari = cmbHari1.getSelectedItem().toString();
        String dosen = txtdosen1.getText();
  
         cn.createStatement().executeUpdate("INSERT INTO mata_kuliah (kodeMK,"
                 + " Nama_matkul, ruangan, sks, jam, kelas, hari, nama_dosen) VALUES ("
         + "'" + kode + "',"
         + "'" + nama + "',"
         + "'" + ruangan + "',"
         + "'" + sks + "',"
         + "'" + jam + "',"
         + "'" + kelas + "',"
         + "'" + hari + "',"
         + "'" + dosen + "')");
    getData();
    }catch (SQLException ex) {
         JOptionPane.showMessageDialog(null,"gagal simpan : " + ex.getMessage());
     }
    }//GEN-LAST:event_btninput1ActionPerformed

    private void btndelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelete1ActionPerformed
    try {
          int selectedRow = tbl1.getSelectedRow();
          if (selectedRow == -1 ) {
              JOptionPane.showMessageDialog(null, 
                      "pilih barisan yang ingin dihapus");
              return;
          }
          String nama = txtnama1.getText();
          
          int confirm = JOptionPane.showConfirmDialog(null, 
                  "apakah yakin ingin menghapus mata kuliah ini: " + nama + "?",
                  "konfirmasi hapus",
                  JOptionPane.YES_NO_OPTION);
          
          if (confirm == JOptionPane.YES_OPTION) {
              Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/simawa", "root","");
              cn.createStatement().executeUpdate("DELETE FROM mata_kuliah WHERE Nama_matkul='" + nama + "'");
              
              JOptionPane.showMessageDialog(null, "mata kuliah berhasil dihapus");
              getData();
          }
    }catch (Exception ex ) {
          JOptionPane.showMessageDialog(null, "error" + ex.getMessage());
      }
    }//GEN-LAST:event_btndelete1ActionPerformed

    private void btnedit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnedit1ActionPerformed
    try {
         int selectedRow = tbl1.getSelectedRow();
         if (selectedRow == -1 ) {
             JOptionPane.showMessageDialog(null, "pilih baris yang akan diedit!!");
             return;
         }
         
         String kode = txtkode.getText();
         String nama = txtnama1.getText();
         String ruangan = txtruangan1.getText();
         String sks = txtsks1.getText();
         String jam = txtjam1.getText();
         String kelas = txtkelas1.getText();
         String dosen = txtdosen1.getText();
         String hari = cmbHari1.getSelectedItem().toString();
      
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/simawa","root","");
        cn.createStatement().executeUpdate(
            "UPDATE mata_kuliah SET Nama_matkul='" + nama + "',kodeMK='" + kode + "',ruangan='" + ruangan + "',"
                    + "sks='" + sks + "',jam='" + jam + "',kelas='" + kelas + "',hari='" + hari + "',"
                    + "nama_dosen='" + dosen + "'WHERE Nama_matkul='" + nama + "'");
         JOptionPane.showMessageDialog(null, "mata kuliah berhasil diubah");
         getData();
    }catch (Exception ex) {
         JOptionPane.showMessageDialog(null, "error : " + ex.getMessage());
     }
    }//GEN-LAST:event_btnedit1ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
    berandaadmin newWin =  new berandaadmin ();
    newWin.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
    wisudawan_terbaik_admin newWin =  new wisudawan_terbaik_admin ();
    newWin.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
    fakultasadmin newWin =  new fakultasadmin ();
    newWin.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
    JFileChooser fileChooser =new JFileChooser();
        int option = fileChooser.showSaveDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            String path = fileChooser.getSelectedFile().getAbsolutePath();
        if (!path.toLowerCase().endsWith(".csv")) {
                path += ".csv";
            }
            saveTableToCSV(tbl1,path);
        }
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    matkul_admin newWin =  new matkul_admin ();
    newWin.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(matkul_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(matkul_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(matkul_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(matkul_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new matkul_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete1;
    private javax.swing.JButton btnedit1;
    private javax.swing.JButton btninput1;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JComboBox<String> cmbHari1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl1;
    private javax.swing.JTextField txtdosen1;
    private javax.swing.JTextField txtjam1;
    private javax.swing.JTextField txtkelas1;
    private javax.swing.JTextField txtkode;
    private javax.swing.JTextField txtnama1;
    private javax.swing.JTextField txtruangan1;
    private javax.swing.JTextField txtsks1;
    // End of variables declaration//GEN-END:variables

    private void getData() {
        int row = tbl1.getRowCount();
        for (int a=0; a<row; a++){
            model.removeRow(0);
        }
        try{ 
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/simawa",
                        "root","");
            ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM mata_kuliah");
            while(rs.next()) {
                String data [] = {rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getString(9)};
               
                    
                model.addRow(data);
                }
        }catch (SQLException ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }        
    }
    
}

