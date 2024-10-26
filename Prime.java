public class Prime {
	public static void main(String... args) {
		int count = 0;
		for (int i = 2; count < 3 && i <= 50; i++) {
			if (isPrime(i)) {
				System.out.println("number " + i + " is a prime number");
				count++;
			}
		}
	}

	public static boolean isPrime(int wholeNumber) {
		if (wholeNumber <= 2) {
			return (wholeNumber == 2);
		}

		for (int count = 2; count < wholeNumber; count++) {
			if (wholeNumber % 2 == 0) {
				return false;
			}
		}
		return true;
	}
}