import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class new_InsertQuery {
    public static void main(String[] args){
        try {

            //load the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Creat the connection
            String url = "jdbc:mysql://localhost:3306/Pencil";
            String username = "root";
            String password =  "yash8252";
            Connection con = DriverManager.getConnection(url,username,password);




            // create the query
            String q = "insert into table1(tName,tCity) values(?,?)";


            // get the prepared Statement
            PreparedStatement pstmt = con.prepareStatement(q);


            // to take the input
            BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter name : ");
            String name = br.readLine();
            System.out.println("Enter City: ");
            String city = br.readLine();


            // set the values to the Query
            pstmt.setString(1,name);
            pstmt.setString(2,city);
            pstmt.executeUpdate();

            System.out.println("Inserted......");
            con.close();



        }catch(Exception e){
            e.printStackTrace();

        }
    }
}
