package ex1;

public class App {
    public static void main(String[] args)  {
        Account a1 = new Account(1,"thaison","son","10/10/2020",2,3);
        Account a2 = new Account(2,"thaiha","ha","10/10/2020",1,3);
        Account a3 = new Account(3,"daiduong","duong","10/10/2020",2,2);

        Department d1 = new Department(1,"sale");
        Department d2 = new Department(2,"dev");
        Department d3 = new Department(3,"marketing");

        Position p1 = new Position(1,"tester");
        Position p2 = new Position(1,"ceo");
        Position p3 = new Position(1,"manager");

        Group g1 = new Group(1,"group1", "14/1/2021", 1);
        Group g2 = new Group(2,"group2", "14/1/2021", 1);
        Group g3 = new Group(3,"group3", "14/1/2021", 2);

        Exam e1 = new Exam(1,"abc123","thiHK",2, "2hours", 1,"22/4/2021");
        Exam e2 = new Exam(2,"abc123","thiGK",1, "2hours", 2,"22/4/2021");
        Exam e3 = new Exam(3,"abc123","kiemtranhanh",2, "2hours", 1,"22/4/2021");

       System.out.println("thong tin nguoi dung a1: " + a1.toString());
       
    }
}
