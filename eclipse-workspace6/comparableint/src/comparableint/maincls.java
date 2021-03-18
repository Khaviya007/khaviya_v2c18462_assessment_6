package comparableint;
import java.util.*;
public class maincls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Employee> al=new ArrayList<Employee>();
al.add(new Employee(1,"Dini","IT",23));
al.add(new Employee(1,"Aji","IT",21));
al.add(new Employee(1,"khavi","IT",20));

Collections.sort(al);
for(Employee s1 : al) {
	System.out.println("Employee details:");
	System.out.println("Rollno :" +s1.rollno+ " " +"Name :" +s1.name+ " " +"Department :" +s1.dept+ " " +"Age :" +s1.age);
}
	}

}
