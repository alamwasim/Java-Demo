
public class Demo1d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numbers;     //refrence are created in stack memory
		numbers=new int[5]; //memory are allocated in hemp memory
		numbers[0]=100;
		numbers[1]=200;
		numbers[2]=100;
		numbers[3]=500;
		numbers[4]=1000;
		int sum =add(numbers);
		System.out.println("Sum "+ sum);
		
		for(int i=0;i<numbers.length;i++)
		{
			//System.out.println(numbers[i]);
		}
		for (int x : numbers) {
			System.out.println(x);
		}

	}
	
	public static int add(int[] numbers)
	{
		return (numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4]);
	}
	
	

}
