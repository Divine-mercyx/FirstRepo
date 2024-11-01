import java.util.Scanner;

public class Guess {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		int guess = (int) (Math.random() * 10);

		System.out.print("enter a number: ");
		int choice = input.nextInt();
		if (choice > 0 && choice <= 100) {
			if (choice > guess) {
				System.out.println("too high!");
			} else if (choice < guess) {
				System.out.println("too low!");
			} else if (choice == guess) {
				System.out.println("you guessed correct");
			}
		} else {
			System.out.println("out of range");
		}
	}
}    