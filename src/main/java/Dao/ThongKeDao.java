/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;
import java.util.List;
import model.DonHang;
/**
 *
 * @author ADMIN
 */
public class ThongKeDao {
    // Tính tổng doanh thu từ danh sách đơn hàng
    public double tinhDoanhThu(List<DonHang> dsDon) {
        double tong = 0;
        for (DonHang dh : dsDon) {
            tong += dh.tinhTongTien();
        }
        return tong;
    }

    // Đếm số lượng đơn theo trạng thái
    public int demDonTheoTrangThai(List<DonHang> dsDon, String trangThai) {
        int count = 0;
        for (DonHang dh : dsDon) {
            if (dh.getTrangThai().equalsIgnoreCase(trangThai)) {
                count++;
            }
        }
        return count;
    }
}
