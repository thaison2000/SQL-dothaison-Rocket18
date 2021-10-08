package backend.ex4;

public class Student {
    private int StudentID;
    private String StudentName;
    private String hometown;
    private float score;
    
    public Student(String studentName, String hometown) {
        StudentName = studentName;
        this.hometown = hometown;
        this.score = 0;
    }

    public void setScore(float score){
        this.score = score;
    }

    public void plusScore(float plus){
        this.score = this.score + plus;
    }

    public void showInfor(){
        System.out.println("Ten sinh vien:" + StudentName);
        if(score<4){
            System.out.println("Hoc luc yeu");
        }
        else if(score<6 && score>=4){
            System.out.println("Hoc luc trung binh");
        }
        else if(score<8 && score>=6){
            System.out.println("Hoc luc kha");
        }
        else{
            System.out.println("Hoc luc gioi");
        }
    }
}
