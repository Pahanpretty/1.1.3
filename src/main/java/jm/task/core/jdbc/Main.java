package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Alex", "Shults", (byte)25);
        userService.saveUser("Oleg", "Ivanov", (byte)60);
        userService.saveUser("Dmitriy", "Sidorov", (byte)31);
        userService.saveUser("Michael", "Rain", (byte)12);
        userService.getAllUsers();






    }
}