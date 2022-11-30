/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.qlshopapp.Model;

/**
 *
 * @author PC
 */
public class CTHoaDon {
    private String mahd;
    private String masp;
    private String tensp;
    private int slban;
    private int tongtiensp;
    private String kichthuoc;

    public String getKichthuoc() {
        return kichthuoc;
    }

    public void setKichthuoc(String kichthuoc) {
        this.kichthuoc = kichthuoc;
    }
    public CTHoaDon() {
    }

    public CTHoaDon(String mahd, String masp, String tensp, int slban, int tongtiensp, String kichthuoc) {
        this.mahd = mahd;
        this.masp = masp;
        this.tensp = tensp;
        this.slban = slban;
        this.tongtiensp = tongtiensp;
        this.kichthuoc = kichthuoc;
    }

    public String getMahd() {
        return mahd;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

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

    public int getSlban() {
        return slban;
    }

    public void setSlban(int slban) {
        this.slban = slban;
    }

    public int getTongtiensp() {
        return tongtiensp;
    }

    public void setTongtiensp(int tongtiensp) {
        this.tongtiensp = tongtiensp;
    }
    
    
}
