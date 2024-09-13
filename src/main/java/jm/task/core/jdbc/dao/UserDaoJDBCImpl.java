//package jm.task.core.jdbc.dao;
//
//import jm.task.core.jdbc.model.User;
//import jm.task.core.jdbc.util.Util;
//import org.hibernate.SessionFactory;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class UserDaoJDBCImpl implements UserDao {
//
//    private final SessionFactory connection = Util.getConnection();
//
//    public UserDaoJDBCImpl() {
//
//    }
//
//    public void createUsersTable() {
//        try (Statement statement = connection.createStatement()) {
//            statement.executeUpdate("CREATE TABLE IF NOT EXISTS userstable " +
//                    "(id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(45), lastName VARCHAR(45), age INT)");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    public void dropUsersTable() {
//        String sql = "DROP TABLE IF EXISTS userstable";
//        try (Statement statement = connection.createStatement()) {
//            statement.executeUpdate(sql);
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//
//        }
//
//
//    }
//
//    public void saveUser(String name, String lastName, byte age) {
//        String sql = "INSERT INTO userstable (name, lastName, age) VALUES (?, ?, ?)";
//        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
//            preparedStatement.setString(1, name);
//            preparedStatement.setString(2, lastName);
//            preparedStatement.setByte(3, age);
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//
//
//
//
//    public void removeUserById(long id) {
//        try (PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM userstable WHERE id = ?")) {
//            preparedStatement.setLong(1, id);
//            preparedStatement.executeUpdate();
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//            }
//        }
//
//    public List<User> getAllUsers() {
//        List<User> UserList = new ArrayList<>();
//        String sql = "SELECT * FROM userstable";
//        try (Statement statement = connection.createStatement()) {
//            ResultSet resultSet = statement.executeQuery(sql);
//            while (resultSet.next()) {
//                User user = new User();
//                user.setId(resultSet.getLong("ID"));
//                user.setName(resultSet.getString("NAME"));
//                user.setLastName(resultSet.getString("LASTNAME"));
//                user.setAge(resultSet.getByte("AGE"));
//                UserList.add(user);
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        return UserList;
//    }
//
//    public void cleanUsersTable() {
//        String sql = "TRUNCATE TABLE userstable";
//        try (Statement statement = connection.createStatement()) {
//            statement.executeUpdate(sql);
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
//}
