/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.qlshopapp.Model;

/**
 *
 * @author PC
 */
public class CTPhieuNhap {
    private String mapn;
    private String masp;
    private String tensp;
    private int sl;
    private int gia;

    public CTPhieuNhap() {
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }


    public CTPhieuNhap(String mapn, String masp, String tensp, int sl, int gia) {
        this.mapn = mapn;
        this.masp = masp;
        this.tensp = tensp;
        this.sl = sl;
        this.gia = gia;
    }

    public String getMapn() {
        return mapn;
    }

    public void setMapn(String mapn) {
        this.mapn = mapn;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
    
    
}
