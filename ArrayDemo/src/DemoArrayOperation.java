
public class DemoArrayOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrays[]= {12,34,56,34,54,100};
		
		
		int search=54;
		int i=0;
		
		
		while(i<arrays.length) {
			System.out.print(arrays[i] + ",");
			i++;
		}
		
		i=0;
		
		
		boolean flag= false;
		while (i<arrays.length) {
			if (arrays[i]==54)
			{
				flag=true;
				System.out.println("if"+arrays[i]);
				break;
			}
			else
			{
				System.out.println("else"+arrays[i]);
			}
			i++;
		}
		if(flag)  //if(flag==true)
		{
			System.out.println("Value FOUND");
		}
		else
		{
			System.out.println("Value NOT FOUND");
		}

	}

}
