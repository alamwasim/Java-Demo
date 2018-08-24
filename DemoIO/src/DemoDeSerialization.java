import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.pojo.Student;

public class DemoDeSerialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		

	}

}
