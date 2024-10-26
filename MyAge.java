import java.util.Scanner;

public class MyAge {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		System.out.print("enter your birth year to get your age: ");
		int birthYear = input.nextInt();
		int myAge = calculateAge(birthYear);
		System.out.printf("you are %d years old", myAge);
	}

	public static int calculateAge(int birthYear) {
		return (2024 - birthYear);
	}
}