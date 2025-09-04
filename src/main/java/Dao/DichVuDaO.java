/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;
import com.mycompany.xaydungungdunggiatui.DichVu;
import java.util.ArrayList;
import java.util.List;

public class DichVuDao {

    private List<DichVu> danhSachDichVu = new ArrayList<>();
    private int nextMaDV = 1;

    public DichVuDao() {
        // Dữ liệu mẫu
        themDichVu(new DichVu(0, "Giặt khô", 20000, "cái"));
        themDichVu(new DichVu(0, "Giặt ướt", 15000, "cái"));
        themDichVu(new DichVu(0, "Ủi đồ", 10000, "cái"));
        themDichVu(new DichVu(0, "Giặt theo kg", 40000, "kg"));
    }

    // Thêm mới dịch vụ
    public void themDichVu(DichVu dv) {
        dv.setMaDV(nextMaDV++);
        danhSachDichVu.add(dv);
    }

    // Lấy danh sách tất cả dịch vụ
    public List<DichVu> layTatCaDichVu() {
        return danhSachDichVu;
    }

    // Sửa dịch vụ
    public void suaDichVu(DichVu dvMoi) {
        for (int i = 0; i < danhSachDichVu.size(); i++) {
            if (danhSachDichVu.get(i).getMaDV() == dvMoi.getMaDV()) {
                danhSachDichVu.set(i, dvMoi);
                return;
            }
        }
    }

    // Xóa dịch vụ
    public void xoaDichVu(int maDV) {
        boolean removeIf = danhSachDichVu.removeIf(dv -> dv.getMaDV() == maDV);
    }

    // Tìm theo mã dịch vụ
    public DichVu timDichVuTheoMa(int maDV) {
        for (DichVu dv : danhSachDichVu) {
            if (dv.getMaDV() != maDV) {
            } else {
                return dv;
            }
        }
        return null;
    }

    // Tìm theo tên dịch vụ
    public List<DichVu> timDichVuTheoTen(String tenDV) {
        List<DichVu> ketQua = new ArrayList<>();
        for (DichVu dv : danhSachDichVu) {
            if (dv.getTenDV().toLowerCase().contains(tenDV.toLowerCase())) {
                ketQua.add(dv);
            }
        }
        return ketQua;
    }

    // Tìm theo khoảng giá
    public List<DichVu> timDichVuTheoGia(double giaMin, double giaMax) {
        List<DichVu> ketQua = new ArrayList<>();
        for (DichVu dv : danhSachDichVu) {
            if (dv.getGiaTien() >= giaMin && dv.getGiaTien() <= giaMax) {
                ketQua.add(dv);
            }
        }
        return ketQua;
    }
}