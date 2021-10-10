package ex2.question1;

 interface Istudent{
    void diemDanh();
    void hocBai();
    void diDonVeSinh();

}

public class Student{
    private int StudentID;
    private String StudentName;
    private int Group;
    
    
    public Student(int studentID, String studentName, int group) {
        StudentID = studentID;
        StudentName = studentName;
        Group = group;
    }

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int studentID) {
        StudentID = studentID;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public int getGroup() {
        return Group;
    }

    public void setGroup(int group) {
        Group = group;
    }

    
    
}
