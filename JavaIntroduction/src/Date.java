
public class Date {
	
	int day;  //data member
	int month;
	int year;
	
	public Date()    //default initiator or constructor
	{
		day=00;
		month=00;
		year=0000;
	}
	public Date(int day, int month, int year)  //parametreised initiator or constructor
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}

	public int getDay() {    //getter
		return day;
	}

	public void setDay(int day) {   //setter
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void display()
	{
		System.out.println(day+"-"+month+"-"+year);
	}
	

}
