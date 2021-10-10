package frontend;

import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;




public class ex1{
    public static void main(String[] args) throws SQLException{
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/testing_system";
        String username = "root";
        String password = "root";


        //question1
        Connection conn = DriverManager.getConnection(url,username,password);
         if(conn != null){
            System.out.println("Connect success");
        }

        //question 2
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery("select * from `position`");
        while(rs.next()){
            System.out.println("ID: " + rs.getInt("positionID")+ "Name: " + rs.getString("positionName"));
            
        }
            //question 3
        System.out.println("nhap vao ten chuc vu muon them vao database");
        String name = sc.nextLine();
        String sql = "insert into `position`(positionName) values ('" + name + "')";
        statement.executeUpdate(sql);

        //question 4
        statement.executeUpdate("update `position` set positionName = 'Dev' where positionID = 5");

        //question 5
        System.out.println("nhap vao id chuc vu muon xoa: ");
        String id = sc.nextLine();
        sql = "delete from `position` where positionID = '"+ id + "'";
        statement.executeUpdate(sql);
        
    }
}
