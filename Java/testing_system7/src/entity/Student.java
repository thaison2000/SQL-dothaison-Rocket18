package entity;

import java.util.Scanner;

public class Student {
	private int studentID;
	private String studentName;
	private static int count = 0;
	private static String universityString = "dai hoc Bach Khoa Ha Noi";
	private static int moneyGroup;
	
	public Student(String studentName) {
		super();
		studentID = ++ count;
		this.studentName = studentName;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public static String getUniversityString() {
		return universityString;
	}

	public static void setUniversityString(String universityString) {
		Student.universityString = universityString;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Student.count = count;
	}

	public static int getMoneyGroup() {
		return moneyGroup;
	}

	public static void setMoneyGroup(int moneyGroup) {
		Student.moneyGroup = moneyGroup;
	}

	@Override
	public String toString() {
		return "Student [studentID: " + studentID + "\tstudentName: " + studentName + "\tuniversity: " + universityString + "]";
	}

	
	
	

	
}
