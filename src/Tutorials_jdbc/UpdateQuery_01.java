package Tutorials_jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateQuery_01 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/jdbc_demo";
            String username = "root";
            String password = "yash8252";

            Connection con = DriverManager.getConnection(url, username, password);
            String q = "update table1 set tName=?, tCity=? where tId=?";
            PreparedStatement pstmt = con.prepareStatement(q);


            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


            System.out.println("Enter your name: ");
            String name = br.readLine();
            System.out.println("Enter your city: ");
            String city = br.readLine();


            System.out.println("Enter the Student Id: ");
            int id = Integer.parseInt(br.readLine());

            pstmt.setString(1, name);
            pstmt.setString(2, city);
            pstmt.setInt(3, id);
            pstmt.executeUpdate();

            System.out.println("Query updated successfully.....");
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}