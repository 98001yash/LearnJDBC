
import java.sql.*;
import java.io.*;
// these are the steps to insert the image in the database
public class insertImage {
    public static void main(String[] args){

        try{
            // load the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");


            //create the connection
            String url = "jdbc:mysql://localhost:3306/Youtube";
            String username  = "root";
            String password = "yash8252";
            Connection con = DriverManager.getConnection(url,username,password);

            //create the query
            String q = "insert into images(pic) values(?)";

            // get the preparedStatement
            PreparedStatement pstmt = con.prepareStatement(q);



              FileInputStream fis = new FileInputStream("c:Users\\YASH CHAUHAN\\OneDrive\\Attachments\\Desktop\\mypic.jpg");
            pstmt.setBinaryStream(1,fis,fis.available());
            pstmt.executeUpdate();



            System.out.println("done....");

            con.close();


        }catch(Exception e){
            System.out.println("Error....");
        }
    }
}
