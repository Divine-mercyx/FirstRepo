import java.util.Scanner;

public class BMI {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		System.out.print("enter weight in pounds: ");
		double weight = input.nextDouble();
		System.out.print("enter height in inches: ");
		double height = input.nextDouble();

		double weightKilo = weight * 0.45359237;
		double heightMeters = height * 0.0254;

		double bmi = weightKilo / (heightMeters * heightMeters);
		System.out.printf("BMI is %.4f", bmi);
	}
}