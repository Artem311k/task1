package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Util {
    // реализуйте настройку соеденения с БД

    private static String url = "jdbc:mysql://localhost:3307/test_db";
    private static String driverName = "com.mysql.cj.jdbc.Driver";
    private static String userName = "root";
    private static String password = "mysql";
    private static Connection connection;


    public static Connection getConnection() {
        try{
            Class.forName(driverName);
            try {
                connection = DriverManager.getConnection(url, userName, password);
            } catch (SQLException ex) {
                System.err.println("failed connection");
            }
        } catch (ClassNotFoundException ex) {
            System.err.println("driver not found");
        }
        return connection;
    }


}
