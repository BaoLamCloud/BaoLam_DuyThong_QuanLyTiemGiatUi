/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.xaydungungdunggiatui;

/**
 *
 * @author nguye
 */
public class MucDonHang {

    private DichVu dichVu;   // Dịch vụ mà khách hàng chọn
    private int soLuong;     // Số lượng dịch vụ (kg, món, bộ...)

    public MucDonHang(DichVu dichVu, int soLuong) {
        this.dichVu = dichVu;
        this.soLuong = soLuong;
    }

    public double tinhTongTien() {
        return dichVu.layGia() * soLuong;
    }

    public DichVu layDichVu() {
        return dichVu;
    }

    @Override
    public String toString() {
        return dichVu.layTen() + " x " + soLuong + " = " + tinhTongTien() + " VND";

    }

}
