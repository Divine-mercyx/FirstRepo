public class Test {
	public static void main(String... args) {
		
		for (int counter = 1; counter <= 10; counter++) {
			for (int space = 1; space <= 10 - counter; space++) {
				System.out.print(" ");
			}
			for (int count = 1; count <= counter; count++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}