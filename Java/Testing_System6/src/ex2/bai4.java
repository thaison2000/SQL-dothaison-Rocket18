package ex2;

public class bai4 {

    public static void getIndex(int index, Department d[]){
        try{
            System.out.println("Thong tin:");
            System.out.println("Id can ho: " + d[index].getDepartmentID());
            System.out.println("Name can ho: " + d[index].getDepartmentName());

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Cannot find department");
        }
    }
    public static void main(String[] args){
    Department departments[] = new Department[3];

    departments[0]  = new Department(1, "sale");
    bai4.getIndex(0, departments);
    }

    
}
