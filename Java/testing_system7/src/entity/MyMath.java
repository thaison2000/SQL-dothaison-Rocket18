package entity;

public class MyMath {
	
	public final static double PI = 3.14;
	public static int max(int a, int b) {
		if(a<=b) {
			return b;
		}
		else {
			return a;
		}
	}
	
	public static int min(int a, int b) {
		if(a<=b) {
			return a;
		}
		else {
			return b;
		}
	}
	
	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static double sum(double a) {
		return a+ PI;
	}
	
	
}


