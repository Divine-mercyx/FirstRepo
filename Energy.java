import java.util.Scanner;

public class Energy {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		System.out.print("enter the amount of water of water in kilograms: ");
		double waterWeight = input.nextDouble();
		System.out.print("enter the initial temperature: ");
		double initialTemperature = input.nextDouble();
		System.out.print("enter the final temperature: ");
		double finalTemperature = input.nextDouble();

		double energy = waterWeight * (finalTemperature - initialTemperature) * 4184;
		System.out.printf("the energy needed is: %.2f", energy);
	}
}