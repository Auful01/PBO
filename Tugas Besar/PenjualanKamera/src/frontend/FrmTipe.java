/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.*;
//import backend.Tipe;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class FrmTipe extends javax.swing.JFrame {

    /**
     * Creates new form FrmTipe
     */
    public FrmTipe() {
        initComponents();
        KosongkanForm();
        tampilkanCmbMerek();
                tampilkanData();

    }

    public void KosongkanForm(){
        txtIdTipe.setText("0");
        txtCari.setText("");
        txtTipe.setText("");
        txtHarga.setText("0");
    }

    public void tampilkanData(){
        String[] kolom = {"ID Tipe","Merek","Tipe","Harga","Stok"};
        ArrayList<Tipe> list = new Tipe().getAllType();
        Object rowData[] = new Object[5];
        
        tblTipe.setModel(new DefaultTableModel(new Object[][] {}, kolom));
        
        for (int i = 0; i < list.size(); i++) {
            rowData[0] = list.get(i).getIdtipe();
            rowData[1] = list.get(i).getKamera().getMerek();
            rowData[2] = list.get(i).getTipe();
            rowData[3] = list.get(i).getHarga();
            rowData[4] = list.get(i).getStok();
            
            ((DefaultTableModel)tblTipe.getModel()).addRow(rowData);
        }
    }
    
    public void cari(String keyword){
        String[] kolom = {"ID Tipe","Merek","Tipe","Harga","Stok"};
        ArrayList<Tipe> list = new Tipe().searchType(keyword);
        Object rowData[] = new Object[5];
        
        tblTipe.setModel(new DefaultTableModel(new Object[][] {}, kolom));
        
        for (int i = 0; i < list.size(); i++) {
             rowData[0] = list.get(i).getIdtipe();
            rowData[1] = list.get(i).getKamera().getMerek();
            rowData[2] = list.get(i).getTipe();
            rowData[3] = list.get(i).getHarga();
            rowData[4] = list.get(i).getStok();

            ((DefaultTableModel)tblTipe.getModel()).addRow(rowData);
        }
    }
    
    public void tampilkanCmbMerek(){
        cmbMerek.setModel(new DefaultComboBoxModel(new Tipe().getKamera().getAll().toArray()));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbMerek = new javax.swing.JComboBox<>();
        txtIdTipe = new javax.swing.JTextField();
        txtTipe = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTipe = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        spStok = new javax.swing.JSpinner();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID Tipe");

        jLabel2.setText("Jenis Kamera");

        jLabel3.setText("Tipe");

        cmbMerek.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbMerek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMerekActionPerformed(evt);
            }
        });

        txtIdTipe.setEnabled(false);
        txtIdTipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdTipeActionPerformed(evt);
            }
        });

        jLabel4.setText("Harga");

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnTambah.setText("Tambah Baru");

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        tblTipe.setModel(new javax.swing.table.DefaultTableModel(
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
        tblTipe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTipeMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblTipe);

        jLabel5.setText("Stok");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHarga)
                            .addComponent(txtTipe)
                            .addComponent(txtIdTipe)
                            .addComponent(cmbMerek, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(174, 174, 174))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSimpan)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCari))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(62, 62, 62)
                                .addComponent(spStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 15, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbMerek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdTipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(spStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(btnSimpan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnHapus)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdTipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdTipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdTipeActionPerformed

    private void cmbMerekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMerekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMerekActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        Tipe tp = new Tipe();
        int i =0;
        tp.setIdtipe(Integer.parseInt(txtIdTipe.getText()));
        tp.setKamera((Kamera)cmbMerek.getSelectedItem());
        tp.setHarga(Integer.parseInt(txtHarga.getText()));
        tp.setTipe(txtTipe.getText());
        tp.setStok((Integer)spStok.getValue());
//        i++;
//        tp.setStok(i);
        tp.save();
        
        txtIdTipe.setText(Integer.toString(tp.getIdtipe()));
        
        tampilkanData();        // TODO add your handling code here:
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        DefaultTableModel model = (DefaultTableModel)tblTipe.getModel();
        int row = tblTipe.getSelectedRow();
        
        Tipe tp = new Tipe().getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
        tp.delete();
        KosongkanForm();
        tampilkanData();         // TODO add your handling code here:
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        cari(txtCari.getText());
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCariActionPerformed

    private void tblTipeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTipeMouseClicked
        DefaultTableModel model = (DefaultTableModel)tblTipe.getModel();
        int row = tblTipe.getSelectedRow();
        
        Tipe tp = new Tipe();
        tp = tp.getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
        
        cmbMerek.setSelectedIndex(tp.getIdkamera()-1);
        txtIdTipe.setText(String.valueOf(tp.getIdtipe()));
        txtTipe.setText(tp.getTipe());
        txtHarga.setText(String.valueOf(tp.getHarga()));
        spStok.setValue(tp.getStok());
        
        // TODO add your handling code here:
    }//GEN-LAST:event_tblTipeMouseClicked

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
            java.util.logging.Logger.getLogger(FrmTipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTipe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JComboBox<String> cmbMerek;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JSpinner spStok;
    private javax.swing.JTable tblTipe;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtIdTipe;
    private javax.swing.JTextField txtTipe;
    // End of variables declaration//GEN-END:variables
}