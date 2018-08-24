import java.util.Arrays;

public class DemoArrayOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numbers= {12,34,65,44,56,78,345};
		
		//Arrays.fill(numbers, 0);//complete filling
		
//		for (int num : numbers) {
			//System.out.println(num);
//		}
		
		Arrays.fill(numbers,1,3,100);
		for (int num : numbers) {
			System.out.println(num);
		}
		
		System.out.println("**********");
		int [] arr_copy=Arrays.copyOf(numbers, 5);
		for (int num : arr_copy) {
			System.out.println(num);
		}
		System.out.println("****COMPARISION******");
		
		String [] names= {"ABC","CDE","LMN"};
		String [] names1= {"AC","CDE","LMN"};
		
		boolean data=Arrays.equals(names, names1);
		if(data)
		{
			System.out.println("two arrays are equal");
		}
		
		System.out.println("****SORTING******");
		Arrays.sort(numbers);
		for (int num : numbers) {
			System.out.println(num);
		}
		
		System.out.println("****SEARCHING******");
		int index=Arrays.binarySearch(numbers, 100);
		System.out.println(index);
				

	}

}
