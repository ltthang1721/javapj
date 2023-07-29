package dao;
import models.theLoai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
public class theLoaiDAO {
    public void insertTL(theLoai theLoai){
        String query = "INSERT INTO theloai" + "(MaTL, TenTL, Mota) VALUES" + "(?,?,?);";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ex1", "root", "1721");
             PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            preparedStatement.setString(1, theLoai.getMaTL());
            preparedStatement.setString(2, theLoai.getTenTL());
            preparedStatement.setString(3, theLoai.getMota());

            int row = preparedStatement.executeUpdate();
            // rows affected
            System.out.println("Insert thành công "+ row + " thể loại!"); //
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateTL(theLoai theLoai){
        String query = "UPDATE theloai SET TenTL=?, Mota=? WHERE MaTL=?";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ex1", "root", "1721");
             PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            preparedStatement.setString(1, theLoai.getTenTL());
            preparedStatement.setString(2, theLoai.getMota());
            preparedStatement.setString(3, theLoai.getMaTL());

            int row = preparedStatement.executeUpdate();
            // rows affected
            System.out.println("Update thành công "+ row + " thể loại!"); //
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteTL(theLoai theLoai){
        String query = "DELETE FROM theloai WHERE MaTL=?";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ex1", "root", "1721");
             PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            preparedStatement.setString(1, theLoai.getMaTL());

            int row = preparedStatement.executeUpdate();
            // rows affected
            System.out.println("Delete thành công "+ row + " thể loại!"); //
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
