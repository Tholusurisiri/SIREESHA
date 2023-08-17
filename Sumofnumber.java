package Statements;
import java.util.Scanner;

public class Sumofnumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number=");
		int  num = scan.nextInt();
		 int r=0, sum =0;
		 while(num>0) 
		 {
			 r =num%10;
			sum = sum+r; 
			num =num/10;
			
		 }
		 System.out.println("sum of  the digits="+ sum);
		 }
	}

