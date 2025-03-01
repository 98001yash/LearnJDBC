
import java.sql.*;
public class new_Main {
    public static void main(String[] args){
        try {
            //load the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            // create the connection
            String url="jdbc:mysql://localhost:3306/Pencil";
            String username="root";
            String password="yash8252";

            Connection con = DriverManager.getConnection(url,username,password);

            if(con.isClosed()){
                System.out.println("Conection is closed.....");
            }
            else {
                System.out.println("connection is created.....");
            }



        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
