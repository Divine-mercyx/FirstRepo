public class TaskSixWhile {
	public static void main(String... args) {
		int number = 1;
		int countA = 1;
		int i = 1;
		int multiplesA = 1;
		int multiplesB = 1;
		while (number <= 10) {
			if (number % 4 == 0) {
				while (i <= 5 && number / 4 == 1) {
					multiplesA *= number;
					System.out.print(multiplesA + " ");
					i++;
				}
				
				while (countA <= 5 && number / 4 == 2) {
					multiplesB *= number;
					System.out.print(multiplesB + " ");
					countA++;
				}

			}
			number++;
		}
	}
}

