package dao;
import models.tacGia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
public class tacGiaDAO {
    public void insertTG(tacGia tacGia){
        String query = "INSERT INTO tacgia" + "(MaTG, TenTG, Email, SoDT) VALUES" + "(?,?,?,?);";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ex1", "root", "1721");
             PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            preparedStatement.setString(1, tacGia.getMaTG());
            preparedStatement.setString(2, tacGia.getTenTG());
            preparedStatement.setString(3, tacGia.getEmail());
            preparedStatement.setString(4, tacGia.getSoDT());

            int row = preparedStatement.executeUpdate();
            // rows affected
            System.out.println("Insert thành công "+ row + " tác giả!"); //
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateTG(tacGia tacGia){
        String query =  "UPDATE tacgia SET TenTG=?, Email=?, SoDT=? WHERE MaTG=?";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ex1", "root", "1721");
             PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            preparedStatement.setString(1, tacGia.getTenTG());
            preparedStatement.setString(2, tacGia.getEmail());
            preparedStatement.setString(3, tacGia.getSoDT());
            preparedStatement.setString(4, tacGia.getMaTG());
            int row = preparedStatement.executeUpdate();
            // rows affected
            System.out.println("Update thành công "+ row + " tác giả!"); //
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteTG(tacGia tacGia){
        String query = "DELETE FROM tacgia WHERE MaTG=?";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ex1", "root", "1721");
             PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            preparedStatement.setString(1, tacGia.getMaTG());

            int row = preparedStatement.executeUpdate();
            // rows affected
            System.out.println("Delete thành công "+ row + " tác giả!"); //
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
