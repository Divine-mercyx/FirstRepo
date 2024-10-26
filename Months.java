import java.util.Scanner;

public class Months {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		System.out.print("input a month number: ");
		int count = input.nextInt();

		System.out.print("input a year: ");
		int yearNumber = input.nextInt();

		
			if (count > 0 && count < 12) {
		
			if (count == 1) {
				System.out.printf("january %d has 31 days", yearNumber);
			}

			else if (count == 2) {
				if (yearNumber % 4 == 0) {
					System.out.printf("febuary %d has 28 days in a year", yearNumber);	
				} else {
					System.out.printf("febuary %d has 29 days in a leap year", yearNumber);
				}
			}

			else if (count == 3) {
				System.out.printf("march %d has 31 days", yearNumber);
			}

			else if (count == 4) {
				System.out.printf("april %d has 30 days", yearNumber);
			}

			else if (count == 5) {
				System.out.printf("may %d has 31 days", yearNumber);
			}

			else if (count == 6) {
				System.out.printf("june %d has 30 days", yearNumber);
			}

			if (count == 7) {
				System.out.printf("july %d has 31 days", yearNumber);
			}

			else if (count == 8) {
				System.out.printf("august %d has 31 days", yearNumber);
			}

			else if (count == 9) {
				System.out.printf("september %d has 30 days", yearNumber);
			}

			else if (count == 10) {
				System.out.printf("october %d has 31 days", yearNumber);
			}

			else if (count == 11) {
				System.out.printf("november %d has 31 days", yearNumber);
			}

			else if (count == 12) {
				System.out.printf("december %d has 31 days", yearNumber);
			}
			}

			else {
				System.out.println("\nout of range of months");
			}
	}
}