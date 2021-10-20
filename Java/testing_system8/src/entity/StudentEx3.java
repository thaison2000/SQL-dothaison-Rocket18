package entity;

public class StudentEx3<T> {
	private T studentID;
	private String studentName;
	
	public StudentEx3(T studentID, String studentName) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
	}

	public T getStudentID() {
		return studentID;
	}

	public void setStudentID(T studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
}
