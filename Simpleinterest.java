import java.util.Scanner;
{


public class import java.util.Scanner;
{

public class Simpleinterest {

	

	public static void main(String[] args) {
		Scanner  scan = new Scanner(System.in);
		System.out.println("enter the principle=");
		double principle = scan.nextInt();
		System.out.println("enter the rate=");
		double rate = scan.nextInt();
		System.out.println("enter the time=");
		double time = scan.nextInt();
	double simpleInterest =  simpleInterest( principle,rate,time);
	System.out.println("simpleInterest="+simpleInterest);
	scan.close();
	}
	
	 static double simpleInterest(double principle, double rate, double time) 
	 {
		 return ((principle*rate*time)/100);
	}

}
 {

	

	public static void main(String[] args) {
		Scanner  scan = new Scanner(System.in);
		System.out.println("enter the principle=");
		double principle = scan.nextInt();
		System.out.println("enter the rate=");
		double rate = scan.nextInt();
		System.out.println("enter the time=");
		double time = scan.nextInt();
	double simpleInterest =  simpleInterest( principle,rate,time);
	System.out.println("simpleInterest="+simpleInterest);
	scan.close();
	}
	
	 static double simpleInterest(double principle, double rate, double time) 
	 {
		 return ((principle*rate*time)/100);
	}

}
