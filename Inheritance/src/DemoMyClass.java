import com.pojo.Employee;
import com.pojo.EmployeeIO;
import com.pojo.EmployeeIOImpl;

public class DemoMyClass {
	
	public static void main(String[] args) {
//		EmployeeIO empIO=new EmployeeIO() {
//			
//			@Override
//			public void writeEmployee(Employee employee) {
//				// TODO Auto-generated method stub
//				System.out.println("WriteEmployee");
//				
//			}
//			
//			@Override
//			public Employee readEmployee() {
//				// TODO Auto-generated method stub
//				return new Employee();
//			}
//		};
		EmployeeIOImpl temp=new EmployeeIOImpl();
		Employee emp=temp.readEmployee();
		temp.writeEmployee(emp);
	}

}
