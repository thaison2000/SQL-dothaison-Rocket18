package ex2.question1;

public class main {
    public static void main(String[] args){

    //tao 1 mang chua 10 hoc sinh
    Student student[] = new Student[10];
    student[0] = new Student(1,"thaison",1);

    student[1] = new Student(2,"thaiha",1);

    student[2] = new Student(3,"daiduong",1);

    student[3] = new Student(4,"duchung",2);

    student[4] = new Student(5,"vinhlinh",2);

    student[5] = new Student(6,"huongmai",2);

    student[6] = new Student(7,"phuonguyen",2);

    student[7] = new Student(8,"yvan",3);

    student[8] = new Student(9,"uyenmy",3);

    student[9] = new Student(10,"phuonglinh",3);

    // keu goi ca lop di diem danh
    for(int i= 0;i<10;i++){
        System.out.println("" + student[i].getStudentName()+ "diem danh");   
    }

    //goi nhom 1 di hoc bai
    for(int i= 0;i<10;i++){
        if(student[i].getGroup()==1){
        System.out.println("" + student[i].getStudentName()+ "hoc bai"); 
        }  
    }

    //goi nhom 2 di don ve sinh
    for(int i = 0;i<10;i++){
        if(student[i].getGroup()==1){
        System.out.println("" + student[i].getStudentName()+ "don ve sinh"); 
        }  
    }
}
}
