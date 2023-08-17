import java.util.Scanner;

public class Sumofdigitsofanumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number ");
		int num = scan.nextInt();
		int sum =calculatesumofdigits(num);
		System.out.println("sum of digits "+num+" "+sum);

	}

	private static int calculatesumofdigits(int num) {
		int r=0,sum=0;
		for(int i=0;num!=0;i++)
		{
			r=num%10;
			sum=sum+r;
			num=num/10;
		}
		return sum;
	}

}
