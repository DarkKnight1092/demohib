package com.telusuko.demohib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetExmp {

    public static void main(String args[])throws Exception {

        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Apple");
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = stmt.executeQuery("select * from contact");

//getting the record of 3rd row
        rs.next();
        System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
        rs.next();
        System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
        rs.next();
        System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));

        con.close();
    }
}
