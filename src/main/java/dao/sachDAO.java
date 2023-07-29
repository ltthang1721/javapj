package dao;
import models.sach;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
public class sachDAO {
    public void insertSach(sach sach){
        String query = "INSERT INTO sach" + "(MaSach, TenSach, MaTL, MaNXB, MaTG, SL, GiaTien, Hinh, UuTien, MaDM) VALUES" + "(?,?,?,?,?,?,?,?,?,?);";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ex1", "root", "1721");
             PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            preparedStatement.setString(1, sach.getMaSach());
            preparedStatement.setString(2, sach.getTenSach());
            preparedStatement.setString(3, sach.getMaTL());
            preparedStatement.setString(4, sach.getMaNXB());
            preparedStatement.setString(5, sach.getMaTG());
            preparedStatement.setString(6, sach.getSL());
            preparedStatement.setString(7, sach.getGiaTien());
            preparedStatement.setString(8, sach.getHinh());
            preparedStatement.setString(9, sach.getUuTien());
            preparedStatement.setString(10, sach.getMaDM());

            int row = preparedStatement.executeUpdate();
            // rows affected
            System.out.println("Insert thành công "+ row + " sách!"); //
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateSach(sach sach){
        String query = "UPDATE sach SET TenSach=?, MaTL=?, MaNXB=?, MaTG=?, SL=?, GiaTien=?, Hinh=?, UuTien=?, MaDM=? WHERE MaSach=?";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ex1", "root", "1721");
             PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            preparedStatement.setString(1, sach.getTenSach());
            preparedStatement.setString(2, sach.getMaTL());
            preparedStatement.setString(3, sach.getMaNXB());
            preparedStatement.setString(4, sach.getMaTG());
            preparedStatement.setString(5, sach.getSL());
            preparedStatement.setString(6, sach.getGiaTien());
            preparedStatement.setString(7, sach.getHinh());
            preparedStatement.setString(8, sach.getUuTien());
            preparedStatement.setString(9, sach.getMaDM());
            preparedStatement.setString(10, sach.getMaSach());

            int row = preparedStatement.executeUpdate();
            // rows affected
            System.out.println("Update thành công "+ row + " sách!"); //
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteSach(sach sach){
        String query = "DELETE FROM sach WHERE MaSach=?";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ex1", "root", "1721");
             PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            preparedStatement.setString(1, sach.getMaSach());

            int row = preparedStatement.executeUpdate();
            // rows affected
            System.out.println("Delete thành công "+ row + " sách!"); //
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
