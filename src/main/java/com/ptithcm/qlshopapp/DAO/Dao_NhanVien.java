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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class Dao_NhanVien {
    public boolean ThemNV(NhanVien nv) throws Exception {
        String sql = "INSERT INTO dbo.NHANVIEN(MANV, TENNV, GIOITINH, CMND, NGAYSINH, CHUCVU, TENTAIKHOAN, MATKHAU) VALUES(?,?,?,?,?,?,?,?)";
        try (
            Connection con = OpenConnectDataBase.OpenConnection();
            PreparedStatement pstm = con.prepareStatement(sql);)
        {
            pstm.setString(1, nv.getMaNV());
            pstm.setString(2, nv.getTenNV());
            pstm.setString(3, nv.getGioiTinh());
            pstm.setString(4, nv.getCmnd());
            pstm.setString(5, nv.getNgaySinh());
            pstm.setString(6, nv.getChucVu());
            pstm.setString(7, nv.getTenTK());
            pstm.setString(8, nv.getMkhau());
            
            return pstm.executeUpdate()>0;
        }
    }
    
    public List<NhanVien> getAllNV() throws Exception {
        List<NhanVien> lnv = new ArrayList<>();
        String sql = "Select * from NHANVIEN WHERE DANGHI=0";
        try (
                Connection con = OpenConnectDataBase.OpenConnection();
                PreparedStatement pstm = con.prepareStatement(sql);
                ResultSet rs = pstm.executeQuery();)
        {
            while (rs.next()){
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
                lnv.add(nv);
            }
            return lnv;
        }
    }
    
    public boolean UpdateTKMK(NhanVien nv) throws Exception {
        String sql = "Update NHANVIEN SET TENTAIKHOAN=?, MATKHAU=? WHERE MANV=?";
        try (
                Connection con = OpenConnectDataBase.OpenConnection();
                PreparedStatement pstm = con.prepareStatement(sql);){
            pstm.setString(1, nv.getTenTK());
            pstm.setString(2, nv.getMkhau());
            pstm.setString(3, nv.getMaNV());
            return pstm.executeUpdate()>0;
        }
    }
}
