import java.util.Scanner;

public class Printagivennumbertable {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("enter the print number");
		int number = scan.nextInt();
		int printnumbertable = printnumbertable(number);
		System.out.println("table number  "+number+  "number");
		
		
		

	}

	private static int printnumbertable(int number) {
		
		
		
		for(int i=1; i<=10; i++)
		{

		  int result= number *i;
		 
		System.out.println(number+ "*" +i+" ="+result);
	}
		return number;

}

}

		