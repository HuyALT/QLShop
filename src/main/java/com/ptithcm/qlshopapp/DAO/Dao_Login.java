/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.qlshopapp.DAO;

import com.ptithcm.qlshopapp.ConnectDataBase.OpenConnectDataBase;
import com.ptithcm.qlshopapp.Model.NhanVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author PC
 */
public class Dao_Login {
    public static NhanVien nvlogin;
    public static NhanVien CheckLogin(String username, String pass) throws Exception {
        String sql = "Select * from NHANVIEN Where TENTAIKHOAN=? AND MATKHAU=?";
        try (
                Connection con = OpenConnectDataBase.OpenConnection();
                PreparedStatement pstm = con.prepareStatement(sql);)
        {
            pstm.setString(1, username);
            pstm.setString(2, pass);
            ResultSet rs = pstm.executeQuery();
            if (rs.next())
            {
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getString("MANV"));
                nv.setTenNV(rs.getString("TENNV"));
                nv.setGioiTinh(rs.getString("GIOITINH"));
                nv.setCmnd(rs.getString("CMND"));
                nv.setNgaySinh(rs.getString("NGAYSINH"));
                nv.setChucVu(rs.getString("CHUCVU"));
                nv.setTenTK(rs.getString("TENTAIKHOAN"));
                nv.setMkhau(rs.getString("MATKHAU"));
                nv.setDaNghi(rs.getBoolean("DANGHI"));
                nvlogin = nv;
                return nv;
            }
            return null;
        }
    }
}
