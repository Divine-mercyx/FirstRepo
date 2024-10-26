import java.util.Scanner;

public class LargestUnit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int counter = 1;
		double largest = 0;
		double secondLargest = 0;

		while (counter <= 10) {
			System.out.printf("%d. enter number of units sold: ", counter);
			double number = input.nextDouble();
			if (number > largest) {
				largest = number;
			}
			//else if (number ) {}
			counter++;
		}
		System.out.printf("the largest unit sold: %.0f", largest);
	}
}