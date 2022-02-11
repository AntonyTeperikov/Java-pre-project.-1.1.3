package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();
        userDaoJDBC.createUsersTable();
        userDaoJDBC.saveUser("anton","bob",(byte) 23);
        System.out.println("User с именем anton добавлен в базу данных");
        userDaoJDBC.saveUser("kiril","eqw",(byte) 1);
        System.out.println("User с именем kiril добавлен в базу данных");
        userDaoJDBC.saveUser("stas","cwqw",(byte) 24);
        System.out.println("User с именем stas добавлен в базу данных");
        userDaoJDBC.saveUser("max","lol",(byte) 12);
        System.out.println("User с именем max добавлен в базу данных");
        userDaoJDBC.getAllUsers();
        System.out.println();
        userDaoJDBC.cleanUsersTable();
        userDaoJDBC.dropUsersTable();


    }
}
