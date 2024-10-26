import java.util.Scanner;

public class Positive {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter number or -1 to exit");
		int number = input.nextInt();
		checkNumber(number);

	}

	public static void checkNumber(int number) {
		if (number > 0) {
			System.out.println("number is a positive number");
		} else if (number < 0) {
			System.out.println("number is a negative number");
		} else {
			System.out.println("number is zero");
		}
	}
}