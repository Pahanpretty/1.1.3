package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/biba";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "farcry1996";
    private static Util instance = null;

    public static Connection getConnection() {
        Connection connection = null;
        try {

            connection = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
            System.out.println("Connection done");
        } catch ( SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

}
