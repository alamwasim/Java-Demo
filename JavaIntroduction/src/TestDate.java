
public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date1;
		Date date2;
		date1=new Date();
		date1.display();
		date2=new Date(9,8,2018);
		date2.display();
		
		date1.setDay(10);
		date1.setMonth(10);
		date1.setYear(2050);
		
		date1.display();
		System.out.println(date1.getDay()+" "+ date1.getMonth());

	}

}
