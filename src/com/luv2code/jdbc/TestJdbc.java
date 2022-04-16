package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

    public static void main(String[] args) {

	String jdbcUrl = "jdbc:postgresql://localhost:5432/hb_student_tracker";
	String user = "hbstudent";
	String pass = "hbstudent";

	try {
	    System.out.println("Connecting to database: " + jdbcUrl);
	    Connection myconn = DriverManager.getConnection(jdbcUrl, user, pass);
	    System.out.println("Connection successful");
	    myconn.close();

	} catch (Exception e) {
	    e.printStackTrace();
	}

    }

}




