import java.util.Scanner;

public class Even {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		System.out.println("enter below zero to terminate");
		while (true) {
			System.out.print("enter a number: ");
			int number = input.nextInt();
			if (number > 0) {
				if (number % 2 == 0) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}
			} else {
				System.out.print("\nyou've exited");
				break;
			}
		}
	}
}