mport java.util.Scanner;
public class FactorialNumber {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number=");
		int num = scan.nextInt();
		int factorial=1;
		
		for(int i=num ; i>=1 ;i--)
		{
			factorial =factorial*i;
			
		}
		System.out.println("the factorial of given number "+num+"= "+factorial);
		scan.close();
	}

}


