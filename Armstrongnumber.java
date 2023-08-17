import  java.util.Scanner;

public class Armstrongnumber {

	public static void main(String[] args) {
		Scanner scan = new  Scanner(System.in);
		int num = scan.nextInt();
		int Armstrong = printArmstrong(num);
		if(Armstrong==num)
		{
			System.out.println(num+" is a armstrong number");
		}
		else
		{
			System.out.println(num+" is a  not armstrong number");
		}	
		}
		

	private static int printArmstrong(int num) {
		int r=0,sum=0;
		for(int i=1;num!=0;i++)
		{
			r=num%10;
			System.out.println(r);
			num =num/10;
		}
				return r;
	}

}
