//import java.sql.*;
//public class sqlQuery {
//    public static void main(String[] args){
//        try{
//            // load the driver class
//        Class.forName("com.mysql.cj.jdbc.Driver");
//
//
//
//        //create a connection
//        String url = "jdbc:mysql://localhost:3306/Youtube";
//        String username = "root";
//        String password = "yash8252";
//        Connection con = DriverManager.getConnection(url,username,password);
//
//        // create a query
//String q = "create table table1(tId int(20) primary key auto_increment,tName varchar(200) not null,tCity varchar(400))";
//
//
//
//// create a statement
//          Statement stmt  =   con.createStatement();
//          stmt.executeUpdate(q);
//            System.out.println("Table created successfully in the database...");
//
//            con.close();
//    }catch(Exception e){
//        e.printStackTrace();
//    }
//
//}
//}





// Revision og the creating the table in the database

import java.sql.*;
public class sqlQuery{
    public static void main(String[] args){
        try{
            // load the driver and set the details
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/Youtube";
            String username = "root";
            String password = "yash8252";


            // create the conenction
            Connection con = DriverManager.getConnection(url,username,password);

            // create the query
            String q = "create table table3(tid int(20) primary key auto_increment,tName varchar(200) not null,tCity varchar(400))";

            // create the statement
            Statement stmt = con.createStatement();
            stmt.executeUpdate(q);

            System.out.println("Table created successfully in the database......");
            con.close();

        }catch(Exception e){
         e.printStackTrace();
        }
    }
}

