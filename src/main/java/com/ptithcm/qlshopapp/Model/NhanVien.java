/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.qlshopapp.Model;

/**
 *
 * @author PC
 */
public class NhanVien {
    private String maNV;
    private String tenNV;
    private String gioiTinh;
    private String cmnd;
    private String ngaySinh;
    private String chucVu;
    private String tenTK;
    private String mkhau;
    private boolean daNghi;

    public NhanVien() {
    }

    public NhanVien(String maNV, String tenNV, String gioiTinh, String cmnd, String ngaySinh, String chucVu, String tenTK, String mkhau, boolean daNghi) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.gioiTinh = gioiTinh;
        this.cmnd = cmnd;
        this.ngaySinh = ngaySinh;
        this.chucVu = chucVu;
        this.tenTK = tenTK;
        this.mkhau = mkhau;
        this.daNghi = daNghi;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public String getMkhau() {
        return mkhau;
    }

    public void setMkhau(String mkhau) {
        this.mkhau = mkhau;
    }

    public boolean isDaNghi() {
        return daNghi;
    }

    public void setDaNghi(boolean daNghi) {
        this.daNghi = daNghi;
    }
}
