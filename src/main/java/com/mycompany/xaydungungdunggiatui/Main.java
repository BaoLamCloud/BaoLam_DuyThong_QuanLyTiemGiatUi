/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.xaydungungdunggiatui;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class Main {
    static ArrayList<KhachHang> dsKhachHang = new ArrayList<>();
    static ArrayList<DichVu> dsDichVu = new ArrayList<>();
    static ArrayList<DonHang> dsDonHang = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        // Thêm sẵn một vài dịch vụ mẫu
        dsDichVu.add(new DichVu(50000, "Giặt khô", 20000, "c\u00e1i"));
        dsDichVu.add(new DichVu(30000, "Giặt ướt", 20000, "c\u00e1i"));

        do {
            System.out.println("=== QUẢN LÝ TIỆM GIẶT ỦI ===");
            System.out.println("1. Thêm khách hàng");
            System.out.println("2. Thêm đơn hàng");
            System.out.println("3. Hiển thị đơn hàng");
            System.out.println("4. Thoát");
            System.out.print("Chọn: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1:
                    themKhachHang(sc);
                    break;
                case 2:
                    themDonHang(sc);
                    break;
                case 3:
                    hienThiDonHang();
                    break;
                case 4:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Chọn sai, nhập lại!");
            }
        } while(choice != 4);

        sc.close();
    }

    static void themKhachHang(Scanner sc) {
        System.out.print("Nhập họ tên khách hàng: ");
        String ten = sc.nextLine();
        System.out.print("Nhập số điện thoại: ");
        String sdt = sc.nextLine();

        dsKhachHang.add(new KhachHang(ten, sdt));
        System.out.println("Thêm khách hàng thành công!");
    }

    static void themDonHang(Scanner sc) {
        if (dsKhachHang.isEmpty()) {
            System.out.println("Chưa có khách hàng nào, vui lòng thêm khách hàng trước.");
            return;
        }

        System.out.println("Chọn khách hàng:");
        for (int i = 0; i < dsKhachHang.size(); i++) {
            System.out.println((i+1) + ". " + dsKhachHang.get(i));
        }
        int chonKh = sc.nextInt(); sc.nextLine();

        System.out.println("Chọn dịch vụ:");
        for (int i = 0; i < dsDichVu.size(); i++) {
            System.out.println((i+1) + ". " + dsDichVu.get(i));
        }
        int chonDv = sc.nextInt(); sc.nextLine();

        System.out.print("Nhập số lượng: ");
        int soLuong = sc.nextInt(); sc.nextLine();

        System.out.print("Nhập trạng thái đơn hàng: ");
        String trangThai = sc.nextLine();

        DonHang dh = new DonHang(dsKhachHang.get(chonKh-1), dsDichVu.get(chonDv-1), soLuong, trangThai);
        dsDonHang.add(dh);

        System.out.println("Thêm đơn hàng thành công!");
    }

    static void hienThiDonHang() {
        if (dsDonHang.isEmpty()) {
            System.out.println("Chưa có đơn hàng nào.");
        } else {
            for (DonHang dh : dsDonHang) {
                System.out.println(dh);
            }
        }
    }
    
}
