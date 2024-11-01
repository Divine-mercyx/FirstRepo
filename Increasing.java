import java.util.Scanner;

public class Increasing {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		
		System.out.print("enter first number: ");
		int first = input.nextInt();
		System.out.print("enter second number: ");
		int second = input.nextInt();
		System.out.print("enter the third number: ");
		int third = input.nextInt();

		int minimum = Math.min(Math.min(first, second), third);
		
		System.out.println(minimum);
		
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



	}
}