package entity;

public class SecondaryStudent extends Student {
	private static int countSecondaryStudent;

	public SecondaryStudent(String studentName) {
		super(studentName);
		countSecondaryStudent++;
	}

	public static int getCountSecondaryStudent() {
		return countSecondaryStudent;
	}

	public static void setCountSecondaryStudent(int countSecondaryStudent) {
		SecondaryStudent.countSecondaryStudent = countSecondaryStudent;
	}
	
	
}
