public class TaskSeven {
	public static void main(String... args) {
		int multiples = 1;
		int multiplesB = 1;
		int sumA = 0;
		int sumB = 0;

		for (int number = 1; number <= 10; number++) {
			if (number % 4 == 0) {
				if (number == 4) {
					for (int i = 1; i <= 5; i++) {
						multiples *= number;
						sumA += multiples;
						//System.out.print(sumA + " ");
					}
						System.out.print(sumA + " ");


				} else {
					for (int a = 1; a <= 5; a++) {
						multiplesB *= number;
						sumB += multiplesB;
						//System.out.print(sumB + " ");
					}
						System.out.print(sumB + " ");

				}
			}
		}
	}
}