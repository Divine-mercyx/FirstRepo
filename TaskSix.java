public class TaskSix {
	public static void main(String... args) {
		int multiples = 1;
		int multiplesB = 1;
		for (int number = 1; number <= 10; number++) {
			if (number % 4 == 0) {
				if (number == 4) {
					for (int i = 1; i <= 5; i++) {
						multiples *= number;
						System.out.print(multiples + " ");
					}
				}


				else {
					for (int a = 1; a <= 5; a++) {
						multiplesB *= number;
						System.out.print(multiplesB + " ");
					}
				}
			}
		}
	}
}