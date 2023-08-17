mport java.util.Scanner;
public class Largest3numbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//int  num1 = scan.nextInt();
		//System.out.println("enter the first number=");
		//int  num2 = scan.nextInt();
		//System.out.println("enter the second number=");
		
		//int  num3 = scan.nextInt();
		////System.out.println("enter the third number=");
		///////int largest= num1;
		//if(num2>largest)
		//{
			//largest=2;
		//}
		//if(num3>largest)
		//{
			//largest=3;
			
		//}
		//System.out.println("largestnumber="+largest);
	//}

//}
int a =scan.nextInt();
int b =scan.nextInt();
int c  =scan.nextInt();
if(a>=b && b<=c)//if(a<=b && b<=c)
{
	System.out.println("a=  "+a+ "+largest");
}
if(b>=a && c<=b)
{
	System.out.println("b=  "+a+ " largest");
}

if(c>=a  && c<=b)
{
	System.out.println("c=+ "+a+ " is largest");
	}

	}
}





