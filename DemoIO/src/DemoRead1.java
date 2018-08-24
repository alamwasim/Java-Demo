import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoRead1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Enter two number");
			String n=br.readLine();
			double a=Double.parseDouble(n);
			System.out.println("You enetered:- "+ a);
			
			String n1=br.readLine();
			int b=Integer.parseInt(n1);
			System.out.println("You enetered:- "+ b);
			
			if(a>b) {
				System.out.println(a + " is maxm");
			}
			else {
				System.out.println(b+" is maxm");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
