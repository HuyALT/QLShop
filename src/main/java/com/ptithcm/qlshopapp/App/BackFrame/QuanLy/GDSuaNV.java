/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ptithcm.qlshopapp.App.BackFrame.QuanLy;


import com.ptithcm.qlshopapp.DAO.Dao_HoaDon;
import com.ptithcm.qlshopapp.DAO.Dao_NhanVien;
import com.ptithcm.qlshopapp.Model.NhanVien;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


/**
 *
 * @author Admin
 */
public class GDSuaNV extends javax.swing.JFrame {

    /**
     * Creates new form GDSuaNV
     */
    private NhanVien nv ;
    private List<NhanVien> lnv ;
    private NhanVien nvdefaut ;
   
    public GDSuaNV(NhanVien nv) {
        initComponents();
        this.setLocation(50, 100);
        this.nv = nv ;
        nvdefaut = nv  ;
        if (nv != null) {
            lblMaNV.setText(nv.getMaNV());
            txtTenNV.setText(nv.getTenNV());
             if (nv.getGioiTinh().compareTo("NAM")==0){
                RadioNam.setSelected(true);
            } else if(nv.getGioiTinh().compareTo("NỮ")==0){
                RadioNu.setSelected(true);
            } else {
                RadioKhac.setSelected(true);
            }
            txtCMND.setText(nv.getCmnd());
            Date sdate = null ;
            try {
                sdate = new SimpleDateFormat("yyyy-mm-dd").parse(nv.getNgaySinh());
            } catch (ParseException ex) {
                Logger.getLogger(GDSuaNV.class.getName()).log(Level.SEVERE, null, ex);
            }
            txtDatePicker.setDate(sdate);
            txtTKNV.setText(nv.getTenTK());
            txtMKNV.setText(nv.getMkhau());
            txtTenNV.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                   if (txtTenNV.getText().length() == 0) {
                       btnXN.setEnabled(false);
                   } else {
                       btnXN.setEnabled(true);
                   }
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    if (txtTenNV.getText().length() == 0) {
                       btnXN.setEnabled(false);
                   } else {
                        btnXN.setEnabled(true);
                    }
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    if (txtTenNV.getText().length() == 0) {
                       btnXN.setEnabled(false);
                   } else {
                        btnXN.setEnabled(true);
                    }
                }
            });
            txtCMND.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                   if(txtCMND.getText().length() == 0) {
                        btnXN.setEnabled(false);
                   } else {
                        btnXN.setEnabled(true);
                   }
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                   if(txtCMND.getText().length() == 0) {
                        btnXN.setEnabled(false);
                   } else {
                        btnXN.setEnabled(true);
                   }
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    if(txtCMND.getText().length() == 0) {
                        btnXN.setEnabled(false);
                   } else {
                        btnXN.setEnabled(true);
                   }
                }
            });
            txtTKNV.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                   if(txtTKNV.getText().length() == 0) {
                        btnXN.setEnabled(false);
                   } else {
                        btnXN.setEnabled(true);
                   }
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                   if(txtTKNV.getText().length() == 0) {
                        btnXN.setEnabled(false);
                   } else {
                        btnXN.setEnabled(true);
                   }
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    if(txtTKNV.getText().length() == 0) {
                        btnXN.setEnabled(false);
                   } else {
                        btnXN.setEnabled(true);
                   }
                }
            });
            txtMKNV.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                   if(txtMKNV.getText().length() == 0) {
                        btnXN.setEnabled(false);
                   } else {
                        btnXN.setEnabled(true);
                   }
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                   if(txtMKNV.getText().length() == 0) {
                        btnXN.setEnabled(false);
                   } else {
                        btnXN.setEnabled(true);
                   }
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    if(txtMKNV.getText().length() == 0) {
                        btnXN.setEnabled(false);
                   } else {
                        btnXN.setEnabled(true);
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

        btnGroupRadio = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblMaNV = new javax.swing.JLabel();
        txtTenNV = new javax.swing.JTextField();
        txtCMND = new javax.swing.JTextField();
        txtTKNV = new javax.swing.JTextField();
        txtMKNV = new javax.swing.JTextField();
        btnXN = new javax.swing.JButton();
        btnMĐ = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        txtDatePicker = new com.toedter.calendar.JDateChooser();
        RadioNam = new javax.swing.JRadioButton();
        RadioNu = new javax.swing.JRadioButton();
        RadioKhac = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sửa Nhân Viên");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setText("Mã nhân viên:");

        jLabel3.setText("Tên nhân viên:");

        jLabel4.setText("Giới tính:");

        jLabel5.setText("CMND:");

        jLabel6.setText("Ngày sinh:");

        jLabel8.setText("Tên tài khoản:");

        jLabel9.setText("Mật khẩu:");

        lblMaNV.setText("jLabel10");

        txtCMND.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCMNDKeyTyped(evt);
            }
        });

        btnXN.setText("Xác nhận");
        btnXN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXNActionPerformed(evt);
            }
        });

        btnMĐ.setText("Đặt lại");
        btnMĐ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMĐActionPerformed(evt);
            }
        });

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        txtDatePicker.setDateFormatString("yyyy - mm - dd");

        btnGroupRadio.add(RadioNam);
        RadioNam.setText("Nam");
        RadioNam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RadioNamMouseClicked(evt);
            }
        });

        btnGroupRadio.add(RadioNu);
        RadioNu.setText("Nữ");

        btnGroupRadio.add(RadioKhac);
        RadioKhac.setText("Khác");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtTenNV)
                        .addComponent(lblMaNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCMND)
                        .addComponent(txtTKNV)
                        .addComponent(txtMKNV, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RadioNam)
                        .addGap(18, 18, 18)
                        .addComponent(RadioNu)
                        .addGap(18, 18, 18)
                        .addComponent(RadioKhac)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(btnXN, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btnMĐ, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RadioNam)
                    .addComponent(RadioNu)
                    .addComponent(RadioKhac))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTKNV, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMKNV, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXN, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMĐ, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(114, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMĐActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMĐActionPerformed
            txtTenNV.setText(nvdefaut.getTenNV());
            if (nvdefaut.getGioiTinh().compareTo("NAM")==0){
                RadioNam.setSelected(true);
            } else if(nvdefaut.getGioiTinh().compareTo("NỮ")==0){
                RadioNu.setSelected(true);
            } else {
                RadioKhac.setSelected(true);
            }
            txtCMND.setText(nvdefaut.getCmnd());
            Date sdate = null ;
            try {
                sdate = new SimpleDateFormat("yyyy-mm-dd").parse(nvdefaut.getNgaySinh());
            } catch (ParseException ex) {
                Logger.getLogger(GDSuaNV.class.getName()).log(Level.SEVERE, null, ex);
            }
            txtDatePicker.setDate(sdate);
            txtTKNV.setText(nvdefaut.getTenTK());
            txtMKNV.setText(nvdefaut.getMkhau());
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMĐActionPerformed

    private void txtCMNDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCMNDKeyTyped
         char c = evt.getKeyChar();
        if ((c<'0' || c>'9')&&c!=' ')
            evt.consume();
    }//GEN-LAST:event_txtCMNDKeyTyped

    private void RadioNamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RadioNamMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioNamMouseClicked

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        this.setVisible(false);
        GDXemDSNV obj = new GDXemDSNV() ;
        obj.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnXNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXNActionPerformed
        int dig = JOptionPane.showConfirmDialog(this, "Xác nhận sửa nhân viên","Sửa nhân viên",JOptionPane.YES_NO_OPTION);
        if (dig == JOptionPane.YES_OPTION){
            NhanVien snv = new NhanVien() ;
            snv.setMaNV(lblMaNV.getText());
            snv.setTenNV(txtTenNV.getText());
            if (RadioNam.isSelected()) {
                snv.setGioiTinh("NAM");
            } else if (RadioNu.isSelected()) {
                snv.setGioiTinh("NỮ");
            } else {
                snv.setGioiTinh("KHÁC");
            }
            snv.setCmnd(txtCMND.getText());
            SimpleDateFormat sformat = new SimpleDateFormat("yyyy-mm-dd") ;
            String sdate = sformat.format(txtDatePicker.getDate()) ;
            snv.setNgaySinh(sdate);
            snv.setTenTK(txtTKNV.getText());
            snv.setMkhau(txtMKNV.getText());
            snv.setChucVu(nvdefaut.getChucVu());
            Dao_NhanVien dao = new Dao_NhanVien();
            try {
                dao.UpdateNV(snv) ;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Lỗi SQL DAO_HOADON", "SQL ERROR", JOptionPane.ERROR_MESSAGE);
            }
            this.setVisible(false);
            GDXemDSNV obj = new GDXemDSNV() ;
            obj.setVisible(true);
            
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXNActionPerformed

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
            java.util.logging.Logger.getLogger(GDSuaNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GDSuaNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GDSuaNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GDSuaNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GDSuaNV(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RadioKhac;
    private javax.swing.JRadioButton RadioNam;
    private javax.swing.JRadioButton RadioNu;
    private javax.swing.ButtonGroup btnGroupRadio;
    private javax.swing.JButton btnMĐ;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMaNV;
    private javax.swing.JTextField txtCMND;
    private com.toedter.calendar.JDateChooser txtDatePicker;
    private javax.swing.JTextField txtMKNV;
    private javax.swing.JTextField txtTKNV;
    private javax.swing.JTextField txtTenNV;
    // End of variables declaration//GEN-END:variables

  
}
