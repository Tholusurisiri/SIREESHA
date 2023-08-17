import java.util.Scanner;
public class Swap2onlyvariables {

	public static void main(String[] args) {
		int  a= 20;
		int  b= 10;
		System.out.println(" After swapping");
		System.out.println("a= "+a);
	    System.out.println("b ="+b);
	    System.out.println("before swapping");
		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println("a= "+a);
		System.out.println("b ="+b);
}
}