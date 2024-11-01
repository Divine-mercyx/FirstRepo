public class TaskSevenWhile {
	public static void main(String... args) {
		int number = 1;
		int countA = 1;
		int i = 1;
		int multiplesA = 1;
		int multiplesB = 1;
		int sumA = 0;
		int sumB = 0;
		int overall = 0;
		while (number <= 10) {
			if (number % 4 == 0) {
				while (i <= 5 && number / 4 == 1) {
					multiplesA *= number;
					sumA += multiplesA;
					
					i++;
				}				
				while (countA <= 5 && number / 4 == 2) {
					multiplesB *= number;
					sumB += multiplesB;
					
					countA++;
				}

			}

			number++;

		}
		System.out.print(sumA + " ");
		System.out.print(sumB + " ");

	}
}

