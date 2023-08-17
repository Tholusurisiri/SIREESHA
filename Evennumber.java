import java.util.Scanner;
public class Evennumber {

	public static void main(String[] args) {
		Scanner scan = new  Scanner(System.in);
		System.out.println("even from the range  1 to 100 = ");
		for(int i=1; i<=100;i++)
		if(i%2==0)
		
			System.out.println(i);
		
		scan.close();
		
	}

}
