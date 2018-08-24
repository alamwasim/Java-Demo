import java.util.Scanner;

import com.pojo.Employee;

public class TestEmployee1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter name");
		String name=scanner.nextLine();
		System.out.println("enter empId");
		int empId=scanner.nextInt();
		System.out.println("enter Salary");
		double Salary=scanner.nextInt();
		System.out.println("enter age");
		int age=scanner.nextInt();
		
		Employee emp=new Employee(empId,Salary,age,name);
		emp.display();
		
	
		

	}

}
