import java.util.Scanner;

public class Clock {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		System.out.print("enter a positive number: ");
		int secondsEntered = input.nextInt();

		int hour = secondsEntered / 3600;
		int remainingSec = secondsEntered % 3600;
		int minutes = remainingSec / 60;
		int seconds = remainingSec % 60;

		System.out.printf("%d:%d:%d%n", hour, minutes, seconds);
	}
}