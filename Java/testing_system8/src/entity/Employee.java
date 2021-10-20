package entity;

import java.util.Arrays;

public class Employee<T> {
	private int employeeID;
	private static int count =0;
	private String name;
	private T salaries[];
	
	public Employee(String name, T[] salaries) {
		
		this.employeeID = ++ count;
		this.name = name;
		this.salaries = salaries;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Employee.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public T[] getSalaries() {
		return salaries;
	}

	public void setSalaries(T[] salaries) {
		this.salaries = salaries;
	}

	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", name=" + name + ", salaries=" + Arrays.toString(salaries)
				+ "]";
	}
	
	
	
	
	
}
