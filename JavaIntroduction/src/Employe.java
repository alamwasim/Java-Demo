
public class Employe {
	private int empId;
	private String empName;
	static int empCount;
	
	public Employe()
	{
		empId=10;
		empName="Wasim";
		empCount++;
	}
	
	public Employe(int empId, String empName)
	{
		this.empId=empId;
		this.empName=empName;
		empCount++;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	

}
