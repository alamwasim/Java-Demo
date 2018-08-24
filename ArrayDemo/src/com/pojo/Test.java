package com.pojo;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s=new Student();
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter name");
		String name=scanner.nextLine();
		
		System.out.println("enter marks");
		int [] marks=new int[3];
		for (int i=0 ; i<marks.length;i++) {
			marks[i]=scanner.nextInt();
		}
		
		System.out.println("enter rollNo");
		int rollNo=scanner.nextInt();
		
		Student s2=new Student(name,marks,rollNo);
		s2.display();
		
		

	}

}
