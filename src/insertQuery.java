//import java.sql.*;
//// code to insert the elements normally as well as by taking input from the users
//import java.io.*;
//public class insertQuery {
//    public static void main(String[] args){
//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            //creating the connection
//            String url = "jdbc:mysql://localhost:3306/Youtube";
//            String username = "root";
//            String password = "yash8252";
//            Connection con = DriverManager.getConnection(url,username,password);
//
//
//            // create a query
//            String q = "insert into table1(tName,tCity) values(?,?)";
//
//            // get the preparedStatement object
//            PreparedStatement pstmt  = con.prepareStatement(q);
//
//
//
//BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
//            System.out.println("Enter name :");
//            String name  = br.readLine();
//            System.out.println("Enter city: ");
//            String city = br.readLine();
//
//            // set the values to the query
//            pstmt.setString(1,name);
//            pstmt.setString(2,city);
//            pstmt.executeUpdate();
//
//            System.out.println("Inserted..");
//            con.close();
//
//
//
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//    }
//}



// inserting the element in the databases
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.*;
public class insertQuery {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/Youtube";
            String username = "root";
            String password = "yash8252";

            // creating the connection
            Connection con = DriverManager.getConnection(url,username,password);


            // creating the query
            String q = "insert into table2(tName,tCity) values(?,?)";

            // creating the preparedStatement object
            PreparedStatement pstmt = con.prepareStatement(q);

            // now doing the work of the input
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
