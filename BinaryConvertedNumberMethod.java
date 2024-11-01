import java.util.Scanner;

public class BinaryConvertedNumberMethod {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		System.out.print("enter a binary number to change to number: ");
		int binaryOne = input.nextInt();

		System.out.println(convertBinaryToDecimal(binaryOne));

		System.out.print("enter a number to convert to binary: ");
		int binaryTwo = input.nextInt();

		System.out.println(convertDecimalToBinary(binaryTwo));
	}
	
	public static int convertBinaryToDecimal(int binary) {
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

		return decimalNumber;
	}

	public static String convertDecimalToBinary(int number) {
		int count = 1;
		int number1 = 0;
		int remainder = 0;
		String binaryConvert = "";

		while (count <= number) {
			number1 = number % 2;
			binaryConvert = number1 + binaryConvert;
			number = number / 2;
			
		}
		return binaryConvert;
		
	}

}