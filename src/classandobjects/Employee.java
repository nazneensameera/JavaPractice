package classandobjects;

public class Employee {
	
	int eid;
	String name;
	double salary;
	String dept;
	String position;
	
	void display() {
		
		System.out.println(eid);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(dept);
		System.out.println(position);
	}
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.eid=101;
		emp.name="Nick";
		emp.salary=1000.27;
		emp.dept="HR";
		emp.position="Manager";
		emp.display();
		
		
		Employee emp1 = new Employee();
		emp1.eid=102;
		emp1.name="Max";
		emp1.salary=20000;
		emp1.dept="Accounts";
		emp1.position="Manager";
		emp1.display();
		
		
	}
	
	
	
	
	
	

}
