package com.myinterfaces;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.pojo.Student;

public abstract class StudentFileIoImpl implements StudentFileIO{
	public Student[] readStudents() {
		Student [] students;
		students=new Student[2];

		for(int i=0;i<2;i++) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Name");
		String name=scanner.nextLine();		
		System.out.println("Enter RollNo");
		int rollNo=scanner.nextInt();
		System.out.println("Enter Marks");
		int marks=scanner.nextInt();
			
		students[i]=new Student(rollNo,marks,name);
		}
		
		try {
			FileOutputStream fo=new FileOutputStream("student.txt");
			ObjectOutputStream oo=new ObjectOutputStream(fo);
			oo.writeObject(students);
			oo.close();
			fo.close();
			
			System.out.println("operation completed");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return students;
	}
	
	public int writeStudents(Student[]students) {
		
		try {
			FileInputStream fi=new FileInputStream("student.txt");
			ObjectInputStream oi=new ObjectInputStream(fi);
			
			Object obj=oi.readObject();
			Student []stu=(Student[])obj;
			for(int i=0;i<2;i++) {
			System.out.println(stu[i].getName()+"\t"+stu[i].getRollNo());
			System.out.println(stu[i]);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
		
	}

}
