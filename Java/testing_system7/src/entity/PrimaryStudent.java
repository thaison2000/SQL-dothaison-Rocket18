package entity;

public class PrimaryStudent extends Student{
	private static int countPrimaryStudent = 0;

	public PrimaryStudent(String studentName) {
		super(studentName);
		countPrimaryStudent ++;	
	}

	public static int getCountPrimaryStudent() {
		return countPrimaryStudent;
	}

	public static void setCountPrimaryStudent(int countPrimaryStudent) {
		PrimaryStudent.countPrimaryStudent = countPrimaryStudent;
	}
	
	
}
