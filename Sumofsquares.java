import java.util.Scanner;

public class Sumofsquares {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int square = sumofsquare(num);
		System.out.println(square+" sum of the square");
		scan.close();
	}

	private static int sumofsquare(int num) {
		int sum =0;
		for(int i=1; i<=num;i++)
		{
			sum =sum+i*i;
		}
		return sum;
	}

}
