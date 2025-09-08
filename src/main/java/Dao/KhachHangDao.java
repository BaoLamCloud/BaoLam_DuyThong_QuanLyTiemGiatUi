/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;
import java.util.ArrayList;
import java.util.List;
import model.KhachHang;
/**
 *
 * @author ADMIN
 */
public class KhachHangDao {
    private List<KhachHang> dsKhachHang = new ArrayList<>();

    // Thêm khách hàng
    public void them(KhachHang kh) {
        dsKhachHang.add(kh);
    }

    // Xóa khách hàng theo id
    public void xoa(int id) {
        dsKhachHang.removeIf(kh -> kh.getId() == id);
    }

    // Tìm khách hàng theo id
    public KhachHang timTheoId(int id) {
        for (KhachHang kh : dsKhachHang) {
            if (kh.getId() == id) return kh;
        }
        return null;
    }

    // Tìm khách hàng theo số điện thoại
    public KhachHang timTheoSDT(String sdt) {
        for (KhachHang kh : dsKhachHang) {
            if (kh.getsoDienThoai().equals(sdt)) return kh;
        }
        return null;
    }

    // Lấy toàn bộ danh sách khách hàng
    public List<KhachHang> getAll() {
        return dsKhachHang;
    }

    public List<KhachHang> getAllKhachHang() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void addKhachHang(KhachHang khachHang) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void updateKhachHang(KhachHang khachHang) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void deleteKhachHang(int maKH) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
