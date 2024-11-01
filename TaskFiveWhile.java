public class TaskFiveWhile {
	public static void main(String... args) {
		int number = 1;
		int countA = 1;
		int i = 1;
		while (number <= 10) {
			if (number % 4 == 0) {
				while (i <= 5 && number / 4 == 1) {
					System.out.print(number);
					i++;
				}
				System.out.print(" ");
				while (countA <= 5 && number / 4 == 2) {
					System.out.print(number);
					countA++;
				}

			}
			number++;
		}
	}
}

