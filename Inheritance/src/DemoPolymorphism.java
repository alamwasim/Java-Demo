import com.pojo.Employee;
import com.pojo.Person;

public class DemoPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person e=new Employee();//super class refrence=object of sub class
		((Employee)e).display();//Downcasting
	}
	

	

	
}
