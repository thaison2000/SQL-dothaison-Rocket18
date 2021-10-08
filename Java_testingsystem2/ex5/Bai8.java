package ex5;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n;
        Account a1 = null;
        Department d1 = null;
        do{
            System.out.println("nhap vao so:");
            n = scanner.nextInt();           
        }while(n<0&&n>2);

        if(n==1){
            
            System.out.println("nhap vao account ID: ");
            int id = scanner.nextInt();
            a1.setAccountID(id);

            System.out.println("nhap vao ho ten: ");
            String fullName = scanner.nextLine();
            a1.setFullName(fullName);
        }
        else if(n ==2){
            System.out.println("nhap vao department ID: ");
            int id = scanner.nextInt();
            a1.setAccountID(id);

            System.out.println("nhap vao ten department: ");
            String departmentName = scanner.nextLine();
            a1.setFullName(departmentName);
        }
    }
    
}
