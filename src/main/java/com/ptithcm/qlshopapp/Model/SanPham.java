/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.qlshopapp.Model;

import java.math.BigDecimal;


/**
 *
 * @author PC
 */
public class SanPham {
    private String masp;
    private String tensp;
    private int slTon;
    private int gia;
    private String kichThuoc;

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public int getSlTon() {
        return slTon;
    }

    public void setSlTon(int slTon) {
        this.slTon = slTon;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(String kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public SanPham(String masp, String tensp, int slTon, int gia, String kichThuoc) {
        this.masp = masp;
        this.tensp = tensp;
        this.slTon = slTon;
        this.gia = gia;
        this.kichThuoc = kichThuoc;
    }

    public SanPham() {
    }
}
