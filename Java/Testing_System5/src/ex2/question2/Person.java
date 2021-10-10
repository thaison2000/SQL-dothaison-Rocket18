package ex2.question2;

import java.util.Scanner;

public class Person {
    protected String ten;
    protected String gioiTinh;
    protected String ngaySinh;
    protected String diaChi;
   
    public Person() {
    }

    public Person(String ten, String gioiTinh, String ngaySinh, String diaChi) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Person inputInfor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao ten:");
        String ten = sc.nextLine();
        System.out.println("nhap vao gioi tinh:");
        String gioiTinh = sc.nextLine();
        System.out.println("nhap vao ngay sinh:");
        String ngaySinh = sc.nextLine();
        System.out.println("nhap vao dia chi:");
        String diaChi = sc.nextLine();
        Person p1 = new Person(ten, gioiTinh, ngaySinh, diaChi);
        return p1;
    }

    public void showInfor(){
        System.out.println("Ho ten:" + this.ten + "gioi tinh"+ this.gioiTinh + "ngay sinh" + this.ngaySinh + "dia chi" + this.diaChi);
    }
    
}
