package Tutorials_jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertQuery_01 {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/jdbc_demo";
            String username = "root";
            String password = "yash8252";

            // creating the connection
            Connection con = DriverManager.getConnection(url,username,password);


            // creating the query
            String q = "insert into table1(tName,tCity) values(?,?)";

            // creating the preparedStatement object
            PreparedStatement pstmt = con.prepareStatement(q);

            // now taking input from the user
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter your name: ");
            String name = br.readLine();
            System.out.println("Enter your city: ");
            String city = br.readLine();

            // set the value to the query
            pstmt.setString(1,name);
            pstmt.setString(2,city);
            pstmt.executeUpdate();

            System.out.println("Your data is successfully inserted in the database......");
            con.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

