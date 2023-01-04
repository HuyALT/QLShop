/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.qlshopapp.Model;

/**
 *
 * @author Admin
 */
public class DoanhThuThang {
    private String thang ;
    private int tongtien;

    public DoanhThuThang() {
    }

    public DoanhThuThang(String thang, int tongtien) {
        this.thang = thang;
        this.tongtien = tongtien;
    }
    
    public String getThang() {
        return thang;
    }

    public void setThang(String thang) {
        this.thang = thang;
    }

    public int getTongtien() {
        return tongtien;
    }

    public void setTongtien(int tongtien) {
        this.tongtien = tongtien;
    }

    
}
