import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the temperature fahrenheit");
		int fahrenheit= scan.nextInt();
		int celsius= temperatureInFahrenheit(fahrenheit);
		System.out.println("celsius temperature = "+celsius);
	}

	private static int temperatureInFahrenheit(int fahrenheit) {

		return (( fahrenheit-32)*5)/9;
	}
}
