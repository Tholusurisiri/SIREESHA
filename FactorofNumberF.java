import java.util.Scanner;
public class FactorofNumber {

	public static void main(String[] args) {
		Scanner scan = new  Scanner(System.in);
		System.out.println("enter the number");
		int num = scan.nextInt();
		for(int i=1; i<=num; i++)
		{
			if(num%i==0)
			{
			System.out.println(i);
		}
		scan.close();	

	}

}
}

