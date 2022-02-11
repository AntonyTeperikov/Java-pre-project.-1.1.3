package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Util {
    private final String url = "jdbc:mysql://localhost:3306/newtest";
    private final String username = "root";
    private String password = "root";
    private Connection connection;

    public Connection getConnection() {
        try {
            connection = DriverManager.getConnection(url, username, password);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
}

