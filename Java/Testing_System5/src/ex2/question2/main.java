package ex2.question2;

public class main {
    public static void main(String[] args){
        Student s1 = new Student("son", "nam", "14/08/2000", "Ha Noi", 1, 8, "son.dt@gmail.com");

        Student s2;
        s2 = s1.inputInfor();
        s2.showInfor();
    }
}
