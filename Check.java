import java.util.Scanner;

public class Check {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		System.out.print("enter a number: ");
		int number = input.nextInt();

		if (number > 0) {
			System.out.println("number is positive");
		} else if (number < 0) {
			System.out.println("number is negative");
		} else {
			System.out.println("the number is neutral");
		}
	}
}