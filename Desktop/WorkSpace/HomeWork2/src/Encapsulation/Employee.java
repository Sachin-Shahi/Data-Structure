package Encapsulation;

public class Employee{
	private String name;
	private int salary;
	private int hours;

	Employee (String name, int salary, int hours){
		this.name=name;
		this.salary=salary;
		this.hours=hours;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
}


