import java.util.Scanner;

public class Library {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		System.out.print("enter the number of days: ");
		int days = input.nextInt();

		if (days > 0) { 
			if (days >= 1 && days <= 5) {
				System.out.println("the fine is 50 paise");
			} 
			else if (days >=6 && days <= 10) {
				System.out.println("the fine is 1 rupee");
			}
			else if (days >= 10) {
				System.out.println("the fine is 5 rupees");
			}
			else if (days > 30) {
				System.out.println("membership cancelled");
			}
		} else {
			System.out.println("error");
		}
	}
}