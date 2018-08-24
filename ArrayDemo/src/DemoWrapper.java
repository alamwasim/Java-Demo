
public class DemoWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer obj= new Integer(10);
		
		int value=obj.intValue();
		
		int data=obj;   //auto unboxing
		//int data=obj.intValue();
		
		obj=200; //autoboxing
		//obj=new Integer(200);

	}

}
