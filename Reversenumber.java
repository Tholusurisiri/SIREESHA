import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int reverse = reverseNumber(num);
		System.out.println(" reverse of given number ");
		scan.close();
		
	}

	private static int reverseNumber(int num) {
		int r=0;
		for(int i=1; num!=0;i++)
		{
			r=num%10;
			System.out.println(r);
			num=num/10;
		}
		return r;
	}

}