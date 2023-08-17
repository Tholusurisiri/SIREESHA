package Vibgyor;
import java.util.Scanner;

public class Ptr {

	public static void main(String[] args) {
		Scanner  scan = new Scanner(System.in);
		System.out.println("enter the principle=");
		double principle = scan.nextInt();
		System.out.println("enter the rate=");
		double rate = scan.nextInt();
		System.out.println("enter the time=");
		double time = scan.nextInt();
		simpleInterest(principle,rate,time);
	}

	 static double simpleInterest(double principle, double rate, double time) 
	 {
		 return ((principle*rate*time)/100);
	}

}
