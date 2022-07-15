package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static Connection connection = null;

    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "12345");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

}
