package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class GenericDAO {
    public Connection getConnection(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ex1", "root", "1721");
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        }
        return conn;
    }

    public void insertModel(String query, Object... objects){
        try {
            Connection conn = getConnection();
            conn.prepareStatement(query);
        }
        catch (SQLException e){

        }
    }

    public void updateModel(String query, Object... objects) {
        try {
            Connection conn = getConnection();
            conn.prepareStatement(query);
        } catch (SQLException e) {

        }
    }

    public void deleteModel(String query, Object... objects) {
        try {
            Connection conn = getConnection();
            conn.prepareStatement(query);
        } catch (SQLException e) {

        }
    }
}
