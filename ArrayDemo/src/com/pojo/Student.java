package com.pojo;

public class Student {
	
	private String name;
	private int[] marks;
	private int rollNo;
	
	public Student(){
		name="ABC";
		marks= null;
		rollNo=00;		
	}
	public Student(String name,int[] marks,int rollNo) {
		this.name=name;
		this.marks=marks;
		this.rollNo=rollNo;
	}
	
	public void display() {
		System.out.println("The name os student is "+ name +" marks "+marks[0]+" "+marks[1]+" "+marks[2]+" "+" rollNo "+rollNo);
		
	}

}


