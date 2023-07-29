package dao;
import models.nhanVien;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class nhanVienDAO {

    public void insertNV(nhanVien nhanvien){
        String QUERY = "INSERT INTO nhanvien" + "  (MaNV, TenNV, SoDT, Email, ChucVu) VALUES " + " (?, ?, ?, ?, ?);";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ex1", "root", "1721");
             PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setString(1, nhanvien.getManv());
            preparedStatement.setString(2, nhanvien.getTenNV());
            preparedStatement.setString(3, nhanvien.getSoDT());
            preparedStatement.setString(4, nhanvien.getEmail());
            preparedStatement.setString(5, nhanvien.getChucVu());
            int row = preparedStatement.executeUpdate();

            // rows affected
            System.out.println("Thêm thành công "+ row + " nhân viên!"); //

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateNV(nhanVien nhanVien){
        String query = "UPDATE nhanvien SET TenNV=?, SoDT=?, Email=?, ChucVu=? WHERE MaNV=?";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ex1", "root", "1721");
             PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            preparedStatement.setString(1, nhanVien.getTenNV());
            preparedStatement.setString(2, nhanVien.getSoDT());
            preparedStatement.setString(3, nhanVien.getEmail());
            preparedStatement.setString(4, nhanVien.getChucVu());
            preparedStatement.setString(5, nhanVien.getManv());
            int row = preparedStatement.executeUpdate();

            // rows affected
            System.out.println("Sửa thành công "+ row + " nhân viên!"); //

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void deleteNV(nhanVien nhanVien){
        String query = "DELETE FROM nhanvien WHERE MaNV=?";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ex1", "root", "1721");
             PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            preparedStatement.setString(1, nhanVien.getManv());
            int row = preparedStatement.executeUpdate();

            // rows affected
            System.out.println("Xóa thành công "+ row + " nhân viên!"); //

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
