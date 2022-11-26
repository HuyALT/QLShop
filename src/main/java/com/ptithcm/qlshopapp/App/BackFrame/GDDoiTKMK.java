/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ptithcm.qlshopapp.App.BackFrame;

import com.ptithcm.qlshopapp.DAO.Dao_NhanVien;
import com.ptithcm.qlshopapp.Model.NhanVien;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author PC
 */
public class GDDoiTKMK extends javax.swing.JFrame {

    /**
     * Creates new form GDDoiTKMK
     */
    private NhanVien nv;
    private boolean checkmk = false;
    private boolean ischage = false;
    public GDDoiTKMK(NhanVien nv) {
        initComponents();
        this.nv = nv;
        if (nv!=null)
        {
            txtTK.setText(nv.getTenTK());
            txtpwht.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    String sMK = String.valueOf(txtpwht.getPassword()).trim();
                    if (sMK.length()==0) lblap1.setIcon(null);
                    else
                    if (sMK.compareTo(nv.getMkhau())==0)
                    {
                        lblap1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Apply.png")));
                        txtpwmoi.setEnabled(true);
                        txtpwht.setEnabled(false);
                        txtpwmoi.setFocusable(true);
                        lblap3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Delete.png")));
                    }
                    else
                    {
                        lblap1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Delete.png")));
                    }
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    String sMK = String.valueOf(txtpwht.getPassword()).trim();
                    if (sMK.length()==0) lblap1.setIcon(null);
                    else
                    if (sMK.compareTo(nv.getMkhau())==0)
                    {
                        lblap1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Apply.png")));
                        txtpwmoi.setEnabled(true);
                        txtpwht.setEnabled(false);
                        txtpwmoi.setFocusable(true);
                        lblap3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Delete.png")));
                    }
                    else
                    {
                        lblap1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Delete.png")));
                    }
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    String sMK = String.valueOf(txtpwht.getPassword()).trim();
                    if (sMK.length()==0) lblap1.setIcon(null);
                    else
                    if (sMK.compareTo(nv.getMkhau())==0)
                    {
                        lblap1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Apply.png")));
                        txtpwmoi.setEnabled(true);
                        txtpwht.setEnabled(false);
                        txtpwmoi.setFocusable(true);
                        lblap3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Delete.png")));
                    }
                    else
                    {
                        lblap1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Delete.png")));
                    }
                }
            });
            
            txtpwmoi.getDocument().addDocumentListener(new DocumentListener(){
                @Override
                public void insertUpdate(DocumentEvent e) {
                    
                    if (txtpwmoi.getPassword().length!=0){
                        txtpwxacnhan.setEnabled(true);
                    }
                    else txtpwxacnhan.setEnabled(false);
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    if (txtpwmoi.getPassword().length!=0){
                        txtpwxacnhan.setEnabled(true);
                    }
                    else txtpwxacnhan.setEnabled(false);
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    if (txtpwmoi.getPassword().length!=0){
                        txtpwxacnhan.setEnabled(true);
                    }
                    else txtpwxacnhan.setEnabled(false);
                }
            });
            
            txtpwxacnhan.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    String sMKm = String.valueOf(txtpwmoi.getPassword()).trim();
                    String sMKxn = String.valueOf(txtpwxacnhan.getPassword()).trim();
                    if (sMKm.compareTo(sMKxn)==0)
                    {
                        lblap3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Apply.png")));
                        txtpwxacnhan.setFocusable(true);
                        checkmk=true;
                    }
                    else
                    {
                        lblap3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Delete.png")));
                        checkmk = false;
                    }
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    String sMKm = String.valueOf(txtpwmoi.getPassword()).trim();
                    String sMKxn = String.valueOf(txtpwxacnhan.getPassword()).trim();
                    if (sMKm.compareTo(sMKxn)==0)
                    {
                        lblap3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Apply.png")));
                        txtpwxacnhan.setFocusable(true);
                        checkmk=true;
                    }
                    else
                    {
                        lblap3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Delete.png")));
                        checkmk = false;
                    }
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    String sMKm = String.valueOf(txtpwmoi.getPassword()).trim();
                    String sMKxn = String.valueOf(txtpwxacnhan.getPassword()).trim();
                    if (sMKm.compareTo(sMKxn)==0)
                    {
                        lblap3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Apply.png")));
                        txtpwxacnhan.setFocusable(true);
                        checkmk=true;
                    }
                    else
                    {
                        lblap3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Delete.png")));
                        checkmk = false;
                    }
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTK = new javax.swing.JTextField();
        txtpwht = new javax.swing.JPasswordField();
        txtpwmoi = new javax.swing.JPasswordField();
        txtpwxacnhan = new javax.swing.JPasswordField();
        lblap1 = new javax.swing.JLabel();
        lblap2 = new javax.swing.JLabel();
        lblap3 = new javax.swing.JLabel();
        btnxacnhan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tên Tài khoản:");

        jLabel2.setText("Mật khẩu hiện tại:");

        jLabel3.setText("Mật khẩu mới:");

        jLabel4.setText("Xác nhận mật khẩu:");

        txtTK.setText("jTextField1");
        txtTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTKActionPerformed(evt);
            }
        });

        txtpwmoi.setEnabled(false);

        txtpwxacnhan.setEnabled(false);

        lblap1.setToolTipText("");

        lblap2.setToolTipText("");

        lblap3.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTK, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                    .addComponent(txtpwht)
                    .addComponent(txtpwmoi)
                    .addComponent(txtpwxacnhan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblap1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblap2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblap3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblap1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(txtTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtpwht, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtpwmoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblap2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtpwxacnhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblap3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        btnxacnhan.setText("Xác nhận");
        btnxacnhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxacnhanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 31, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnxacnhan)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnxacnhan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTKActionPerformed

    private void btnxacnhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxacnhanActionPerformed
        if (!checkmk && txtpwht.getPassword().length != 0) {
            JOptionPane.showMessageDialog(this, "Lỗi! kiểm tra lại mật khẩu của bạn", "Lỗi", JOptionPane.WARNING_MESSAGE);
        } else {
            int n = JOptionPane.showConfirmDialog(this, "Xác nhận thay đổi", "Xác nhận", JOptionPane.YES_NO_OPTION);
            if (n == JOptionPane.YES_OPTION)
            {
            if (txtpwht.getPassword().length==0) {
                nv.setTenTK(txtTK.getText());
            }
            else
            {
                nv.setTenTK(txtTK.getText());
                nv.setMkhau(String.valueOf(txtpwmoi.getPassword()));
            }
            this.setVisible(false);
            GDThongtin obj = new GDThongtin(nv);
            obj.setVisible(true);
            try {
                new Dao_NhanVien().UpdateTKMK(nv);
            } catch (Exception ex) {
                Logger.getLogger(GDDoiTKMK.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        }
    }//GEN-LAST:event_btnxacnhanActionPerformed

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
            java.util.logging.Logger.getLogger(GDDoiTKMK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GDDoiTKMK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GDDoiTKMK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GDDoiTKMK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GDDoiTKMK(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnxacnhan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblap1;
    private javax.swing.JLabel lblap2;
    private javax.swing.JLabel lblap3;
    private javax.swing.JTextField txtTK;
    private javax.swing.JPasswordField txtpwht;
    private javax.swing.JPasswordField txtpwmoi;
    private javax.swing.JPasswordField txtpwxacnhan;
    // End of variables declaration//GEN-END:variables
}
