package comparableint;
//import java.util.ArrayList;
class Employee implements Comparable<Employee> {
	int rollno;
	String name;
	String dept;
	int age;
	public Employee(int rollno, String name, String dept, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.dept = dept;
		this.age = age;
	}
	public int compareTo(Employee e) 
	{
		if(rollno==e.rollno) 
			return 0;
			
		else if(rollno > e.rollno)
			return 1;
		else
			return -1;
		}
	
}
