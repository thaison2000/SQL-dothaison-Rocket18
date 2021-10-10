package ex2.question2;

import java.util.Scanner;

public class Student extends Person{
    private int mssv;
    private float diem;
    private String email;
    
    public Student(){

    }

    public Student(int mssv, float diem, String email) {
        this.mssv = mssv;
        this.diem = diem;
        this.email = email;
    }

    public Student(String ten, String gioiTinh, String ngaySinh, String diaChi, int mssv, float diem, String email) {
        super(ten, gioiTinh, ngaySinh, diaChi);
        this.mssv = mssv;
        this.diem = diem;
        this.email = email;
    }

    public Student inputInfor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao ten:");
        String ten = sc.nextLine();
        System.out.println("nhap vao gioi tinh:");
        String gioiTinh = sc.nextLine();
        System.out.println("nhap vao ngay sinh:");
        String ngaySinh = sc.nextLine();
        System.out.println("nhap vao dia chi:");
        String diaChi = sc.nextLine();
        System.out.println("nhap vao mssv:");
        int mssv = Integer.parseInt(sc.nextLine());
        System.out.println("nhap vao diem:");
        float diem =  Float.parseFloat(sc.nextLine());
        System.out.println("nhap vao email:");
        String email = sc.nextLine();
        Student s1 = new Student(ten, gioiTinh, ngaySinh, diaChi, mssv, diem, email);
        return s1;
    }

    public void showInfor(){
        System.out.println("Ho ten:" +this.ten + "gioi tinh"+ this.gioiTinh+ "ngay sinh" + this.ngaySinh + "dia chi" + this.getDiaChi()+ "mssv: "+ this.mssv + "diem: " + this.diem + "email" + this.email);
    }
}
