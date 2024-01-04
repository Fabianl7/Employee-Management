import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		Employee emp1 = new Employee(111, "Jimmy Dean", 5256.32, 0),  
			     emp2 = new Employee(598, "Jen Johnson", 47370, 5), 
			     emp3 = new Employee(920, "Jan Jones", 47834.25, 1); 
			   
			  System.out.println(emp1.equals(emp3)); 
			 
			  ArrayList<Employee> list = new ArrayList<>(); 
			 
			  list.add(emp1); 
			  list.add(emp2); 
			  list.add(emp3); 
			 
			  Collections.sort(list);
			   
			  for (Employee e : list) 
			   System.out.println(e); 

	}

}

class Employee implements Comparable<Employee>{
	int id;
	String name;
	double salary;
	int numberOfDependents;
	
	public Employee(int id, String name, double salary, int numberOfDependents) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.numberOfDependents = numberOfDependents;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getNumberOfDependents() {
		return numberOfDependents;
	}

	public void setNumberOfDependents(int numberOfDependents) {
		this.numberOfDependents = numberOfDependents;
	}
	
	public double getNetSalary() {
		return this.salary*0.91+(this.numberOfDependents * 0.01 * this.salary);
	}
	
	public boolean equals(Object o) {
		if(o instanceof Employee) {
			if(this.getNetSalary() == ((Employee) o).getNetSalary())
				return true;
		}
		
		return false;
	}
	
	public int compareTo(Employee o) {
		if(this.getNetSalary()<o.getNetSalary())
			return -1;
		if(this.getNetSalary()>o.getNetSalary())
			return 1;
		return 0;
	}
	
	public String toString() {
		return "[" + this.id + ", " + this.name + ", " + this.getNetSalary() + "]";
	}
}