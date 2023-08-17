import java.util.Scanner;

public class Largestthreeternaryoperator {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int  num1 = scan.nextInt();
	    System.out.println("enter the first number=");
	    int  num2 = scan.nextInt();
	    System.out.println("enter the second number=");
	    int  num3 = scan.nextInt();
	    System.out.println("enter the third number=");
	   /// int largest= (num1 > num2)?((num1>num3)? num1:num3):((num2>num3)? num2 :num3);
	    int smallest= (num1 < num2)?((num1<num3)? num1:num3):((num2<num3)? num2 :num3);
	    
	   // System.out.println("largestnumber="+largest);
	    
	
	    
		System.out.println("smallestnumber ="+ smallest);
	}
	


}


