/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ptithcm.qlshopapp.App.BackFrame.QuanLy;

import com.ptithcm.qlshopapp.App.BackFrame.NhanVien.GDLapHD;
import com.ptithcm.qlshopapp.DAO.Dao_NhanVien;
import com.ptithcm.qlshopapp.Model.NhanVien;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Admin
 */
public class GDThemNV extends javax.swing.JFrame {

    /**
     * Creates new form GDThemNV
     */
    private List<NhanVien> lnv ;
    public GDThemNV() {
        initComponents();
        this.setLocation(100, 200);
        btnXN.setEnabled(false);
        LocalDate localDate = LocalDate.now();
        Date sdate = null ;
            try {
                sdate = new SimpleDateFormat("yyyy-mm-dd").parse(localDate.format(DateTimeFormatter.ISO_LOCAL_DATE));
            } catch (ParseException ex) {
                Logger.getLogger(GDSuaNV.class.getName()).log(Level.SEVERE, null, ex);
            }
        DatePicker.setDate(sdate);
        txtTenNV.getDocument().addDocumentListener(new DocumentListener(){
            @Override
            public void insertUpdate(DocumentEvent e) {
                if (txtTenNV.getText().length() == 0) {
                    btnXN.setEnabled(false);
                } else if (txtCMND.getText().length() == 0 || txtTenTK.getText().length() == 0 || txtMK.getText().length() ==0) {
                    btnXN.setEnabled(false);
                } else {
                    btnXN.setEnabled(true);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                 if (txtTenNV.getText().length() == 0) {
                    btnXN.setEnabled(false);
                } else if (txtCMND.getText().length() == 0 || txtTenTK.getText().length() == 0 || txtMK.getText().length() ==0) {
                    btnXN.setEnabled(false);
                } else {
                    btnXN.setEnabled(true);
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                if (txtTenNV.getText().length() == 0) {
                    btnXN.setEnabled(false);
                } else if (txtCMND.getText().length() == 0 || txtTenTK.getText().length() == 0 || txtMK.getText().length() ==0) {
                    btnXN.setEnabled(false);
                } else {
                    btnXN.setEnabled(true);
                }
            }
            
        });
        txtCMND.getDocument().addDocumentListener(new DocumentListener(){
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(txtCMND.getText().length() == 0 ){
                    btnXN.setEnabled(false);
                } else if (txtTenNV.getText().length() == 0 || txtTenTK.getText().length()==0 || txtMK.getText().length() == 0) {
                    btnXN.setEnabled(false);
                } else {
                    btnXN.setEnabled(true);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                 if(txtCMND.getText().length() == 0 ){
                    btnXN.setEnabled(false);
                } else if (txtTenNV.getText().length() == 0 || txtTenTK.getText().length()==0 || txtMK.getText().length() == 0) {
                    btnXN.setEnabled(false);
                } else {
                    btnXN.setEnabled(true);
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                 if(txtCMND.getText().length() == 0 ){
                    btnXN.setEnabled(false);
                } else if (txtTenNV.getText().length() == 0 || txtTenTK.getText().length()==0 || txtMK.getText().length() == 0) {
                    btnXN.setEnabled(false);
                } else {
                    btnXN.setEnabled(true);
                }
            }
            
        });
        txtTenTK.getDocument().addDocumentListener(new DocumentListener(){
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(txtTenTK.getText().length()==0) {
                    btnXN.setEnabled(false);
                } else if (txtTenNV.getText().length() == 0 || txtCMND.getText().length() == 0 || txtMK.getText().length() ==0) {
                    btnXN.setEnabled(false);
                } else {
                    btnXN.setEnabled(true);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if(txtTenTK.getText().length()==0) {
                    btnXN.setEnabled(false);
                } else if (txtTenNV.getText().length() == 0 || txtCMND.getText().length() == 0 || txtMK.getText().length() ==0) {
                    btnXN.setEnabled(false);
                } else {
                    btnXN.setEnabled(true);
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                 if(txtTenTK.getText().length()==0) {
                    btnXN.setEnabled(false);
                } else if (txtTenNV.getText().length() == 0 || txtCMND.getText().length() == 0 || txtMK.getText().length() ==0) {
                    btnXN.setEnabled(false);
                } else {
                    btnXN.setEnabled(true);
                }
            }
            
        });
        txtMK.getDocument().addDocumentListener(new DocumentListener(){
            @Override
            public void insertUpdate(DocumentEvent e) {
                 if(txtMK.getText().length()==0) {
                     btnXN.setEnabled(false);
                 } else if (txtTenNV.getText().length() == 0 || txtCMND.getText().length() == 0 || txtTenTK.getText().length() == 0) {
                     btnXN.setEnabled(false);
                 } else {
                     btnXN.setEnabled(true);
                 }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if(txtMK.getText().length()==0) {
                     btnXN.setEnabled(false);
                 } else if (txtTenNV.getText().length() == 0 || txtCMND.getText().length() == 0 || txtTenTK.getText().length() == 0) {
                     btnXN.setEnabled(false);
                 } else {
                     btnXN.setEnabled(true);
                 }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
               if(txtMK.getText().length()==0) {
                     btnXN.setEnabled(false);
                 } else if (txtTenNV.getText().length() == 0 || txtCMND.getText().length() == 0 || txtTenTK.getText().length() == 0) {
                     btnXN.setEnabled(false);
                 } else {
                     btnXN.setEnabled(true);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTenNV = new javax.swing.JTextField();
        RadioNam = new javax.swing.JRadioButton();
        RadioNu = new javax.swing.JRadioButton();
        RadioKhac = new javax.swing.JRadioButton();
        txtCMND = new javax.swing.JTextField();
        DatePicker = new com.toedter.calendar.JDateChooser();
        txtTenTK = new javax.swing.JTextField();
        txtMK = new javax.swing.JTextField();
        btnXN = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        AlignTenNV = new javax.swing.JLabel();
        AlignCMND = new javax.swing.JLabel();
        AlignTenTK = new javax.swing.JLabel();
        AlignMK = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thêm Nhân Viên");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        jLabel2.setText("Tên nhân viên:");

        jLabel3.setText("Giới tính:");

        jLabel4.setText("CMND:");

        jLabel5.setText("Ngày sinh:");

        jLabel6.setText("Tên tài khoản:");

        jLabel7.setText("Mật khẩu:");

        txtTenNV.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTenNVFocusLost(evt);
            }
        });

        buttonGroup1.add(RadioNam);
        RadioNam.setSelected(true);
        RadioNam.setText("Nam");

        buttonGroup1.add(RadioNu);
        RadioNu.setText("Nữ");

        buttonGroup1.add(RadioKhac);
        RadioKhac.setText("Khác");

        txtCMND.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCMNDFocusLost(evt);
            }
        });
        txtCMND.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCMNDKeyTyped(evt);
            }
        });

        DatePicker.setDateFormatString("yyyy - mm - dd");

        btnXN.setText("Xác nhận");
        btnXN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXNActionPerformed(evt);
            }
        });

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTenNV)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RadioNam, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RadioNu, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RadioKhac, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCMND)
                    .addComponent(txtTenTK)
                    .addComponent(txtMK, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(DatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AlignTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AlignCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AlignTenTK, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AlignMK, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnXN, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AlignTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RadioNam)
                    .addComponent(RadioNu)
                    .addComponent(RadioKhac))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AlignCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AlignTenTK, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AlignMK, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXN)
                    .addComponent(btnThoat))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCMNDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCMNDKeyTyped
         char c = evt.getKeyChar();
         if ((c<'0' || c>'9')&&c!=' ')
            evt.consume();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCMNDKeyTyped

    private void btnXNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXNActionPerformed
        int dig = JOptionPane.showConfirmDialog(this, "Xác nhận thêm nhân viên","Sửa nhân viên",JOptionPane.YES_NO_OPTION);
        if (dig == JOptionPane.YES_OPTION){
            Dao_NhanVien dao = new Dao_NhanVien() ;
            NhanVien nv = new NhanVien() ;
            try {
                lnv = dao.getAllNV();
            } catch (Exception ex) {
                Logger.getLogger(GDThemNV.class.getName()).log(Level.SEVERE, null, ex);
            }
            int soNV = lnv.size()+1 ;
            String manv = "Y22NV" + String.format("%03d", soNV) ;
            System.out.println(manv);
            nv.setMaNV(manv);
            nv.setTenNV(txtTenNV.getText());
            if (RadioNam.isSelected()) {
                    nv.setGioiTinh("NAM");
                } else if (RadioNu.isSelected()) {
                    nv.setGioiTinh("NỮ");
                } else {
                    nv.setGioiTinh("KHÁC");
                }
            nv.setCmnd(txtCMND.getText());
            SimpleDateFormat sformat = new SimpleDateFormat("yyyy-mm-dd") ;
            String sdate = sformat.format(DatePicker.getDate()) ;
            nv.setNgaySinh(sdate);
            nv.setChucVu("NHÂN VIÊN");
            nv.setTenTK(txtTenTK.getText());
            nv.setMkhau(txtMK.getText());
            try {
                dao.ThemNV(nv );
            } catch (Exception ex) {
                Logger.getLogger(GDThemNV.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.setVisible(false);
            GDXemDSNV obj = new GDXemDSNV() ;
            obj.setVisible(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXNActionPerformed

    private void txtTenNVFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTenNVFocusLost
        
    }//GEN-LAST:event_txtTenNVFocusLost

    private void txtCMNDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCMNDFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCMNDFocusLost

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        this.setVisible(false);
        GDXemDSNV obj = new GDXemDSNV() ;
        obj.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThoatActionPerformed

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
            java.util.logging.Logger.getLogger(GDThemNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GDThemNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GDThemNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GDThemNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GDThemNV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AlignCMND;
    private javax.swing.JLabel AlignMK;
    private javax.swing.JLabel AlignTenNV;
    private javax.swing.JLabel AlignTenTK;
    private com.toedter.calendar.JDateChooser DatePicker;
    private javax.swing.JRadioButton RadioKhac;
    private javax.swing.JRadioButton RadioNam;
    private javax.swing.JRadioButton RadioNu;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXN;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextField txtMK;
    private javax.swing.JTextField txtTenNV;
    private javax.swing.JTextField txtTenTK;
    // End of variables declaration//GEN-END:variables

    
}
