package com.myinterfaces;


import com.pojo.Student;

public interface StudentFileIO {
	Student [] readStudent();
	int writeStudents(Student[]students);

}
