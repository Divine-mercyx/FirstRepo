import java.util.Scanner;

public class DivideSum {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		System.out.println("sum is " + addingDivision(num));
	}

	public static int addingDivision(int number) {
		int sum = 0;

		while (number > 9) {
			sum += (number % 10);
			number = number / 10;
		}

		sum += number;
		return sum;

		
	}
}