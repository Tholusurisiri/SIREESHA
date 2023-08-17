import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the prime number");
		int num = scan.nextInt();
		int primenumber = isprimenumber(num);
	}

	private static int isprimenumber(int num) {
		int count =0;
		int num1=10;
		for(int i=1;i<=num1;i++)
		{
			if(num1%i==0)
			{
				count++;
			}
			}if(count==2)
			{
				System.out.println("prime number");
		}else
		{
			System.out.println(" not a prime number");	
		}count =0;
		return  num1 ;
	}

}
