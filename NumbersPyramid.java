public class NumbersPyramid {
	public static void main(String... args) {
		String letter = "";

		for (int a = 1; a <= 7; a++) {
			for (int b = 1; b <= 7 - a; b++) {
				System.out.print(" ");
			}
			System.out.print(a + "\n");
		}
		for (int a = 6; a >= 1; a--) {
			for (int b = 1; b <= 7 - a; b++) {
				System.out.print(" ");
			}
			System.out.print(a + "\n");
		}
	}
}