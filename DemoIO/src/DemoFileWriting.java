import java.io.FileWriter;
import java.io.IOException;

public class DemoFileWriting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileWriter fileWr=new FileWriter("abc.txt",true);
			fileWr.write("City,Pune");
			fileWr.close();
			
			System.out.println("FIle created and data inserted");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
