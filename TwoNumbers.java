import java.util.Scanner;

public class TwoNumbers {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		System.out.println("enter two numbers: ");
		int first = input.nextInt();
		int second = input.nextInt();

		System.out.println(first > second ? "Greater" : "");
	
		System.out.println("you are doing well");

		int sum = first + second;

		System.out.println(sum > 50 ? "even sum is greater" : "");

		
	}
}