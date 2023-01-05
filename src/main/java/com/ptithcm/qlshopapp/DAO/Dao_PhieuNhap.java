/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.qlshopapp.DAO;

import com.ptithcm.qlshopapp.ConnectDataBase.OpenConnectDataBase;
import com.ptithcm.qlshopapp.Model.CTPhieuNhap;
import com.ptithcm.qlshopapp.Model.PhieuNhap;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class Dao_PhieuNhap {
    public boolean ThemPN(PhieuNhap pn) throws Exception {
        String sql = "INSERT INTO PHIEUNHAP(MAPN, NGAYNHAP, TONGTIEN, MANV) VALUES(?,?,?,?)";
        try (
                Connection con = OpenConnectDataBase.OpenConnection();
                PreparedStatement pstm = con.prepareStatement(sql);){
            pstm.setString(1, pn.getMapn());
            pstm.setString(2, pn.getNgay());
            pstm.setInt(3, pn.getTongtien());
            pstm.setString(4, pn.getManv());
            
            return pstm.executeUpdate()>0;
        }
    }
    
    public boolean ThemCTPN(CTPhieuNhap ctpn) throws Exception {
        String sql = "INSERT INTO CTPHIEUNHAP(MAPN, MASP, TENSANPHAM, SOLUONG, GIA, KICHTHUOC) VALUES(?,?,?,?,?,?)";
        try (
                Connection con = OpenConnectDataBase.OpenConnection();
                PreparedStatement pstm = con.prepareStatement(sql);){
            pstm.setString(1, ctpn.getMapn());
            pstm.setString(2, ctpn.getMasp());
            pstm.setString(3, ctpn.getTensp());
            pstm.setInt(4, ctpn.getSl());
            pstm.setInt(5, ctpn.getGia());
            pstm.setString(6, ctpn.getKichthuoc());
            
            return pstm.executeUpdate()>0;
        }
    }
    public List<CTPhieuNhap> getCTPN(PhieuNhap pn) throws Exception {
        String sql = "Select * from CTPHIEUNHAP Where MAPN = ?";
        List<CTPhieuNhap> lctpn = new ArrayList<>();
        try (
                Connection con = OpenConnectDataBase.OpenConnection();
                PreparedStatement pstm = con.prepareStatement(sql);){
            pstm.setString(1, pn.getMapn());
            try (ResultSet rs = pstm.executeQuery()){
                while (rs.next()){
                    CTPhieuNhap ctpn = new CTPhieuNhap();
                    ctpn.setMapn(rs.getString("MAPN"));
                    ctpn.setMasp(rs.getString("MASP"));
                    ctpn.setTensp(rs.getString("TENSANPHAM"));
                    ctpn.setSl(rs.getInt("SOLUONG"));
                    ctpn.setGia(rs.getInt("GIA"));
                    ctpn.setKichthuoc(rs.getString("KICHTHUOC"));
                    lctpn.add(ctpn);
                }
            }
        }
       return lctpn;
    }
    public List<PhieuNhap> getAllPNs() throws Exception {
        String sql = "Select * from PHIEUNHAP";
        List<CTPhieuNhap> lctpn = new ArrayList<>();
        List<PhieuNhap> lpn =  new ArrayList<>();
        try (
                Connection con = OpenConnectDataBase.OpenConnection();
                PreparedStatement pstm = con.prepareStatement(sql);
                ResultSet rs = pstm.executeQuery();){
            while (rs.next()) {
                PhieuNhap pn = new PhieuNhap();
                pn.setMapn(rs.getString("MAPN"));
                pn.setNgay(rs.getString("NGAYNHAP"));
                pn.setTongtien(rs.getInt("TONGTIEN"));
                pn.setManv(rs.getString("MANV"));
                lctpn = getCTPN(pn);
                pn.setLctpn(lctpn);
                lpn.add(pn);
            }
            
        }
        return lpn;
    }
    
}

    
