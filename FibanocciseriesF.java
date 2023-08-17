import java.util.Scanner;
public class Fibanocciseries {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" enter the number");
		int n = scan.nextInt();
		int firstNumber = 0, secondNumber=1;
		int nextNumber;
		System.out.println(firstNumber+" "+secondNumber+" ");
		for(int i=3;i<=n;i++)
		{
			nextNumber = firstNumber+secondNumber;
			System.out.println(nextNumber+" ");
			firstNumber = secondNumber;
			secondNumber= nextNumber;
			
			
		}
	}

}
