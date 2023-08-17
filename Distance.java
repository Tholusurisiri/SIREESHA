import java .util.Scanner;

public class Distance {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the speed=");
		double  a = scan.nextDouble();
		System.out.println("enter the time=");
		double  b = scan.nextDouble();
		double  distance = calculatedistance(a,b);
		{
			
		
			System.out.println("  Distance=" + distance);
		}
	}
	
					
			 static double calculatedistance(double a , double  b)
			{
				
					
					return  a * b;
			}
}
			
