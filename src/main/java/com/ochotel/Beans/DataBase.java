package com.ochotel.Beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.ochotel.Beans.DataBase;

public class DataBase {
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
    }
}


