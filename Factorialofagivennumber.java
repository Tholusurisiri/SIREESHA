package com.kn.forloop;
import java.util.Scanner;

public class Factorialofagivennumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the factorial number");
		int num = scan.nextInt();
		int factorial=calculatefactorial(num);
		System.out.println("the factorial"+num+" "+factorial);
	}

	private static int calculatefactorial(int num) {
		int factorial = 1;
	
		for(int i=1; i<= num; i++)
		{
		factorial*=i;
		}
	return factorial;
		
		
		
		
	}



}




