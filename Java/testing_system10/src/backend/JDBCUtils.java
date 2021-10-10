package backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtils {
    
    public void isConnectedForTesting() throws SQLException{
        String url = "jdbc:mysql://localhost:3306/testing_system";
        String username = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(url,username,password);
        if(conn != null){
            System.out.println("ket noi thanh cong");
        }
    }
    

}
