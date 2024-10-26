import java.util.Scanner;

public class ValueRange {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		System.out.print("enter the start number: ");
		int start = input.nextInt();

		System.out.print("enter the stop number: ");
		int stop = input.nextInt();

		System.out.print("enter the divisor: ");
		int divisor = input.nextInt();

		int count = 0;

		for (int i = start; i < stop; i++) {
			if (i % 3 == 0) {
				count += 1;
			}
		}
		System.out.println(count);
	}
}