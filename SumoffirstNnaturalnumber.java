import java.util.Scanner;

public class SumoffirstNnaturalnumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int n =scan.nextInt();
		int sum=calculatesumofNaturalnumbers(n);	
		System.out.println("the sum of first"+n+" natural number"+sum);

	}

	static int calculatesumofNaturalnumbers(int n) {
		int sum =0;
		for(int i=1;i<=n;i++)
		sum =sum+i;

	return sum;
		

	}

}