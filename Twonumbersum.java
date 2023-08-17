package Statements;
import java.util.Scanner;

public class Twonumbersum {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the number=");
	int num1 = scan.nextInt();
	System.out.println("enter the number=");
	int num2 = scan.nextInt();
	int sum  = num1+num2;
System.out.println("sum="+sum);
scan.close();

	}

}
