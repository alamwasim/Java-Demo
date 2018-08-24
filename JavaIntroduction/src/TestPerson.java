
public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cls_name ref_name
		Person p; //stack allocation memory
		//ref_name=new Cls_name()
		p=new Person(); //hip allocation memeory
		//p.setValues();
		p.display();//to invoke a function-  ref_name.name_of_fun();
		
		p=new Person(123,"abcd");//for constructor
		//p.setValues(12,"city");
		p.display();
		p.setAge(1000);
		p.display();
		

	}

}
