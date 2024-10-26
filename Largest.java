import java.util.Scanner;

public class LargestUnit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int counter = 1;
		double largest = 0;
		

		while (counter <= 3) {
			System.out.printf("%d. enter number: ", counter);
			double number = input.nextDouble();
			if (number > largest) {
				largest = number;
			}
			
			counter++;
		}
		System.out.printf("the largest unit sold: %.0f", largest);
	}
}