package ex2;

public class bai1{
    public static void main(String[] args){
        float result = divide(7,0);

        System.out.println(result);

    }

    public static float divide(int a, int b){
        try{
            return a/b;
        }
        catch(Exception e){
            System.out.println("cannot divide 0");
        }
        return b;
        }
    }
