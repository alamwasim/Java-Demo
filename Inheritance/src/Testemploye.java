import com.pojo.Person;

public class Testemploye {
	
	public static void main(String[] args) {
		Person p1=new Person();
		Person p2=new Person();
		
		if(p1.equals(p2))
			System.out.println("Equal");
		else
			System.out.println("NOT Equal");
	}

}
