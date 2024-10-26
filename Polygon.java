import java.util.Scanner;

public class Version {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		System.out.print("input the number of sides on the polygon: ");
		int sides = input.nextInt();
		System.out.print("input the length of one of the sides: ");
		int length = input.nextInt();

		double area = (Math.pow((sides * length), 2)) / (4 * Math.tan(3.14/sides));
		System.out.println(area);
	}
}