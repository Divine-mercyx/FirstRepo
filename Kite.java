public class Kite {
	public static void main(String... args) {
		char letter = 'a';

		for (int a = 1; a <= 6; a++) {
			for (int b = 1; b <= 6 -a; b++) {
				System.out.print(" ");
			}
			System.out.print(letter + "\n");
			for (int c = 7; c <= 7 - a; c++) {
				System.out.print(" ");
			}
		}

		for (int d = 1; d <= 14; d++) {
			System.out.print(letter++);
		}

		for (int a = 6; a >= 1; a--) {
			for (int b = 1; b <= 7 - a; b++) {
				System.out.print(" ");
			}
			System.out.print(letter + "\n");
		}
	}
}