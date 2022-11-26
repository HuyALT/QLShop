/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.qlshopapp.DAO;

import com.ptithcm.qlshopapp.ConnectDataBase.OpenConnectDataBase;
import com.ptithcm.qlshopapp.Model.CTHoaDon;
import com.ptithcm.qlshopapp.Model.HoaDon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class Dao_HoaDon {

    public boolean ThemHD(HoaDon hd) throws Exception {
        String sql = "INSERT INTO HOADON(MAHD, NGAY, TONGTIEN, TENKHACHHANG, SDTKH, MANV) VALUES(?,?,?,?,?,?)";
        try (
                 Connection con = OpenConnectDataBase.OpenConnection();  PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(1, hd.getMahd());
            pstm.setString(2, hd.getNgay());
            pstm.setInt(3, hd.getTongtien());
            pstm.setString(4, hd.getTenkhachhang());
            pstm.setString(5, hd.getSdtkh());
            pstm.setString(6, hd.getManv());

            return pstm.executeUpdate() > 0;
        }
    }

    public boolean ThemCTHD(CTHoaDon cthd) throws Exception {
        String sql = "INSERT INTO CTHOADON(MAHD, MASP, TENSP, SOLUONGBAN, TONGTIENSP) VALUES(?,?,?,?,?)";
        try (
                 Connection con = OpenConnectDataBase.OpenConnection();  PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(1, cthd.getMahd());
            pstm.setString(2, cthd.getMasp());
            pstm.setString(3, cthd.getTensp());
            pstm.setInt(4, cthd.getSlban());
            pstm.setInt(5, cthd.getTongtiensp());

            return pstm.executeUpdate() > 0;
        }
    }

    public List<CTHoaDon> getCTHoaDons(HoaDon hd) throws Exception {
        List<CTHoaDon> lcthd = new ArrayList<>();
        String sql = "Select * from CTHOADON WHERE MAHD = ?";
        try (
                 Connection con = OpenConnectDataBase.OpenConnection();  PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(1, hd.getMahd());
            try ( ResultSet rs = pstm.executeQuery();) {
                while (rs.next()) {
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
                 Connection con = OpenConnectDataBase.OpenConnection();  PreparedStatement pstm = con.prepareStatement(sql);  ResultSet rs = pstm.executeQuery();) {
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setMahd(rs.getString("MAHD"));
                hd.setNgay(rs.getString("NGAY"));
                hd.setTongtien(rs.getInt("TONGTIEN"));
                hd.setTenkhachhang(rs.getString("TENKHACHHANG"));
                hd.setSdtkh(rs.getString("SDTKH"));
                hd.setManv(rs.getString("MANV"));
                lcthd = getCTHoaDons(hd);
                hd.setCthd(lcthd);
                lhd.add(hd);
            }
            return lhd;
        }
    }

}
