package backend;

import entity.Employee;
import entity.MyMap;
import entity.StudentEx3;

public class Ex3 {
	public void ques1() {
		StudentEx3<Integer> st1 = new StudentEx3<Integer>(1,"thaison");
		StudentEx3<Float> st2 = new StudentEx3<Float>(2.0f, "thaiha");
		StudentEx3<Double> st3 = new StudentEx3<Double>(3.0, "thaiha");
	}
	private <T> void print(T a) {
		System.out.println(a);
	}
	public void ques2() {
		print(1);
		print(2.0f);
		print(3.0);
		
	}
	public void ques4() {
		Integer i[] = {1,2,3};
		Float f[] = {1.0f,2.0f,3.0f};
		Double d[] = {1.0,2.0,3.0};
		
		print(i);
		print(f);
		print(d);
	}
	
	public void ques5() {
		Integer salaries1[] = {100,200,300};
		Employee<Integer> e1 = new Employee<Integer>("thaison", salaries1);
		
		Float salaries2[] = {100.0f,200.0f,300.0f};
		Employee<Float> e2 = new Employee<Float>("thaiha", salaries2);
		
		Double salaries3[] = {100.0,200.0,300.0};
		Employee<Double> e3 = new Employee<Double>("daiduong", salaries3);
		
	}
	
	public void ques6() {
		MyMap<Integer,String> students = new MyMap<Integer, String>(1,"dothaison");
		System.out.println(students.getKey());
		System.out.print(students.getValue());
	}
}
