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

public class wisudawan_terbaik_admin extends javax.swing.JFrame {
    DefaultTableModel model;

    public wisudawan_terbaik_admin() {
        initComponents();
        String[] judul = {"No","Nama","fakultas","ipk","prodi","tahun periode","masa studi"};
        model = new DefaultTableModel(judul,0);
        tbldata.setModel(model);
        getData();
        
        fakultas.add(rbguru);
        fakultas.add(rbkomputer);
        fakultas.add(rbpertanian);
        fakultas.add(rbsains);
        
        tbldata.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int row =tbldata.getSelectedRow();
                txtnama.setText(tbldata.getValueAt(row, 1).toString());
                txtipk.setText(tbldata.getValueAt(row, 2).toString());
                txtprodi.setText(tbldata.getValueAt(row, 3).toString());
                txttahun.setText(tbldata.getValueAt(row, 4).toString());
                
                String fakultas = tbldata.getValueAt(row, 5).toString();
                switch (fakultas) {
                    case "Kehuruan dan Ilmu Pendidikan" :
                        rbguru.setSelected(true);
                        break;
                    case "Sains" :
                        rbsains.setSelected(true);
                        break;
                    case "Teknik Komputer" :
                        rbkomputer.setSelected(true);
                        break;
                    case "Pertanian" :
                        rbpertanian.setSelected(true);
                        break;
                }
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

        fakultas = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtipk = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txttahun = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtprodi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rbguru = new javax.swing.JRadioButton();
        rbsains = new javax.swing.JRadioButton();
        rbkomputer = new javax.swing.JRadioButton();
        rbpertanian = new javax.swing.JRadioButton();
        btninput = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldata = new javax.swing.JTable();
        btnedit = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnsimpan = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtstudi = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 184, 35));

        jLabel1.setText("Nama");

        jLabel3.setText("Ipk");

        jLabel4.setText("Tahun Periode");

        txttahun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttahunActionPerformed(evt);
            }
        });

        jLabel5.setText("Fakultas");

        jLabel6.setText("Prodi");

        rbguru.setText("Keguruan dan Ilmu Pendidikan");

        rbsains.setText("Sains");

        rbkomputer.setText("Teknik Komputer");

        rbpertanian.setText("Pertanian");

        btninput.setText("Input");
        btninput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninputActionPerformed(evt);
            }
        });

        tbldata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbldata);

        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnsimpan.setText("Simpan");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        jLabel2.setText("Masa Studi");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(txtnama)
                            .addComponent(txtipk)
                            .addComponent(txttahun, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(txtprodi, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(rbguru)
                            .addComponent(rbsains, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btninput)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnedit)))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rbpertanian, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbkomputer, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btndelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnsimpan))))
                    .addComponent(jLabel2)
                    .addComponent(txtstudi, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1))
                .addGap(81, 81, 81))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtprodi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbguru)
                    .addComponent(rbkomputer)
                    .addComponent(txtipk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtstudi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbsains)
                            .addComponent(rbpertanian))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btninput)
                            .addComponent(btnedit)
                            .addComponent(btndelete)
                            .addComponent(btnsimpan))
                        .addGap(44, 44, 44)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
    berandaadmin newWin =  new berandaadmin ();
    newWin.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    matkul_admin newWin =  new matkul_admin ();
    newWin.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            saveTableToCSV(tbldata,path);
        }
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btninputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninputActionPerformed
    try {
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/simawa","root","");
        
       
        String nama = txtnama.getText();
        String ipk = txtipk.getText();
        String prodi = txtprodi.getText();
        String tahun = txttahun.getText();
        String studi = txtstudi.getText();
        String fakultas = "";
        if (rbguru.isSelected()) {
             fakultas = "Keguruan dan Ilmu Pendidikan";
        }else if (rbsains.isSelected()){
             fakultas = "Sains";
        }else if (rbpertanian.isSelected()){
             fakultas= "Pertanian";
        }else if (rbkomputer.isSelected()){
             fakultas="Teknik Komputer";
        }
        
  
        cn.createStatement().executeUpdate("INSERT INTO wisudawan_terbaik (nama_mhs, ipk, "
        + "tahun, prodi, studi, fakultas) VALUES  ("
        + "'" + nama + "',"
        + "'" + ipk + "',"
        + "'" + tahun + "',"
        + "'" + prodi + "',"
        + "'" + studi + "',"
        + "'" + fakultas + "')");
    getData();
    }catch (SQLException ex) {
         JOptionPane.showMessageDialog(null,"gagal simpan : " + ex.getMessage());
     }
    }//GEN-LAST:event_btninputActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
    try {
        
        int selectedRow = tbldata.getSelectedRow();
        if (selectedRow == -1 ) {
            JOptionPane.showMessageDialog(null, "pilih baris yang akan diedit!!");
            return;
        }
        String nama = txtnama.getText();
        String ipk = txtipk.getText();
        String prodi = txtprodi.getText();
        String tahun = txttahun.getText();
        String studi = txtstudi.getText();
        String fakultas = "";
        if (rbguru.isSelected()) {
             fakultas = "Keguruan dan Ilmu Pendidikan";
        }else if (rbsains.isSelected()){
             fakultas = "Sains";
        }else if (rbpertanian.isSelected()){
             fakultas= "Pertanian";
        }else if (rbkomputer.isSelected()){
             fakultas="Teknik Komputer";
        }
        
      
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/simawa","root","");
        cn.createStatement().executeUpdate(
            "UPDATE wisudawan_terbaik SET nama_mhs='" + nama + "',ipk='" + ipk + "',tahun='" + tahun + "',"
            + "prodi='" + prodi + "',studi= '" + studi + "',fakultas='" + fakultas + "' WHERE nama_mhs='" + nama + "'");
         JOptionPane.showMessageDialog(null, "nama berhasil diubah");
         getData();
    }catch (Exception ex) {
         JOptionPane.showMessageDialog(null, "error : " + ex.getMessage());
     }
    }//GEN-LAST:event_btneditActionPerformed

    private void txttahunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttahunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttahunActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
    try {
        int selectedRow = tbldata.getSelectedRow();
        if (selectedRow == -1 ) {
            JOptionPane.showMessageDialog(null, "pilih barisan yang ingin dihapus");
            return;
        }
        String nama = txtnama.getText();
          
        int confirm = JOptionPane.showConfirmDialog(null, 
                "apakah yakin ignin menghapus data dengan nama : " + nama + "?","konfirmasi hapus",
        JOptionPane.YES_NO_OPTION);
        
        if (confirm == JOptionPane.YES_OPTION) {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/simawa", "root","");
            cn.createStatement().executeUpdate("DELETE FROM wisudawan_terbaik WHERE nama_mhs='" + nama + "'");
              
            JOptionPane.showMessageDialog(null, "data berhasil dihapus");
            getData();
        }
    }catch (Exception ex ) {
        JOptionPane.showMessageDialog(null, "error" + ex.getMessage());
        }
    }//GEN-LAST:event_btndeleteActionPerformed

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
            java.util.logging.Logger.getLogger(wisudawan_terbaik_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(wisudawan_terbaik_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(wisudawan_terbaik_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(wisudawan_terbaik_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new wisudawan_terbaik_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btninput;
    private javax.swing.JButton btnsimpan;
    private javax.swing.ButtonGroup fakultas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbguru;
    private javax.swing.JRadioButton rbkomputer;
    private javax.swing.JRadioButton rbpertanian;
    private javax.swing.JRadioButton rbsains;
    private javax.swing.JTable tbldata;
    private javax.swing.JTextField txtipk;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtprodi;
    private javax.swing.JTextField txtstudi;
    private javax.swing.JTextField txttahun;
    // End of variables declaration//GEN-END:variables

    private void getData() {
        int row = tbldata.getRowCount();
        for (int a=0; a<row; a++){
            model.removeRow(0);
        }
        try{ 
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/simawa",
                        "root","");
            ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM wisudawan_terbaik");
            while(rs.next()) {
                String data [] = {rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7) };
               
                    
                model.addRow(data);
                }
        }catch (SQLException ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }        
    }
    
}
    
        
