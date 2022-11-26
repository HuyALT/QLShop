/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.qlshopapp.DAO;

import com.ptithcm.qlshopapp.ConnectDataBase.OpenConnectDataBase;
import com.ptithcm.qlshopapp.Model.SanPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
}
