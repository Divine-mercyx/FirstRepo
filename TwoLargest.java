import java.util.Scanner;

public class TwoLargest {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("enter a number: ");
		int number = input.nextInt();

		int largest = number;
		int secondLargest = 0;
		int counter = 1;

		while (counter < 10) {
			System.out.printf("%d enter a number: ", counter);
			number = input.nextInt();
			
			if (number > largest) {
				secondLargest = largest;
				largest = number;
			} else if (number > secondLargest) {
				secondLargest = number;
			}
			counter++;
			
		}

		System.out.printf("%d%n", largest);
		System.out.printf("%d%n", secondLargest);
	}
}