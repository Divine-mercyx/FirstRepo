import java.util.Scanner;

public class TimeApp {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("enter seconds in the day to get the time: ");
		int bigSeconds = input.nextInt();
		setTime(bigSeconds);
	
	}	

	public static void setTime(int bigSeconds) {
		int hour = 0;
		int remainingHours = 0;
		int minutes = 0;
		int seconds = 0;

		if (bigSeconds > 0 && bigSeconds <= 86400) {
			hour = bigSeconds / 3600;
			remainingHours = bigSeconds % 3600;
			minutes = remainingHours / 60;
			seconds = remainingHours % 60;
		
			System.out.printf("\n%d:%d:%d", hour, minutes, seconds);
		} else {
			System.out.println("invalid seconds of the day: " + bigSeconds + ", limit is 86400");
			bigSeconds = 86400;
			hour = bigSeconds / 3600;
			remainingHours = bigSeconds % 3600;
			minutes = remainingHours / 60;
			seconds = remainingHours % 60;
		
			System.out.printf("\n%d:%d:%d", hour, minutes, seconds);
		}
	}
}