package variables;

public class StudentMain {
	
	public static void main(String[] args) {
		
		//Assign values to varibles by using reference variables 
		
//		Student stu1 = new Student();
//		stu1.sid=1;
//		stu1.sname="Hasan";
//		stu1.grade='A';
//		stu1.display();
//		
//		//Assign values to variables by using method 
//		Student stu2 = new Student();
//		stu2.getValues(2, "Yoususf", 'A');
//		stu2.display();
//		
	//assigning values through constructor	
	Student st3= new Student(3,"Max", 'C');
	st3.display();
	}

}
