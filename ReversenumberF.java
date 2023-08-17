package Statements;
import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number=");
		int num = scan.nextInt();
		int r;
		System.out.println("Reverse number=");

		while(num>0)
		{
		r= num%10;
		System.out.print(r);
			num = num/10;
			

}
}
}
