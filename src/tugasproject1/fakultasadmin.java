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

public class fakultasadmin extends javax.swing.JFrame {

    DefaultTableModel model;
    
    public fakultasadmin() {
        initComponents();
        String[] judul = {"jenjang","program studi"};
        model = new DefaultTableModel(judul,0);
        tbldata2.setModel(model);
        getData();
        
        cmbjenjang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{
            "S1","S2"}));
        
        tbldata2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int row =tbldata2.getSelectedRow();
              
                txtprogram.setText(tbldata2.getValueAt(row, 1).toString());
                cmbjenjang.setSelectedItem(tbldata2.getValueAt(row, 2).toString());
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

        jPanel1 = new javax.swing.JPanel();
        txtprogram = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btninput = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnsimpan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldata2 = new javax.swing.JTable();
        cmbjenjang = new javax.swing.JComboBox<>();
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

        jLabel1.setText("program studi");

        jLabel2.setText("jenjang");

        btninput.setText("INPUT");
        btninput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninputActionPerformed(evt);
            }
        });

        btnedit.setText("EDIT");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btnhapus.setText("HAPUS");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        btnsimpan.setText("SIMPAN");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        tbldata2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "jenjang", "program studi"
            }
        ));
        jScrollPane1.setViewportView(tbldata2);

        cmbjenjang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(txtprogram, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(btninput)))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnedit)
                                .addGap(61, 61, 61)
                                .addComponent(btnhapus)
                                .addGap(52, 52, 52)
                                .addComponent(btnsimpan))
                            .addComponent(jLabel2)
                            .addComponent(cmbjenjang, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtprogram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbjenjang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btninput)
                    .addComponent(btnedit)
                    .addComponent(btnhapus)
                    .addComponent(btnsimpan))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btninputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninputActionPerformed
    try {
         Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/simawa","root","");
         
         String program = txtprogram.getText();
         String jenjang = cmbjenjang.getSelectedItem().toString();
         
  
         cn.createStatement().executeUpdate("INSERT INTO program_studi (program,Jenjang) VALUES  ("
         + "'" + program + "',"
         + "'" + jenjang + "')");
    getData();
     }catch (SQLException ex) {
         JOptionPane.showMessageDialog(null,"gagal simpan : " + ex.getMessage());
     }
    }//GEN-LAST:event_btninputActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
    try {
         int selectedRow = tbldata2.getSelectedRow();
         if (selectedRow == -1 ) {
             JOptionPane.showMessageDialog(null, "pilih baris yang akan diedit!!");
             return;
         }
         
         String program = txtprogram.getText();
         String jenjang = cmbjenjang.getSelectedItem().toString();
        
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/simawa","root","");
        cn.createStatement().executeUpdate(
           "UPDATE program_studi SET program='" + program + "',Jenjang='" + jenjang +"'WHERE program='" + program + "'");
         JOptionPane.showMessageDialog(null, "program studi berhasil diubah");
         getData();
    }catch (Exception ex) {
         JOptionPane.showMessageDialog(null, "error : " + ex.getMessage());
     }
    }//GEN-LAST:event_btneditActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
    try{
          int selectedRow = tbldata2.getSelectedRow();
          if (selectedRow == -1 ) {
              JOptionPane.showMessageDialog(null, "pilih barisan yang ingin dihapus");
              return;
          }
          String program = txtprogram.getText();
          
          int confirm = JOptionPane.showConfirmDialog(null, 
                  "apakah yakin ingin menghapus program studi ini: " + program + "?","konfirmasi hapus",
                  JOptionPane.YES_NO_OPTION);
          
          if (confirm == JOptionPane.YES_OPTION) {
              Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/simawa", "root","");
              cn.createStatement().executeUpdate("DELETE FROM program_studi WHERE program='" + program + "'");
              
              JOptionPane.showMessageDialog(null, "program studi berhasil dihapus");
              getData();
          }
    }catch (Exception ex ) {
          JOptionPane.showMessageDialog(null, "error" + ex.getMessage());
      }
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
    JFileChooser fileChooser =new JFileChooser();
        int option = fileChooser.showSaveDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            String path = fileChooser.getSelectedFile().getAbsolutePath();
        if (!path.toLowerCase().endsWith(".csv")) {
            path += ".csv";
            }
            saveTableToCSV(tbldata2,path);
        }
    }//GEN-LAST:event_btnsimpanActionPerformed

    
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
            java.util.logging.Logger.getLogger(fakultasadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fakultasadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fakultasadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fakultasadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fakultasadmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btninput;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JComboBox<String> cmbjenjang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JTable tbldata2;
    private javax.swing.JTextField txtprogram;
    // End of variables declaration//GEN-END:variables

    private void getData() {
        int row = tbldata2.getRowCount();
        for (int a=0; a<row; a++){
            model.removeRow(0);
        }
        try{ 
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/simawa",
                        "root","");
            ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM program_studi");
            while(rs.next()) {
                String data [] = {rs.getString(1),
                    rs.getString(2)};
                model.addRow(data);
                }
        }catch (SQLException ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }        
    }
    
}

