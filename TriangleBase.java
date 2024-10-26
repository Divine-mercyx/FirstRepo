import java.util.Scanner;

public class TriangleBase {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		System.out.print("enter length of triangle base: ");
		int base = input.nextInt();

		for (int i = 1; base <= 10 && i <= base; i++) {
			for (int x = 1; x <= i; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}