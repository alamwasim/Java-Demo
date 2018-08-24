import java.util.Scanner;import javax.print.DocFlavor.CHAR_ARRAY;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("ENter first name");
		String string=scanner.nextLine();
		System.out.println("ENter last name");
		String string2=scanner.nextLine();
		
		System.out.println("your first name "+ string);
		System.out.println("your last name "+ string2);
		String name=string.concat(string2);
		System.out.println("Your name is "+ name);
		System.out.println("Your auto generated id is ");
		

	}

}
