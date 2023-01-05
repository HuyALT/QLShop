/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.qlshopapp.Model;

import java.util.List;

/**
 *
 * @author PC
 */
public class PhieuNhap {
    private String mapn;
    private String ngay;
    private int tongtien;
    private String manv;
    private List<CTPhieuNhap> lctpn;

    public PhieuNhap(String mapn, String ngay, int tongtien, String manv, List<CTPhieuNhap> lctpn) {
        this.mapn = mapn;
        this.ngay = ngay;
        this.tongtien = tongtien;
        this.manv = manv;
        this.lctpn = lctpn;
    }

    public List<CTPhieuNhap> getLctpn() {
        return lctpn;
    }

    public void setLctpn(List<CTPhieuNhap> lctpn) {
        this.lctpn = lctpn;
    }

    public PhieuNhap() {
    }

    public int getTongtien() {
        return tongtien;
    }

    public void setTongtien(int tongtien) {
        this.tongtien = tongtien;
    }

    public String getMapn() {
        return mapn;
    }

    public void setMapn(String mapn) {
        this.mapn = mapn;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }
    
}
