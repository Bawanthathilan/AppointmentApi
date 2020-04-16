package com.appApi.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
	Connection con = null;

    public DBconnection() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/healthcare", "root", "bawwa");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Connection getConnection() {
        return con;
    }
	
	
}



