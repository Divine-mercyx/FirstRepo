import java.util.Scanner;

public class Airplane {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		System.out.print("enter the airplane'stake off speed: ");
		double speed = input.nextDouble();
		System.out.print("enter the airplane's acceleration: ");
		double acceleration = input.nextDouble();

		double length = (Math.pow(speed, 2)) / (2 * acceleration);
		System.out.printf("the minimum run away length: %.3f", length);
	}
}