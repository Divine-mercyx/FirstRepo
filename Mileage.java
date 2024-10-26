import java.util.Scanner;

public class Mileage {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int counter = 1;
		double milesPerGallon = 0;
		double combinedMilesPerGallon = 0;
		System.out.print("enter the number of trips: ");
		int tripsNumber = input.nextInt();

		String pluralSingular = (tripsNumber > 1) ? "trips" : "trip";
		
		while (counter <= tripsNumber) {
			System.out.print("enter miles driven: ");
			double milesDriven = input.nextDouble();
			System.out.print("enter galon used: ");
			int gallonNumbers = input.nextInt();
			milesPerGallon = milesDriven / gallonNumbers;
			System.out.printf("trip: %.2f MPG%n", milesPerGallon);
			combinedMilesPerGallon += milesPerGallon;
			counter++;
		}

		System.out.printf("the combined MPG for %d %s is %.2f%n", tripsNumber, pluralSingular, combinedMilesPerGallon);

	}
}