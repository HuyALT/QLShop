/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.qlshopapp.DAO;

import com.ptithcm.qlshopapp.ConnectDataBase.OpenConnectDataBase;
import com.ptithcm.qlshopapp.Model.CTHoaDon;
import com.ptithcm.qlshopapp.Model.HoaDon;
import com.ptithcm.qlshopapp.Model.NhanVien;
import com.ptithcm.qlshopapp.Model.SanPham;
import com.ptithcm.qlshopapp.Model.ThongBao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class Dao_Main {
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
    
    public boolean ThemSP(SanPham sp) throws Exception {
        String sql ="INSERT INTO dbo.SANPHAM(MA, TEN , SLTON, GIA, KICHTHUOC) VALUES(?,?,?,?,?)";
        try (
                Connection con = OpenConnectDataBase.OpenConnection();
                PreparedStatement pstm = con.prepareStatement(sql);)
        {
            pstm.setString(1, sp.getMasp());
            pstm.setString(2, sp.getTensp());
            pstm.setInt(3, sp.getSlTon());
            pstm.setInt(4, sp.getGia());
            pstm.setString(5, sp.getKichThuoc());
            
            return pstm.executeUpdate()>0;
        }
    }
    
    public boolean ThemTB(ThongBao tb) throws Exception {
        String sql = "INSERT INTO THONGBAO(MATB, NOIDUNG, NGAY) VALUES(?,?,?)";
        try (
                Connection con = OpenConnectDataBase.OpenConnection();
                PreparedStatement pstm = con.prepareStatement(sql);){
            pstm.setString(1, tb.getMatb());
            pstm.setString(2, tb.getNoidung());
            pstm.setString(3, tb.getNgay());
            
            return pstm.executeUpdate()>0;
        }
    }
    
    public boolean ThemHD(HoaDon hd) throws Exception {
        String sql = "INSERT INTO HOADON(MAHD, NGAY, TONGTIEN, TENKHACHHANG, SDTKH, MANV) VALUES(?,?,?,?,?,?)";
        try (
                Connection con = OpenConnectDataBase.OpenConnection();
                PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(1, hd.getMahd());
            pstm.setString(2, hd.getNgay());
            pstm.setInt(3, hd.getTongtien());
            pstm.setString(4, hd.getTenkhachhang());
            pstm.setString(5, hd.getSdtkh());
            pstm.setString(6, hd.getManv());
            
            return pstm.executeUpdate()>0;
        }
    }
    
    public boolean ThemCTHD(CTHoaDon cthd) throws Exception {
        String sql = "INSERT INTO CTHOADON(MAHD, MASP, TENSP, SOLUONGBAN, TONGTIENSP) VALUES(?,?,?,?,?)";
        try (
                Connection con = OpenConnectDataBase.OpenConnection();
                PreparedStatement pstm = con.prepareStatement(sql);){
            pstm.setString(1, cthd.getMahd());
            pstm.setString(2, cthd.getMasp());
            pstm.setString(3, cthd.getTensp());
            pstm.setInt(4, cthd.getSlban());
            pstm.setInt(5, cthd.getTongtiensp());
            
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
    
    public List<SanPham> getAllSP() throws Exception {
        List<SanPham> lsp = new ArrayList<>();
        String sql = "Select * from SANPHAM";
        try (
                Connection con = OpenConnectDataBase.OpenConnection();
                PreparedStatement pstm = con.prepareStatement(sql);
                ResultSet rs = pstm.executeQuery();){
            while (rs.next()) {
                SanPham sp = new SanPham();
                sp.setMasp(rs.getString("MA"));
                sp.setTensp(rs.getString("TEN"));
                sp.setSlTon(rs.getInt("SLTON"));
                sp.setGia(rs.getInt("GIA"));
                sp.setKichThuoc(rs.getString("KICHTHUOC"));
                lsp.add(sp);
            }
            return lsp;
        }
    }
    
    public List<ThongBao> getAllTB() throws Exception {
        List<ThongBao> ltb = new ArrayList<>();
        String sql = "Select * from THONGBAO";
        try (
                Connection con = OpenConnectDataBase.OpenConnection();
                PreparedStatement pstm = con.prepareStatement(sql);
                ResultSet rs = pstm.executeQuery();){
            while (rs.next()) {
                ThongBao tb = new ThongBao();
                tb.setMatb(rs.getString("MATB"));
                tb.setNoidung(rs.getString("NOIDUNG"));
                tb.setNgay(rs.getString("NGAY"));
                ltb.add(tb);
            }
            return ltb;
        }
    }
    
    public List<CTHoaDon> getCTHoaDons(HoaDon hd) throws Exception {
        List<CTHoaDon> lcthd = new ArrayList<>();
        String sql = "Select * from CTHOADON WHERE MAHD = ?";
        try (
                Connection con = OpenConnectDataBase.OpenConnection();
                PreparedStatement pstm = con.prepareStatement(sql);){
            pstm.setString(1, hd.getMahd());
            try (ResultSet rs = pstm.executeQuery();) {
                while (rs.next()){
                    CTHoaDon cthd = new CTHoaDon();
                    cthd.setMahd(rs.getString("MAHD"));
                    cthd.setMasp(rs.getString("MASP"));
                    cthd.setTensp(rs.getString("TENSP"));
                    cthd.setSlban(rs.getInt("SOLUONGBAN"));
                    cthd.setTongtiensp(rs.getInt("TONGTIENSP"));
                    lcthd.add(cthd);
                }
                return lcthd;
            }
        }
    }
    
    public List<HoaDon> getAllHoaDons() throws Exception {
        List<HoaDon> lhd = new ArrayList<>();
        List<CTHoaDon> lcthd = new ArrayList<>();
        String sql = "Select * from HOADON";
        try (
                Connection con = OpenConnectDataBase.OpenConnection();
                PreparedStatement pstm = con.prepareStatement(sql);
                ResultSet rs = pstm.executeQuery();) {
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setMahd(rs.getString("MAHD"));
                hd.setNgay(rs.getString("NGAY"));
                hd.setTongtien(rs.getInt("TONGTIEN"));
                hd.setTenkhachhang(rs.getString("TENKHACHHANG"));
                hd.setSdtkh(rs.getString("SDTKH"));
                hd.setManv(rs.getString("MANV"));
                lcthd = getCTHoaDons(hd);
                lhd.add(hd);
            }
            return lhd;
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
