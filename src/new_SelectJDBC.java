import java.sql.*;
import java.io.*;

public class new_SelectJDBC {
    public static void  main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/Pencil";
            String username = "root";
            String password = "yash8252";
            Connection con = DriverManager.getConnection(url,username,password);

            String q = "select * from table1";
            Statement stmt = con.createStatement();
            ResultSet set = stmt.executeQuery(q);

            while(set.next()) {
                int id = set.getInt(1);
                String name = set.getString(2);
                String city = set.getString(3);


                System.out.println(name);
                System.out.println(id);
                System.out.println(city);
            }
            System.out.println("Data selected successfully...");

            //con.close();



        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
