/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.qlshopapp.DAO;

import com.ptithcm.qlshopapp.ConnectDataBase.OpenConnectDataBase;
import com.ptithcm.qlshopapp.Model.CTHoaDon;
import com.ptithcm.qlshopapp.Model.CTPhieuNhap;
import com.ptithcm.qlshopapp.Model.SanPham;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class Dao_SanPham {
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
    public List<SanPham> getListSP() throws Exception {
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
                if(sp.getSlTon() != 0) {
                     lsp.add(sp);
                }
            }
            return lsp;
        }
    }
    
    public boolean CapnhatSPtheoHD(String mahd)
    {
        String sql = "{call SP_CAP_NHAT_TU_HD(?)}";
        try (
                Connection con = OpenConnectDataBase.OpenConnection();
             ){
            try (CallableStatement ctmt = con.prepareCall(sql);){
                con.setAutoCommit(false);
                ctmt.setString(1, mahd);
                ctmt.execute();
                con.commit();
                return true;
            }catch (Exception ex){
                con.rollback();
                return false;
            }
            
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    //PHIEU NHAP
    public boolean CapnhatSPsanco(CTPhieuNhap ctpn) throws Exception
    {
        String sql = "UPDATE SANPHAM SET SLTON = SLTON+? WHERE MA = ?";
        try (
                Connection con = OpenConnectDataBase.OpenConnection();
                PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setInt(1, ctpn.getSl());
            pstm.setString(2, ctpn.getMasp());
            
            return pstm.executeUpdate()>0;
        }
    }
    public boolean ThemMoiSP(CTPhieuNhap ctpn) throws Exception
    {
        List<SanPham> lsp = getAllSP();
        int sosp = lsp.size()+1;
        String masp = "SP" + String.format("%03d", sosp);
        SanPham sp = new SanPham();
        sp.setMasp(masp);
        sp.setSlTon(ctpn.getSl());
        sp.setGia(ctpn.getGia());
        sp.setKichThuoc(ctpn.getKichthuoc());
        sp.setTensp(ctpn.getTensp());
        return ThemSP(sp);
    }
    public boolean KiemTraSPtontai(CTPhieuNhap ctpn) throws Exception
    {
        String sql = "Select MA From SANPHAM Where TEN = ? and GIA = ? and KICHTHUOC = ?";
        try (
                Connection con = OpenConnectDataBase.OpenConnection();
                PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(1, ctpn.getTensp());
            pstm.setInt(2, ctpn.getGia());
            pstm.setString(3, ctpn.getKichthuoc());
            try (ResultSet rs = pstm.executeQuery();) {
                return rs.next();
            }
            
        }
    }
    //LOC
    public List<SanPham> SapXepSP(int selec) throws Exception{
         List<SanPham> lsp = new ArrayList<>();
         String sql ;
         if (selec == 1) {
             sql = "Select* FROM SANPHAM ORDER BY TEN ASC" ;
         } else if (selec == 2) {
             sql = "Select* FROM SANPHAM ORDER BY KICHTHUOC ASC" ;
         } else if (selec == 3) {
             sql = "Select* FROM SANPHAM ORDER BY SLTON ASC" ;
         } else {
             sql = "Select* FROM SANPHAM ORDER BY GIA ASC" ;
         }
         try(
                 Connection con = OpenConnectDataBase.OpenConnection() ;
                 PreparedStatement pstm = con.prepareStatement(sql) ;
                 ResultSet rs = pstm.executeQuery() ;
                 ){
             while(rs.next()) {
                     SanPham sp = new SanPham() ;
                     sp.setMasp(rs.getString("MA"));
                     sp.setTensp(rs.getString("TEN"));
                     sp.setSlTon(rs.getInt("SLTON"));
                     sp.setGia(rs.getInt("GIA"));
                     sp.setKichThuoc(rs.getString("KICHTHUOC"));
                     if(sp.getSlTon() != 0) {
                         lsp.add(sp) ;
                     }
                 }
             return lsp ;
         }
    }
    public boolean XoaSanPham(String maSP) throws  Exception{
        String sql = "Update SANPHAM SET SLTON=0 WHERE MA=?" ;
        try (
                Connection con = OpenConnectDataBase.OpenConnection() ;
                PreparedStatement pstm = con.prepareStatement(sql );
            ){
             
                pstm.setString(1, maSP);
  
                return pstm.executeUpdate() > 0 ;
        } 
    }
}
