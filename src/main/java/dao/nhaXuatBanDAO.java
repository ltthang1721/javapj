package dao;
import models.nhaXuatBan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
public class nhaXuatBanDAO {
    public void insertNXB(nhaXuatBan nhaXuatBan){
        String query = "INSERT INTO nxb " + " (MaNXB, TenNXB, Email) VALUES " + "(?,?,?);";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ex1", "root", "1721");
             PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            preparedStatement.setString(1, nhaXuatBan.getMaNXB());
            preparedStatement.setString(2, nhaXuatBan.getTenNXB());
            preparedStatement.setString(3, nhaXuatBan.getEmail());

            int row = preparedStatement.executeUpdate();
            // rows affected
            System.out.println("Insert thành công "+ row + " NXB!"); //
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateNXB(nhaXuatBan nhaXuatBan){
        String query = "UPDATE nxb SET TenNXB=?, Email=? WHERE MaNXB=?";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ex1", "root", "1721");
             PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            preparedStatement.setString(1, nhaXuatBan.getTenNXB());
            preparedStatement.setString(2, nhaXuatBan.getEmail());
            preparedStatement.setString(3, nhaXuatBan.getMaNXB());
            int row = preparedStatement.executeUpdate();
            // rows affected
            System.out.println("Update thành công "+ row + " NXB!"); //
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteNXB(nhaXuatBan nhaXuatBan){
        String query = "DELETE FROM nxb WHERE MaNXB=?";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ex1", "root", "1721");
             PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            preparedStatement.setString(1, nhaXuatBan.getMaNXB());

            int row = preparedStatement.executeUpdate();
            // rows affected
            System.out.println("Delete thành công "+ row + " NXB!"); //
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
