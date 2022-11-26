/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.qlshopapp.DAO;

import com.ptithcm.qlshopapp.ConnectDataBase.OpenConnectDataBase;
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
public class Dao_ThongBao {
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
    
    public List<ThongBao> getAllTB() throws Exception {
        List<ThongBao> ltb = new ArrayList<>();
        String sql = "Select * from THONGBAO ORDER BY NGAY DESC";
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
    
    public List<ThongBao> getTop5TB() throws Exception {
        List<ThongBao> ltb = new ArrayList<>();
        String sql = "Select TOP 5 * from THONGBAO ORDER BY NGAY DESC";
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
}
