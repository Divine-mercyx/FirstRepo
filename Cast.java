import java.util.Scanner;

public class Cast {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("enter a number: ");
		int number = input.nextInt();
		
		int counter = 1;
		int largest = 0;
		int smallest = number;

		while (counter < 5) {
			System.out.print("enter a number: ");
			number = input.nextInt();

			if (number > largest) {
				largest = number;
			}

			else if (number < smallest) {
				smallest = number;
			}
			counter++;
		}

		System.out.printf("largest: %d%nsmallest: %d", largest, smallest);
		
	}
}
