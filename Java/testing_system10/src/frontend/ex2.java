package frontend;

import java.sql.SQLException;
import java.util.Scanner;

import backend.DepartmentDao;

public class ex2 {    
    public static void main(String[] args) throws SQLException,NullPointerException{
        Scanner sc = new Scanner(System.in);
        DepartmentDao d1 = new DepartmentDao();
        
        //ex2 question 1
        System.out.println("\n\nquestion1");
        System.out.println("List Department: ");
        int size1 = d1.getDepartments().size();
        for (int i = 0; i < size1; i++) {
            System.out.println(d1.getDepartments().get(i).getDepartmentID() + ", " + d1.getDepartments().get(i).getDepartmentName());
        }
        


        //ex2 question2
        System.out.println("\n\nquestion2");
        System.out.println("List Department which has id = 5: ");
        int size2 = d1.getDepartmentByID5().size();
        for (int i = 0; i < size2; i++) {
            System.out.println(d1.getDepartmentByID5().get(i).getDepartmentID() + ", " + d1.getDepartmentByID5().get(i).getDepartmentName());
            if(d1.getDepartmentByID5().get(i) == null){
                System.out.println("NULL");
            }
        }



        //ex2 question3
        System.out.println("\n\nquestion3");
        System.out.println("Enter Department ID : ");
        int departmentID = Integer.parseInt(sc.nextLine());

        int size3 = d1.getDepartmentByID(departmentID).size();
        for (int i = 0; i < size3; i++) {
            System.out.println(d1.getDepartmentByID(departmentID).get(i).getDepartmentID() + ", " + d1.getDepartmentByID(departmentID).get(i).getDepartmentName());
            if(d1.getDepartmentByID(departmentID).get(i) == null){
                System.out.println("NULL ");
            }
        }
       
       
        //ex2 question 4
        System.out.println("\n\nquestion4");
        System.out.println("Enter Department Name : ");
        String departmentName = sc.nextLine();
        boolean check = d1.isDepartmentNameExists(departmentName);
        if(check == true){
            System.out.println("Has Department: " + departmentName);
        }
        else
        System.out.println("NULL ");



        //ex2 question 5
        System.out.println("\n\nquestion5");
        System.out.println("Enter Department Name: ");
        departmentName = sc.nextLine();
        d1.createDepartment(departmentName);

        //ex2 question6
        System.out.println("\n\nquestion6");
        System.out.println("Enter Department 's informantion: ");
        System.out.println("Enter Department ID : ");
        departmentID = Integer.parseInt(sc.nextLine());

        System.out.println("Enter Department Name : ");
        departmentName = sc.nextLine();
        
        d1.updateDepartmentName(departmentID,departmentName);


        //ex2 question7
        System.out.println("\n\nquestion7");
        System.out.println("Enter Department ID which you want to delete: ");
        departmentID = Integer.parseInt(sc.nextLine());
        d1.deleteDepartmentByID(departmentID);


        //ex3 question1
        System.out.println("Enter Department Name which you want to delete: ");
        departmentID = Integer.parseInt(sc.nextLine());
        d1.deleteDepartmentUsingProcedure(departmentID);
    }
}
