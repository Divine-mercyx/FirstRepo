import java.util.Scanner;

public class RightMost {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		System.out.print("enter three integers: ");
		int numberOne = input.nextInt();
		int numberTwo = input.nextInt();
		int numberThree = input.nextInt();

		int resultOne = numberOne % 10;

		int resultTwo = numberTwo % 10;

		int resultThree = numberThree % 10;

		if (resultOne == resultTwo || resultOne == resultThree) {
			System.out.println("the result is: true");					
		} 
		else if (resultTwo == resultOne || resultTwo == resultThree) {
			System.out.println("the result is: true");					
		}
		else if (resultThree == resultTwo || resultThree == resultOne) {
			System.out.println("the result is: true");					
		} else {
			System.out.println("the result is: false");
		}
	}
}