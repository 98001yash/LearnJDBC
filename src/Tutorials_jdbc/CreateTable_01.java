package Tutorials_jdbc;

import java.sql.*;


public class CreateTable_01 {
    public static void main(String[] args){
        try{
            // load the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/jdbc_demo";
            String username = "root";
            String password = "yash8252";

            // crate the connection
            Connection con = DriverManager.getConnection(url,username,password);

            String q = "create table table1(tid int(20) primary key auto_increment,tName varchar(200) not null,tCity varchar(400))";

            // create the statement
            Statement st = con.createStatement();
            st.executeUpdate(q);

            System.out.println("Table created successfully in the database......");
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
