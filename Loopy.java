import java.util.Scanner;

public class Loopy {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);
		int count = 1;

		while (count <= 1) {

			System.out.print("enter a number: ");
			int number = input.nextInt();
			if (number % 2 == 0) {
				System.out.println("number is even");
			} else {
				System.out.println("number is odd");
			}
			count++;
		}
	}
}