-- Tạo cơ sở dữ liệu
DROP DATABASE IF EXISTS XayDungUngDungGiatUi;
CREATE DATABASE XayDungUngDungGiatUi;
USE XayDungUngDungGiatUi;

CREATE TABLE KhachHang (
    MaKH INT PRIMARY KEY IDENTITY(1,1),
    HoTen NVARCHAR(100) NOT NULL,
    SoDienThoai NVARCHAR(15),
    DiaChi NVARCHAR(255)
);

CREATE TABLE DichVu (
    MaDV INT PRIMARY KEY IDENTITY(1,1),
    TenDV NVARCHAR(100) NOT NULL,
    DonGia FLOAT NOT NULL,
    DonViTinh NVARCHAR(50)
);
-- BẢNG ĐƠN HÀNG
CREATE TABLE DonHang (
    MaDonHang INT PRIMARY KEY IDENTITY(1,1),
    MaKH INT,
    NgayNhan DATE NOT NULL,
    NgayTra DATE,
    TrangThai NVARCHAR(30) DEFAULT N'Dang giat', 
    GhiChu NVARCHAR(MAX),
    FOREIGN KEY (MaKH) REFERENCES KhachHang(MaKH)
);

-- CHI TIẾT ĐƠN HÀNG
CREATE TABLE ChiTietDonHang (
    MaCT INT PRIMARY KEY IDENTITY(1,1),
    MaDonHang INT,
    MaDV INT,
    SoLuong INT,
    MoTaHangHoa NVARCHAR(MAX),
    FOREIGN KEY (MaDonHang) REFERENCES DonHang(MaDonHang),
    FOREIGN KEY (MaDV) REFERENCES DichVu(MaDV)
);

-- BẢNG HÓA ĐƠN
CREATE TABLE HoaDon (
    MaHoaDon INT PRIMARY KEY IDENTITY(1,1),
    MaDonHang INT,
    NgayThanhToan DATE,
    TongTien DECIMAL(12,2),
    FOREIGN KEY (MaDonHang) REFERENCES DonHang(MaDonHang)
);

-- DỮ LIỆU MẪU
INSERT INTO KhachHang (HoTen, SoDienThoai, DiaChi) VALUES 
(N'Nguyễn Văn A', '0909123456', N'TP.HCM'),
(N'Trần Thị B', '0988123456', N'Hà Nội');

INSERT INTO DichVu (TenDV, DonGia, DonViTinh) VALUES 
(N'Giặt khô', 10000, N'kg'),
(N'Ủi quần áo', 5000, N'cái'),
(N'Giặt ướt', 8000, N'kg');

INSERT INTO DonHang (MaKH, NgayNhan, NgayTra, TrangThai, GhiChu) VALUES 
(1, '2025-09-01', '2025-09-03', N'Da giat', N'Giặt đồ công sở'),
(2, '2025-09-05', NULL, N'Dang giat', N'');

INSERT INTO ChiTietDonHang (MaDonHang, MaDV, SoLuong, MoTaHangHoa) VALUES 
(1, 1, 5, N'5kg quần áo'),
(1, 2, 3, N'3 cái áo sơ mi'),
(2, 3, 4, N'4kg đồ gia đình');

INSERT INTO HoaDon (MaDonHang, NgayThanhToan, TongTien) VALUES 
(1, '2025-09-04', 85000.00);

