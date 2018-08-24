
public class DemoStringEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="citi";
		System.out.println("initial value "+ name);
		String name1=new String("citi");
		if(name1.equals(name)) {
			System.out.println("equals");
		}
		else {
			System.out.println("Not equal");
		}
				

	}

}
