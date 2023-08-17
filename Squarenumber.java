import java.util.Scanner;

public class Squarenumber {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the number=");
		int num = scan.nextInt();
		int Squarenumber = squarenumber(num);
			System.out.println("the square of given number="+ Squarenumber);
			
				
			}
				static int  squarenumber(int num)
				{
					
					return num*num;
				}
			}
	
					
