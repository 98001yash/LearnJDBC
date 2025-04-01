package Tutorials_jdbc;

import java.sql.*;
public class Jdbc_01 {
    public static void main(String[] args){
        try {
            //load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");



            //create a connection
            String url = "jdbc:mysql://localhost:3306/Youtube";
            String username = "root";
            String password = "yash8252";
            Connection con = DriverManager.getConnection(url,username,password);

            if(con.isClosed()){
                System.out.println("Connection is closed...");
            }
            else {
                System.out.println("Connection is created...");
            }

        }catch(Exception e){
            e.printStackTrace();
        }

    }
}