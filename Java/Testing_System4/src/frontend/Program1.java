package frontend;

import backend.ex1.Account;
import backend.ex1.Department;
import backend.ex1.Group;

public class Program1 {
    public static void main(String[] args){
        Department d1 = new Department();
        Department d2 = new Department("sale");

        Account a1 = new Account();
        Account a2 = new Account(2, "do", "son", "son2000","son.dt@gmail.com");
        Account a3 = new Account(3, "do", "ha", "haabc", "ha.dt@gmail.com", "20/4/2021",2);
        Account a4 = new Account(4, "do", "duong", "duong2006","duong.dd@gmail.com",4);

        Account a[] = {a1,a2,a3};

        Group g1 = new Group();
        Group g2 = new Group(2, "team1", 3,a,"11/1/2021");
        Group g3 = new Group(3, "team2", 5, a, "4/3/2021");


    }
}
