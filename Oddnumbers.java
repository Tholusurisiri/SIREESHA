import java.util.Scanner;
public class Oddnumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("odd number ");
		
		for( int i=1; i<=100;i++)
			if(i%2!=0) {
				System.out.println(i);
			}
scan.close();
	}

}
