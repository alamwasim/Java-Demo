
public class Person {

	private int age;
	private String name;
	
	//acces_sp return_type fun_name(){}
	public void display() {
		System.out.println("name:-" + name + "\t" + "Age is "+ age);
	}
	
	public Person()
	{
		age=10;
		name="XYZ";
	}
	/*
	 public void setvalues()
	{
		age=10;
		name="XYZ";
	}
	 */
	//constructor
	public Person (int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	/*public void setValues(int a,String n)
	{
		age=a;
		name=n;
	}*/

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//setter
	/*public void setAge(int a)
	{
		age=a;
	}*/

	
}
