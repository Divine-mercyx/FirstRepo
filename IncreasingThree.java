import java.util.Scanner;

public class IncreasingThree {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);
		int choice = 0;


		while (choice != -1) {
			System.out.print("\nenter first number: ");
			int first = input.nextInt();
			System.out.print("\nenter second number: ");
			int second = input.nextInt();
			System.out.print("\nenter the third number: ");
			int third = input.nextInt();

			if (first > second && second > third) {
				System.out.printf("%d < %d < %d", third, second, first);
			}		
			else if (second > first && first > third) {
				System.out.printf("%d < %d < %d", third, first, second);
			} 
			else if (third > second && second > first) {
				System.out.printf("%d < %d < %d", first, second, third);
			} 
			else if (first > third && third > second) {
				System.out.printf("%d < %d < %d", second, third, first);
			}
			else if (second > third && third > first) {
				System.out.printf("%d < %d < %d", first, third, second);
			}
			else if (third > first && first > second) {
				System.out.printf("%d < %d < %d", second, first, third);
			}
			System.out.print("\nenter -1 to quit: ");
			choice = input.nextInt();


		}
	}
}