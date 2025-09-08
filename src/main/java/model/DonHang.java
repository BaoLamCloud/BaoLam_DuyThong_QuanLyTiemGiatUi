/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

public class DonHang {
    private int id;
    private KhachHang khachHang;
    private List<DichVu> dsDichVu;
    private String trangThai;

    public DonHang(int id, KhachHang khachHang) {
        this.id = id;
        this.khachHang = khachHang;
        this.dsDichVu = new ArrayList<>();
        this.trangThai = "Đang giặt";
    }

    // Thêm dịch vụ vào đơn
    public void themDichVu(DichVu dv) {
        dsDichVu.add(dv);
    }

    // ✅ Hàm tính tổng tiền (cần cho ThongKeDao)
    public double tinhTongTien() {
        double tong = 0;
        for (DichVu dv : dsDichVu) {
            tong += dv.getDonGia();
        }
        return tong;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "DonHang{" +
                "id=" + id +
                ", khachHang=" + khachHang.gethoTen() +
                ", tongTien=" + tinhTongTien() +
                ", trangThai='" + trangThai + '\'' +
                '}';
    }
}


