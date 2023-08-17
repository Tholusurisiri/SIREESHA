import java.util.Scanner;

public class Fibonacciseries {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the  number of terms in the fibonacci series");
		int n = scan.nextInt();
		System.out.println("fibonanic serirs up to " +n+ "  number");
		
		int fibonacciseries=fibonacciseries(n);
		
		
	}

	private static int fibonacciseries(int n) {
		int  firstnumber =0, secondnumber=1;
		for(int i=1;i<=n; i++)
		System.out.println(firstnumber+ "  " +secondnumber+"  " );
		int nextnumber = firstnumber+secondnumber;
		firstnumber = secondnumber;
		return secondnumber= nextnumber;
	}



}


