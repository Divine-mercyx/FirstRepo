public class TwoNumbers {
	public static void main(String.. . args) {

		System.out.println("enter two numbers: ");
		int first = input.nextInt();
		int second = input.nextInt();
		if (first > second) {
			System.out.println("Greater");
		}
		int sum = first + second;
		if (sum > 50) {
			System.out.println("even sum is greater");
		}
	}
}