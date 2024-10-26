import java.util.Scanner;

public class Pound {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		System.out.print("enter a number in pounds: ");
		double pounds = input.nextDouble();

		double kilogram = pounds * 0.454;
		System.out.printf("%.1f pounds is %.3f kilograms", pounds, kilogram);
	}
}