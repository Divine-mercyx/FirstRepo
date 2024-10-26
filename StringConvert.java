import java.util.Scanner;

public class StringConvert {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		System.out.print("enter a number(string): ");
		String numberOne = input.nextLine();

		int number = Integer.valueOf(numberOne);
		System.out.println(number);
	}
}