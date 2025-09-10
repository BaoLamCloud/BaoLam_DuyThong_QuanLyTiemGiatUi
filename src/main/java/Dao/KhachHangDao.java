/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.KhachHang;
import java.sql.ResultSet;
/**
 *
 * @author ADMIN
 */
public class KhachHangDao {
    private Connection conn;
    
    public KhachHangDao(Connection conn){
        this.conn = conn;
    }
    
    public List<KhachHang> getAll() {
        List<KhachHang> list = new ArrayList<>();
        String sql = "SELECT * FROM KhachHang";
        try (Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()){
                    list.add(new KhachHang(
                            rs.getInt("MaKH"),
                            rs.getString("HoTen"),
                            rs.getString("SoDienThoai"),
                            rs.getString("DiaChi")
                    ));
                }
        } catch (SQLException e) {
            e.printStackTrace();
        }
       return list;
    }
}
