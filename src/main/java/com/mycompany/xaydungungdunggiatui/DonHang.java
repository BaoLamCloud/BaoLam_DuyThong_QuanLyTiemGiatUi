/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.xaydungungdunggiatui;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nguye
 */
public class DonHang {

    private static int demMa = 1;       // Biến đếm tự động sinh mã đơn
    private final int maDon;                  // Mã đơn hàng
    private final KhachHang khachHang;        // Thông tin khách hàng
    private final String ngayNhan;            // Ngày nhận đồ
    private final String ngayTra = null;             // Ngày trả đồ
    private final List<MucDonHang> dsMuc;     // Danh sách các mục dịch vụ trong đơn
    private String trangThai;           // Trạng thái đơn hàng

    public DonHang(KhachHang khachHang, DichVu get1, int ngayTra, String ngayNhan) {
        this.maDon = demMa++;
        this.khachHang = khachHang;
        this.ngayNhan = ngayNhan;
        /*this.ngayTra = ngayTra;*/
        this.dsMuc = new ArrayList<>();
        this.trangThai = "Đang giặt";
    }

    public int layMaDon() {
        return maDon;
    }

    public KhachHang layKhachHang() {
        return khachHang;
    }

    public String layTrangThai() {
        return trangThai;
    }

    public void datTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public void themMuc(MucDonHang muc) {
        dsMuc.add(muc);
    }

    public double tinhTongTien() {
        double tong = 0;
        for (MucDonHang muc : dsMuc) {
            tong += muc.tinhTongTien();
        }
        return tong;
    }

    // Hiển thị thông tin đơn hàng
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mã đơn: ").append(maDon).append("\n");
        sb.append("Khách hàng: ").append(khachHang.layTen()).append("\n");
        sb.append("Ngày nhận: ").append(ngayNhan)
                .append(" - Ngày trả: ").append(ngayTra).append("\n");
        sb.append("Trạng thái: ").append(trangThai).append("\n");
        sb.append("Danh sách dịch vụ:\n");
        for (MucDonHang muc : dsMuc) {
            sb.append("  - ").append(muc).append("\n");
        }
        sb.append("Tổng tiền: ").append(tinhTongTien()).append(" VND\n");
        return sb.toString();
    }
}
