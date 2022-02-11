
package classandobjects;

public class Mainclass {
	
public static void main(String[] args) {
		
		Employee emp2 = new Employee();//creating an object of the class
		emp2.eid=103;
		emp2.name="Raj";
		emp2.salary=10007;
		emp2.dept="HR";
		emp2.position="Manager";
		emp2.display();
		
		
		Employee emp3 = new Employee();
		emp3.eid=104;
		emp3.name="Sema";
		emp3.salary=2000;
		emp3.dept="Team Lead";
		emp3.position="Development";
		emp3.display();
		
		
	}

}
