import java.util.Scanner;

public class Secretmessagedouble {

	public static void main(String[] args) {
		Scanner  scan = new Scanner(System.in);
		System.out.print("enter the character=");
		char c = scan.next().charAt(0);
		int message = character(c);
		System.out.print(" charactert= "+message);
		
	}
static int character(int c)
{
	return c;
}
}
