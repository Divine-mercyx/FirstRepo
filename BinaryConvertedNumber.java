import java.util.Scanner;

public class BinaryConvertedNumber {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		System.out.print("enter a binary number: ");
		int binary = input.nextInt();
		int count = 1;
		int power = 1;
		int number1 = 0;
		int decimalNumber = 0;

		while (count <= binary) {
			number1 = binary % 10;
			decimalNumber += number1 * power;
			power *= 2;
			binary = binary / 10;
		}

		System.out.println(decimalNumber);
	}
}