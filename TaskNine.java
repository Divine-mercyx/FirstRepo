public class TaskNine {
	public static void main(String... args) {
		int multiples = 1;
		int multiplesB = 1;
		int sumA = 0;
		int sumB = 0;
		int overallSum = 0;
		int squareAB = 0;
		for (int number = 1; number <= 10; number++) {
			if (number % 4 == 0) {
				if (number == 4) {
					for (int i = 1; i <= 5; i++) {
						multiples *= number;
						sumA += multiples;
					}
					


				} else {
					for (int a = 1; a <= 5; a++) {
						multiplesB *= 8;
						sumB += multiplesB;
					}
				

				}

			}
		}
		overallSum = sumA + sumB;
		squareAB = overallSum * overallSum;
		System.out.println(squareAB);
	}
}