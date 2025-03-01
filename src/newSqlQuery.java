import java.sql.*;

public class newSqlQuery {
    public static void main(String[] args) {

        try {
            //load the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");


            // create the connection
            String url = "jdbc:mysql://localhost:3306/Pencil";
            String username = "root";
            String password = "yash8252";
            Connection con = DriverManager.getConnection(url, username, password);


            // create the query
            String q = "create table table1(tId int(20) primary key auto_increment,tName varchar(200) not null,tCity varchar(200))";


            // create the statement
            Statement stmt = con.createStatement();
            stmt.executeUpdate(q);
            System.out.println("Table created successfully in the databases.....");
            con.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}





//    package chauhan;
//    imprt ja.util.Scanner;
//    public class {
//        pu[
//                blic statkic void main9Aring[]
//    } args
//}




// this is the tECHBLOG

