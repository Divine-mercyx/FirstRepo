import java.util.Scanner;

public class BinaryTest {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		System.out.print("enter a number: ");
		int number = input.nextInt();
		System.out.println(BinaryConvertedNumberMethod.convertDecimalToBinary(number));
	}
}