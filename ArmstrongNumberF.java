import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 153;
		int r,sum=0,temp=num;
		{
			while(num!=0)
			{
				r=num%10;
				r=r*r*r;
				sum=sum+r;
				num =num/10;
			}
			if(temp==sum)
			{
				System.out.println(sum+" is a armstrong number");
			}
			else
			{
				System.out.println(sum+" is not  a armstrong number");
			}
			}
		}
		
	}

