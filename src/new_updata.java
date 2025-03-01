import java.sql.*;
import java.io.*;
public class new_updata {
    public static void main(String[] args){
        try {
            //load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create the connection
            String url="jdbc:mysql://localhost:3306/Pencil";
            String username="root";
            String password = "yash8252";

            Connection con  = DriverManager.getConnection(url,username,password);

            //select the query

            String q = "update table1 set tName=?,tCity=? where tId=?";
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter new name : ");
            String name = br.readLine();

            System.out.println("Enter new City name: ");
            String city = br.readLine();

            System.out.println("Enter the student ID: ");
            int id = Integer.parseInt(br.readLine());


            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setString(1,name);
            pstmt.setString(2,city);
            pstmt.setInt(3,id);


            pstmt.executeUpdate();
            System.out.println("Query updated.....");
            con.close();


        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
