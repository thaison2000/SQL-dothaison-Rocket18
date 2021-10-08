package backend.ex1;

public class Department{
    private int DepartmentID;
    private String DepartmentName;

    
    
    public Department() {
    }

    public Department(String departmentName) {
        DepartmentID = 0;
        DepartmentName = departmentName;
    }

    public Department(int departmentID, String departmentName) {
        DepartmentID = departmentID;
        DepartmentName = departmentName;
    }

    
}