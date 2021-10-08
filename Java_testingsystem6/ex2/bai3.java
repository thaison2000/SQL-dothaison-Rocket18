package ex2;

public class bai3 {
    public static void main(String[] args){
        int numbers[] = {1,2,3};
        try{
            System.out.println(numbers[10]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error!");
            e.getMessage();
            e.getCause();
        }
    }
}
