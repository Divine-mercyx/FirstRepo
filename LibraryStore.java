import java.util.Scanner;

public class LibraryStore {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		int days = 0;
		System.out.println("enter -1 to quit anytime");

		while (days != -1) {
			System.out.print("enter the number of days: ");
			days = input.nextInt();

			if (days > 0) { 
				if (days >= 1 && days <= 5) {
					System.out.println("the fine is 50 paise");
				} 
				else if (days >=6 && days <= 10) {
					System.out.println("the fine is 1 rupee");
				}
				else if (days >= 10 && days <= 30) {
					System.out.println("the fine is 5 rupees");
				}
				else if (days > 30) {
					System.out.println("membership cancelled");
				}
			}
			else if (days == -1) {
				System.out.println("you've exited");
			} 
			else {
				System.out.println("error");
			}
		}
	}
}