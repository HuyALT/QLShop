/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ptithcm.qlshopapp.App.BackFrame.NhanVien;

import com.ptithcm.qlshopapp.Model.CTHoaDon;
import com.ptithcm.qlshopapp.Model.SanPham;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;



/**
 *
 * @author PC
 */
public class GDChitietHang extends javax.swing.JFrame {

    /**
     * Creates new form GDChitietHang
     */
    
    private SanPham sp;
    private CTHoaDon cthd;
    public GDChitietHang(SanPham sp) {
        initComponents();
        this.sp = sp;
        cthd = new CTHoaDon();
        if (sp!=null)
        {
            txtMasp.setText(sp.getMasp());
            txtTensp.setText(sp.getTensp());
            txtKichthuoc.setText(sp.getKichThuoc());
            txtSlton.setText(String.valueOf(sp.getSlTon()));
            txtgia.setText(String.valueOf(sp.getGia()));
            txtSlmua.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    int slmua = 0;                    
                    if (txtSlmua.getText().compareTo("")==0)
                    {
                        slmua = 0;
                        btnXacnhan.setEnabled(false);
                    }
                    else
                        slmua = Integer.parseInt(txtSlmua.getText());
                    if (slmua>sp.getSlTon()&&slmua==0)
                    {
                        slmua = sp.getSlTon();
                        lblLoi.setText("Số lượng không khả dụng");
                        btnXacnhan.setEnabled(false);
                    }
                    else{
                        lblLoi.setText("");
                        btnXacnhan.setEnabled(true);
                    }
                        
                    int gia = Integer.parseInt(txtgia.getText());
                    float vat = Float.parseFloat(lblVAT.getText());
                    txtTongtien.setText(String.valueOf((int)(slmua*gia+slmua*gia*vat)));
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    int slmua = 0;
                    if (txtSlmua.getText().compareTo("") == 0) {
                        slmua = 0;
                        btnXacnhan.setEnabled(false);
                    } else {
                        slmua = Integer.parseInt(txtSlmua.getText());
                    }
                    if (slmua>sp.getSlTon()&&slmua==0)
                    {
                        slmua = sp.getSlTon();
                        lblLoi.setText("Số lượng không khả dụng");
                        btnXacnhan.setEnabled(false);
                    }
                    else{
                        lblLoi.setText("");
                        btnXacnhan.setEnabled(true);
                    }
                    int gia = Integer.parseInt(txtgia.getText());
                    float vat = Float.parseFloat(lblVAT.getText());
                    txtTongtien.setText(String.valueOf((int)(slmua * gia + slmua * gia * vat)));
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    int slmua = 0;
                    if (txtSlmua.getText().compareTo("") == 0) {
                        slmua = 0;
                        btnXacnhan.setEnabled(false);
                    } else {
                        slmua = Integer.parseInt(txtSlmua.getText());
                    }
                    if (slmua>sp.getSlTon()&&slmua==0)
                    {
                        slmua = sp.getSlTon();
                        lblLoi.setText("Số lượng không khả dụng");
                        btnXacnhan.setEnabled(false);
                    }
                    else{
                        lblLoi.setText("");
                        btnXacnhan.setEnabled(true);
                    }
                    int gia = Integer.parseInt(txtgia.getText());
                    float vat = Float.parseFloat(lblVAT.getText());
                    txtTongtien.setText(String.valueOf((int)(slmua * gia + slmua * gia * vat)));
                }
            });
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMasp = new javax.swing.JTextField();
        txtTensp = new javax.swing.JTextField();
        txtSlmua = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSlton = new javax.swing.JTextField();
        btnXacnhan = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtKichthuoc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTongtien = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtgia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lblVAT = new javax.swing.JLabel();
        lblLoi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mã sản phẩm:");

        jLabel2.setText("Tên sản phẩm:");

        jLabel3.setText("Sô lượng mua:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DỮ LIỆU MUA");

        txtMasp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMasp.setFocusable(false);
        txtMasp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaspActionPerformed(evt);
            }
        });

        txtTensp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTensp.setFocusable(false);
        txtTensp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenspActionPerformed(evt);
            }
        });

        txtSlmua.setText("0");
        txtSlmua.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtSlmua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSlmuaActionPerformed(evt);
            }
        });
        txtSlmua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSlmuaKeyTyped(evt);
            }
        });

        jLabel5.setText("Số lượng tồn:");

        txtSlton.setFocusable(false);
        txtSlton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSltonKeyTyped(evt);
            }
        });

        btnXacnhan.setText("Xác nhận");
        btnXacnhan.setEnabled(false);
        btnXacnhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacnhanActionPerformed(evt);
            }
        });

        btnHuy.setText("Hủy");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        jLabel6.setText("Kích thước:");

        txtKichthuoc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtKichthuoc.setFocusable(false);
        txtKichthuoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKichthuocActionPerformed(evt);
            }
        });

        jLabel7.setText("Tổng tiền:");

        txtTongtien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTongtien.setFocusable(false);

        jLabel8.setText("Giá:");

        txtgia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtgia.setFocusable(false);

        jLabel9.setText("VAT(%):");

        lblVAT.setText("0");

        lblLoi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLoi.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(btnXacnhan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHuy))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6))
                                .addGap(69, 69, 69))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(72, 72, 72))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSlton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtKichthuoc)
                                            .addComponent(txtTensp)
                                            .addComponent(txtMasp)
                                            .addComponent(txtTongtien)
                                            .addComponent(txtgia, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblVAT, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtSlmua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblLoi, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel4)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMasp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtTensp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtKichthuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtSlton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSlmua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLoi))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTongtien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(lblVAT, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXacnhan)
                    .addComponent(btnHuy))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTenspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenspActionPerformed

    private void txtSltonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSltonKeyTyped
        char c = evt.getKeyChar();
        if ((c<'0' || c>'9')&&c!=' ')
            evt.consume();
    }//GEN-LAST:event_txtSltonKeyTyped

    private void txtSlmuaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSlmuaKeyTyped
        char c = evt.getKeyChar();
        if ((c<'0' || c>'9')&&c!=' ')
            evt.consume();
        
    }//GEN-LAST:event_txtSlmuaKeyTyped

    private void btnXacnhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacnhanActionPerformed
        this.setVisible(false);
        GDChonHang obj = new GDChonHang();
        obj.setVisible(true);
        AddCTHD();
    }//GEN-LAST:event_btnXacnhanActionPerformed

    private void txtMaspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaspActionPerformed

    private void txtKichthuocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKichthuocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKichthuocActionPerformed

    private void txtSlmuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSlmuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSlmuaActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        this.setVisible(false);
        GDChonHang obj = new GDChonHang();
        obj.setVisible(true);
    }//GEN-LAST:event_btnHuyActionPerformed

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
            java.util.logging.Logger.getLogger(GDChitietHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GDChitietHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GDChitietHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GDChitietHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GDChitietHang(null).setVisible(true);
            }
        });
    }
    private void AddCTHD()
    {
        cthd.setMasp(sp.getMasp());
        cthd.setTensp(sp.getTensp());
        cthd.setSlban(Integer.parseInt(txtSlmua.getText()));
        cthd.setTongtiensp(Integer.parseInt(txtTongtien.getText()));
        cthd.setKichthuoc(sp.getKichThuoc());
        GDLapHD.AddCTHD(cthd);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnXacnhan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblLoi;
    private javax.swing.JLabel lblVAT;
    private javax.swing.JTextField txtKichthuoc;
    private javax.swing.JTextField txtMasp;
    private javax.swing.JTextField txtSlmua;
    private javax.swing.JTextField txtSlton;
    private javax.swing.JTextField txtTensp;
    private javax.swing.JTextField txtTongtien;
    private javax.swing.JTextField txtgia;
    // End of variables declaration//GEN-END:variables
}
