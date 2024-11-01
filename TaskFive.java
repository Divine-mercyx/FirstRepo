public class TaskFive {
	public static void main(String... args) {
		for (int number = 1; number <= 10; number++) {
			if (number % 4 == 0) {
				for (int i = 1; i <= 5; i++) {
					System.out.print(number); 
				}
				System.out.print(" ");
			}
		}
	}
}