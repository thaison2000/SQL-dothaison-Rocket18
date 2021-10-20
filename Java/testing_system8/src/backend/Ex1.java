package backend;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


import entity.Student;

public class Ex1 {
	private List<Student> students ;
	public Ex1() {
		Scanner scanner = new Scanner(System.in);
		students = new ArrayList<Student>();
		System.out.println("nhap vao so sinh vien muon them:");
		int n = Integer.parseInt(scanner.nextLine());
		for(int i=0;i<n;i++) {
			System.out.println("Nhap vao ho ten sinh vien thu " +(i+1) + " : ");
			String name = scanner.next();
			Student st = new Student(name);
			students.add(st);
		}
		
	}
	public void ques1() {
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lua chon chuc nang muon su dung: ");
		
		System.out.println("1.In ra so luong sinh vien");
		
		System.out.println("2.Lay ra sinh vien thu 4 trong danh sach");

		System.out.println("3.Lay ra sinh vien dau cuoi trong danh sach");

		System.out.println("4.Them 1 sinh vien vao dau danh sach");

		System.out.println("5.Them 1 sinh vien vao cuoi danh sach");

		System.out.println("6.Dao nguoc vi tri sinh vien trong danh sach");

		System.out.println("7.Tim sinh vien theo id");

		System.out.println("8.Tim sinh vien theo name");

		System.out.println("9.In ra cac sinh vien trung ten");

		System.out.println("10.Xoa ten sinh vien co id = 2");

		System.out.println("11.Xoa sinh vien co id = 5");
		
		System.out.println("\n\nNhap vao chuc nang ban muo lua chon: " );
		int id = Integer.parseInt(sc.nextLine());
		
		switch(id) {
		case 1: System.out.println("So sinh vien trong danh sach: " + students.size());
				break;
		case 2: System.out.println("Sinh vien thu 4 trong danh sach: " + students.get(3));
				break;
		case 3: System.out.println("Sinh vien dau tien trong danh sach: " + students.get(0));
				System.out.println("Sinh vien cuoi cung trong danh sach: " + students.get(students.size() -1));
				break;
		case 4: System.out.println("Nhap vao ten sinh vien: ");
				String name = sc.nextLine();
				Student st = new Student(name);
				students.add(0,st);
				break;
		case 5: System.out.println("Nhap vao ten sinh vien: ");
				name = sc.nextLine();
				st = new Student(name);
				students.add(students.size() -1,st);
				break;
		case 6: System.out.println("Dao nguoc vi tri sinh vien trong danh sach: ");
				Collections.reverse(students);
				break;
		case 7: System.out.println("Nhap vao id sinh vien");
				int studentID = Integer.parseInt(sc.nextLine());
				boolean check = false;
				for(int i = 0;i<students.size();i++) {
					if(students.get(i).getStudentID() == studentID) {
						System.out.println(students.get(i));
						check = true;
						break;
					}
				}
				if(check == false) {
					System.out.println("Khong co id sinh vien can tim");
				}
				break;
		case 8: System.out.println("Nhap vao ten sinh vien");
				name = sc.nextLine();
				check = false;
				for(int i = 0;i<students.size();i++) {
					if(students.get(i).getStudentName() == name) {
						System.out.println(students.get(i));
						check = true;
						break;
					}
				}
				if(check == false) {
					System.out.println("Khong co ten sinh vien can tim");
				}
				break;
		case 9: System.out.println("Ten cua cac sinh vien co trung ten: ");
				for(int i=0;i<students.size();i++) {
					for(int j = 1;j<students.size();j++) {
						if(students.get(i).getStudentName() == students.get(j).getStudentName()) {
							System.out.println(students.get(i).getStudentName());
							break;
							
						}
					}
				}
		case 10: System.out.println("Nhap vao id sinh vien can xoa ten : ");
				 studentID  = Integer.parseInt(sc.next());
				 for(int i = 0;i<students.size();i++) {
					 if(students.get(i).getStudentID() == studentID) {
						 students.get(i).setStudentName("");
					 }
				 }
		case 11: System.out.println("Nhap vao id sinh vien can xoa : ");
		 		 studentID  = Integer.parseInt(sc.next());
		 		 for(int i = 0;i<students.size();i++) {
		 			 if(students.get(i).getStudentID() == studentID) {
		 				 students.remove(i);
		 			 }
		 		 }
		case 12: System.out.println("Tao moi 1 ArrayList ten la studentCopies: ");
				 List<Student> studentCopieStudents = new ArrayList<Student>();
				 for(int i=0;i<students.size();i++) {
					 studentCopieStudents.add(students.get(i));
				 }
				 System.out.println("Danh sach sinh vien studentCopies: ");
				 for(int i=0;i<studentCopieStudents.size();i++) {
					 System.out.println(studentCopieStudents.get(i));
				 }
		}
		
		
	}
	}
}
