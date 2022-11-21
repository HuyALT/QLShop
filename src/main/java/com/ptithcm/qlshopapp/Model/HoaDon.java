/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.qlshopapp.Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class HoaDon {
    private String mahd;
    private String ngay;
    private int tongtien;
    private String tenkhachhang;
    private String sdtkh;
    private String manv;
    private List<CTHoaDon> cthd;

    public HoaDon() {
        cthd = new ArrayList<>();
    }

    public HoaDon(String mahd, String ngay, int tongtien, String tenkhachhang, String sdtkh, String manv, List<CTHoaDon> cthd) {
        this.mahd = mahd;
        this.ngay = ngay;
        this.tongtien = tongtien;
        this.tenkhachhang = tenkhachhang;
        this.sdtkh = sdtkh;
        this.manv = manv;
        this.cthd = cthd;
    }

    public String getMahd() {
        return mahd;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public int getTongtien() {
        return tongtien;
    }

    public void setTongtien(int tongtien) {
        this.tongtien = tongtien;
    }

    public String getTenkhachhang() {
        return tenkhachhang;
    }

    public void setTenkhachhang(String tenkhachhang) {
        this.tenkhachhang = tenkhachhang;
    }

    public String getSdtkh() {
        return sdtkh;
    }

    public void setSdtkh(String sdtkh) {
        this.sdtkh = sdtkh;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public List<CTHoaDon> getCthd() {
        return cthd;
    }

    public void setCthd(List<CTHoaDon> cthd) {
        this.cthd = cthd;
    }

  
    
}
