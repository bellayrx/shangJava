package org.study;


import java.sql.*;

/**
 * ClassName: test
 * Package: org.study
 * Description:
 *
 * @Author watermelon
 * @Create 2023/6/2 10:45
 * @Version 1.0
 */


public class KafkaDataProcessor {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/mydatabase";
    private static final String DB_USER = "username";
    private static final String DB_PASSWORD = "password";

    public void processKafkaData(String message) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD)) {
            connection.setAutoCommit(false);

            // 检查数据是否已存在
            if (!isDataExists(connection, message)) {
                // 执行插入操作
                insertData(connection, message);
                connection.commit();
            } else {
                // 数据已存在，忽略
                System.out.println("Data already exists, ignoring: " + message);
            }
        } catch (SQLException e) {
            // 处理异常
            e.printStackTrace();
        }
    }

    private boolean isDataExists(Connection connection, String data) throws SQLException {
        String query = "SELECT COUNT(*) FROM mytable WHERE data = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, data);
            try (ResultSet resultSet = statement.executeQuery()) {
                resultSet.next();
                int count = resultSet.getInt(1);
                return count > 0;
            }
        }
    }

    private void insertData(Connection connection, String data) throws SQLException {
        String query = "INSERT INTO mytable (data) VALUES (?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, data);
            statement.executeUpdate();
        }
    }
}
