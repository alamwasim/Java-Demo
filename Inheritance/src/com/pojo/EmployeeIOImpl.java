package com.pojo;

import java.util.Scanner;

import com.pojo.Employee;
public class EmployeeIOImpl implements EmployeeIO {

	@Override
	public Employee readEmployee() {
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
		
		return emp;
	}

	@Override
	public void writeEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employee.display();

	}

}
