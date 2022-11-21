/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.qlshopapp.Model;

/**
 *
 * @author PC
 */
public class ThongBao {
    private String matb;
    private String noidung;
    private String ngay;

    public ThongBao() {
    }

    public ThongBao(String matb, String noidung, String ngay) {
        this.matb = matb;
        this.noidung = noidung;
        this.ngay = ngay;
    }

    public String getMatb() {
        return matb;
    }

    public void setMatb(String matb) {
        this.matb = matb;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }
    
}
