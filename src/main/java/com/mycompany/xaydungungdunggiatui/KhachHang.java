/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.xaydungungdunggiatui;

/**
 *
 * @author nguye
 */
public class KhachHang {
    private String hoTen;
    private String soDienThoai;
    private String diaChi;

    public KhachHang(String hoTen, String soDienThoai) {
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
    }
    public String layTen() {
        String hoten = null;
        return hoten;
    }

    public String gethoTen() { return hoTen; }
    public String getsoDienThoai() { return soDienThoai; }
    public String getdiaChi() { return diaChi; }

    @Override
    public String toString() {
        return "Họ Tên: " + hoTen + ", SĐT: " + soDienThoai + ", Địa chỉ: " + diaChi;
    }
    
}
    
