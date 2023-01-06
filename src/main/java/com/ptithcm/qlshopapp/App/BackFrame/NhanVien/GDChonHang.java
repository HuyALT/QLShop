/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ptithcm.qlshopapp.App.BackFrame.NhanVien;

import com.ptithcm.qlshopapp.DAO.Dao_SanPham;
import com.ptithcm.qlshopapp.Model.CTHoaDon;
import com.ptithcm.qlshopapp.Model.SanPham;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author PC
 */
public class GDChonHang extends javax.swing.JFrame {

    /**
     * Creates new form GDChonHang
     */
    private DefaultTableModel model;
    private List<SanPham> lsp;
    private List<CTHoaDon> lcthd;
    private TableRowSorter<TableModel> RowSorter;
    public GDChonHang() {
        lcthd = GDLapHD.getCTHD();
        lsp = new ArrayList<>();
        initComponents();
        initTable();
        filltable();
        this.RowSorter = new TableRowSorter<>(tblHangHoa.getModel());
        tblHangHoa.setRowSorter(RowSorter);
        txtTimKiem.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if (txtTimKiem.getText().trim().length() == 0) {
                    RowSorter.setRowFilter(null);
                } else {
                    RowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + txtTimKiem.getText().trim()));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if (txtTimKiem.getText().trim().length() == 0) {
                    RowSorter.setRowFilter(null);
                } else {
                    RowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + txtTimKiem.getText().trim()));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                if (txtTimKiem.getText().trim().length() == 0) {
                    RowSorter.setRowFilter(null);
                } else {
                    RowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + txtTimKiem.getText().trim()));
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHangHoa = new javax.swing.JTable();
        txtTimKiem = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblHangHoa.setModel(new javax.swing.table.DefaultTableModel(
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
        tblHangHoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHangHoaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHangHoa);

        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });

        jLabel2.setText("Tìm kiếm:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CHỌN HÀNG");

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThoat)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnThoat)
                .addGap(16, 16, 16))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblHangHoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHangHoaMouseClicked
        String tblMasp = model.getValueAt(tblHangHoa.getSelectedRow(), 0).toString();
        String tblTensp = model.getValueAt(tblHangHoa.getSelectedRow(), 1).toString();
        String tblKichthuoc = model.getValueAt(tblHangHoa.getSelectedRow(),2).toString();
        String tblSlton = model.getValueAt(tblHangHoa.getSelectedRow(), 3).toString();
        String tblgia = model.getValueAt(tblHangHoa.getSelectedRow(), 4).toString();
        
        SanPham sp = new SanPham();
        sp.setMasp(tblMasp);
        sp.setTensp(tblTensp);
        sp.setKichThuoc(tblKichthuoc);
        sp.setSlTon(Integer.parseInt(tblSlton));
        sp.setGia(Integer.parseInt(tblgia));
        this.setVisible(false);
        GDChitietHang obj = new GDChitietHang(sp);
        obj.setVisible(true);
        
    }//GEN-LAST:event_tblHangHoaMouseClicked

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        this.setVisible(false);
        GDLapHD obj = new GDLapHD();
        obj.setVisible(true);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        int position = txtTimKiem.getCaretPosition();
        txtTimKiem.setText(txtTimKiem.getText().toUpperCase());
        txtTimKiem.setCaretPosition(position);
    }//GEN-LAST:event_txtTimKiemKeyReleased

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
            java.util.logging.Logger.getLogger(GDChonHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GDChonHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GDChonHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GDChonHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GDChonHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHangHoa;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    private void initTable() {
        model = (DefaultTableModel) tblHangHoa.getModel();
        model.setColumnIdentifiers(new Object[]{
            "Ma san pham","Ten san pham","Kich thuoc", "So luong ton","Gia"
        });
        Dao_SanPham dao = new Dao_SanPham();
        try {
            lsp = dao.getAllSP();
        }
        catch (Exception ex)
        {
            Logger.getLogger(GDChonHang.class.getName()).log(Level.SEVERE,null,ex);
        }
        model.setRowCount(0);
    }
    private void filltable() {
        model.setRowCount(0);
        for (CTHoaDon cthd: lcthd)
        {
            SanPham sp = lsp.stream().filter(o->o.getMasp().equals(cthd.getMasp())).findFirst().orElse(null);
            if (sp!=null)
            {
                int slt = sp.getSlTon();
                int index = lsp.indexOf(sp);
                sp.setSlTon(slt-cthd.getSlban());
                lsp.set(index, sp);
            }
        }
        for (SanPham sp: lsp){
            Object[] row = new Object[]{
                sp.getMasp(), sp.getTensp(), sp.getKichThuoc(), sp.getSlTon(), sp.getGia()
            };
            model.addRow(row);
        }
        
    }
}
