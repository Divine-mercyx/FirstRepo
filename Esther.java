import java.util.Scanner;

public class Esther {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int counter = 1;
		int sum = 0;

		while (counter <= 10) {
			System.out.print("enter a grade: ");
			int grade = input.nextInt();

			sum += grade;
			counter++;
		}

		int average = sum / 10;
		System.out.println(average);
	}
}