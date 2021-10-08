package frontend;

import java.util.Scanner;

import backend.ex6.VietnamesePhone;

public class Program6 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        VietnamesePhone VP = new VietnamesePhone();
        System.out.println("Chuong trinh quan ly SDT lien lac khach hang: /n/n/n");
        System.out.println("Nhan 1 de them SDT");
        System.out.println("Nhan 2 de xoa SDT theo ten khach hang");
        System.out.println("Nhan 3 de cap nhat SDT theo ten khach hang");
        System.out.println("Nhan 4 tim kiem SDT theo ten khach hang/n/n/n");

        int n;
        n = Integer.parseInt(sc.nextLine());

        switch(n){
            case 1:{
                System.out.println("nhap vao ten:");
                String name = sc.nextLine();
                System.out.println("nhap vao SDT:");
                String phone = sc.nextLine();
                VP.insertContact(name,phone);   
            }
            case 2:{
                System.out.println("nhap vao ten:");
                String name = sc.nextLine();
                VP.removeContact(name);
            }
            case 3:{
                System.out.println("nhap vao ten:");
                String name = sc.nextLine();
                System.out.println("nhap vao SDT moi:");
                String newPhone = sc.nextLine();
                VP.updateContact(name, newPhone);
            }
            case 4:{
                System.out.println("nhap vao ten:");
                String name = sc.nextLine();
                VP.searchContact(name);
            }
            
        }


    }
}
