/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nguye
 */
public class MucDonHang {
    private int maMDH;
    private int maDH;
    private int maDV;
    private int soLuong;
    private double thanhTien;

    public MucDonHang(int maMDH, int maDH, int maDV, int soLuong, double thanhTien) {
        this.maMDH = maMDH;
        this.maDH = maDH;
        this.maDV = maDV;
        this.soLuong = soLuong;
        this.thanhTien = thanhTien;
    }

    public int getMaMDH() {
        return maMDH;
    }

    public void setMaMDH(int maMDH) {
        this.maMDH = maMDH;
    }

    public int getMaDH() {
        return maDH;
    }

    public void setMaDH(int maDH) {
        this.maDH = maDH;
    }

    public int getMaDV() {
        return maDV;
    }

    public void setMaDV(int maDV) {
        this.maDV = maDV;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }
}
