package backend;

import java.util.Scanner;

import entity.MyMath;
import entity.PrimaryStudent;
import entity.SecondaryStudent;
import entity.Student;

public class ex1 {
	public void question1() {
		Scanner scanner = new Scanner(System.in);
		Student students[] = new Student[3];
		
		System.out.println("Khoi tao 3 sinh vien:");
		for(int i=0;i<students.length;i++) {
			System.out.println("Nhap vao ten sinh vien thu"+ (i+1));
			String name = scanner.nextLine();
			students[i] = new Student(name);
		}
		
		System.out.println("Thong tin cac sinh vien vua nhap: ");
		for(int i=0;i<students.length;i++) {
			System.out.println( students[i].toString());
		}
		
		System.out.println("Chuyen cac sinh vien sang Dai Hoc Cong Nghe");
		Student.setUniversityString("Dai hoc Cong Nghe");
		for(int i=0;i<students.length;i++) {
			System.out.println( students[i].toString());
		}
	}
	
	public void question2() {
		Scanner scanner = new Scanner(System.in);
		Student students[] = new Student[3];
		
		System.out.println("Khoi tao 3 sinh vien:");
		for(int i=0;i<students.length;i++) {
			System.out.println("Nhap vao ten sinh vien thu"+ (i+1));
			String name = scanner.nextLine();
			students[i] = new Student(name);
		}
		//b1
		System.out.println("Moi sinh vien se nop quy 100k");
		for(int i=0;i<students.length;i++) {
			int moneyGroup = students[i].getMoneyGroup() + 100000;
			students[i].setMoneyGroup(moneyGroup);
		}
		System.out.println("Quy: "+ Student.getMoneyGroup());
		
		//b2
		System.out.println("Sinh vien 1 lay 50k di mua bim bim");
		int moneyGroup = Student.getMoneyGroup()-50000;
		Student.setMoneyGroup(moneyGroup);
		System.out.println("Quy: " + moneyGroup);
		
		//b3
		System.out.println("Sinh vien 2 lay 20k di mua banh mi");
		moneyGroup = Student.getMoneyGroup()-20000;
		Student.setMoneyGroup(moneyGroup);
		System.out.println("Quy: " + moneyGroup);
		
		//b4
		System.out.println("Sinh vien 3 lay 150k di do dung hoc tap cho nhom");
		moneyGroup = Student.getMoneyGroup()-150000;
		Student.setMoneyGroup(moneyGroup);
		System.out.println("Quy: " + moneyGroup);
	}
	
	public void question3() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap vao so thu nhat: ");
		int a = scanner.nextInt();
		System.out.println("nhap vao so thu hai: ");
		int b = scanner.nextInt();
		System.out.println("Max cua 2 so: " + MyMath.max(a, b));
		System.out.println("Min cua 2 so: " + MyMath.min(a, b));
		System.out.println("Sum cua 2 so: " + MyMath.sum(a, b));
	}
	
	public void question4() {
		System.out.println("Sinh vien dang hoc tai truong : " + Student.getUniversityString());
		Student.setUniversityString("dai hoc Cong Nghe");
		System.out.println("Sinh vien chuyen sang hoc tai truong: " + Student.getUniversityString());
	}
	
	public void question5() {
		Scanner scanner = new Scanner(System.in);
		Student students[] = new Student[3];
		
		System.out.println("Khoi tao 3 sinh vien:");
		for(int i=0;i<students.length;i++) {
			System.out.println("Nhap vao ten sinh vien thu"+ (i+1));
			String name = scanner.nextLine();
			students[i] = new Student(name);
		}
		
		System.out.println("So sinh vien duoc tao ra tren he thong la: " + Student.getCount());
	}
	
	public void question6() {
		Scanner scanner = new Scanner(System.in);
		Student students[] = new Student[6];
		
		System.out.println("Khoi tao 2 sinh vien cap 1:");
		for(int i=0;i<2;i++) {
			System.out.println("Nhap vao ten sinh vien thu"+ (i+1));
			String name = scanner.nextLine();
			students[i] = new PrimaryStudent(name);
		}
		
		System.out.println("Khoi tao 4 sinh vien cap 2:");
		for(int i=0;i<4;i++) {
			System.out.println("Nhap vao ten sinh vien thu"+ (i+1));
			String name = scanner.nextLine();
			students[i] = new SecondaryStudent(name);
		}
		
		System.out.println("So hoc sinh cap 1 duoc tao ra tren he thong la: " + PrimaryStudent.getCountPrimaryStudent());
		System.out.println("So hoc sinh cap 2 duoc tao ra tren he thong la: " + SecondaryStudent.getCountSecondaryStudent());

	}
	
	
}
