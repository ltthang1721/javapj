package dao;
import models.khachHang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
public class khachHangDAO {
    public void insertKH(khachHang khachHang){
        String query = "INSERT INTO khachhang" +  "(MaKH, TenKh, SoDT, Email, DiaChi) VALUES " + " (?, ?, ?, ?, ?);";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ex1", "root", "1721");
             PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            preparedStatement.setString(1, khachHang.getMaKH());
            preparedStatement.setString(2, khachHang.getTenKh());
            preparedStatement.setString(3, khachHang.getSoDT());
            preparedStatement.setString(4, khachHang.getEmail());
            preparedStatement.setString(5, khachHang.getDiaChi());
            int row = preparedStatement.executeUpdate();

            // rows affected
            System.out.println("Insert thành công "+ row + " khách hàng!"); //

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateKH(khachHang khachHang){
        String query = "UPDATE khachhang SET TenKh=?, SoDT=?, Email=?, DiaChi=? WHERE MaKH=?";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ex1", "root", "1721");
             PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            preparedStatement.setString(1, khachHang.getTenKh());
            preparedStatement.setString(2, khachHang.getSoDT());
            preparedStatement.setString(3, khachHang.getEmail());
            preparedStatement.setString(4, khachHang.getDiaChi());
            preparedStatement.setString(5, khachHang.getMaKH());
            int row = preparedStatement.executeUpdate();

            // rows affected
            System.out.println("Update thành công "+ row + " khách hàng!"); //

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void deleteKH(khachHang khachHang){
        String query = "DELETE FROM khachhang WHERE MaKH=?";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ex1", "root", "1721");
             PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            preparedStatement.setString(1, khachHang.getMaKH());

            int row = preparedStatement.executeUpdate();

            // rows affected
            System.out.println("Delete thành công "+ row + " khách hàng!"); //

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
