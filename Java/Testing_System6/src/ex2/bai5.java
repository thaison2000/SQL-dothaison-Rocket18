package ex2;


import java.util.Scanner;

public class bai5 {
    public static void inputAge(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao 1 so: ");
        
        boolean check = false;
        while(!check){
        try{
            int a= sc.nextInt();
            check = true;
            
        }
        catch(Exception e){
            System.out.println("wrong inputting! ");
            
        }
        sc.close();
    }
       
    }

    public static void main(String[] args){
        inputAge();
        
    }
}
