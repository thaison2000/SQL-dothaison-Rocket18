package backend;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import entity.Department;

public class DepartmentDao  {

    List<Department> department = new ArrayList<>();
   

    public List<Department> getDepartments() throws SQLException,NullPointerException{
        List<Department> department = new ArrayList<>();

        String url = "jdbc:mysql://localhost:3306/testing_system";
        String username = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(url,username,password);

        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery("select * from `department`");
        
        while(rs.next()){
            int id = rs.getInt("departmentID");
            String name = rs.getString("departmentName");
            Department d = new Department(id,name);
            department.add(d);
        }

        return department;
    }

    public List<Department> getDepartmentByID5() throws SQLException,NullPointerException{
        List<Department> department = new ArrayList<>();

        String url = "jdbc:mysql://localhost:3306/testing_system";
        String username = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(url,username,password);

        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery("select * from `department` where departmentID = 5");
        
        while(rs.next()){
            int id = rs.getInt("departmentID");
            String name = rs.getString("departmentName");
            Department d = new Department(id,name);
            department.add(d);
        }

        return department;
    }

    public List<Department> getDepartmentByID(int departmentID) throws SQLException,NullPointerException{
        List<Department> department = new ArrayList<>();

        String url = "jdbc:mysql://localhost:3306/testing_system";
        String username = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(url,username,password);

        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery("select * from `department` where departmentID = "+ departmentID);
        
        while(rs.next()){
            int id = rs.getInt("departmentID");
            String name = rs.getString("departmentName");
            Department d = new Department(id,name);
            department.add(d);
        }

        return department;
    }

    public boolean isDepartmentNameExists(String departmentName) throws SQLException,NullPointerException{
        List<Department> department = new ArrayList<>();
        String url = "jdbc:mysql://localhost:3306/testing_system";
        String username = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(url,username,password);

        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery("select * from `department` where departmentName = '"+ departmentName + "'");
        
        while(rs.next()){
            int id = rs.getInt("departmentID");
            String name = rs.getString("departmentName");
            Department d = new Department(id,name);
            department.add(d);
        }

        if(department.size() == 0){
            return false;
        }
        else
            return true;
    }

    public boolean isDepartmentNameExists(int departmentID) throws SQLException,NullPointerException{
        List<Department> department = new ArrayList<>();
        String url = "jdbc:mysql://localhost:3306/testing_system";
        String username = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(url,username,password);

        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery("select * from `department` where departmentID = "+ departmentID);
        
        while(rs.next()){
            int id = rs.getInt("departmentID");
            String name = rs.getString("departmentName");
            Department d = new Department(id,name);
            department.add(d);
        }

        if(department.size() == 0){
            return false;
        }
        else
            return true;
    }

    public void createDepartment(String departmentName) throws SQLException,NullPointerException{
        if(isDepartmentNameExists(departmentName) == true){
            throw new SQLException("Department name is exists");
        }
        else{
            String url = "jdbc:mysql://localhost:3306/testing_system";
            String username = "root";
            String password = "root";
            Connection conn = DriverManager.getConnection(url,username,password);
            Statement statement = conn.createStatement();
            statement = conn.createStatement();
            statement.executeUpdate("insert into department(departmentName) values ('" + departmentName + "')" );
        }
    }
        

    public void updateDepartmentName(int departmentID, String departmentName) throws SQLException,NullPointerException{
        if(isDepartmentNameExists(departmentID)== true){
            if(isDepartmentNameExists(departmentName)==true){
                throw new SQLException("Department is exists");
            }
            else{
                String url = "jdbc:mysql://localhost:3306/testing_system";
            String username = "root";
            String password = "root";
            Connection conn = DriverManager.getConnection(url,username,password);
            Statement statement = conn.createStatement();
            statement = conn.createStatement();
            statement.executeUpdate("update department set departmentName = '" + departmentName +"' where departmentID = 5");
            }
        }
        else{
            String url = "jdbc:mysql://localhost:3306/testing_system";
            String username = "root";
            String password = "root";
            Connection conn = DriverManager.getConnection(url,username,password);
            Statement statement = conn.createStatement();
            statement = conn.createStatement();
            statement.executeUpdate("insert into department values (" + departmentID +",'" + departmentName + "')" );
        }
    }
        

    public void deleteDepartmentUsingProcedure(int departmentID) throws SQLException,NullPointerException{
        if(isDepartmentNameExists(departmentID)== true){
            String url = "jdbc:mysql://localhost:3306/testing_system";
            String username = "root";
            String password = "root";
            Connection conn = DriverManager.getConnection(url,username,password);
            CallableStatement statement = conn.prepareCall("{call ex3(?)}");
            statement.setInt(1,departmentID);
            statement.execute();
        }    
        else{
            throw new SQLException("Can not find Department which has ID = " + departmentID);
        }
        
    }
    
    public void deleteDepartmentByID(int departmentID) throws SQLException,NullPointerException{

        if(isDepartmentNameExists(departmentID)== true){
            String url = "jdbc:mysql://localhost:3306/testing_system";
            String username = "root";
            String password = "root";
            Connection conn = DriverManager.getConnection(url,username,password);
            Statement statement = conn.createStatement();

            statement.executeQuery("delete from department where departmentID = '"+ departmentID + "'");
        }    
        else{
            throw new SQLException("Can not find Department which has ID = " + departmentID);
        }
        
    }
}


