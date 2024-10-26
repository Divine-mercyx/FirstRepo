import java.util.Scanner;

public class InputType {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		System.out.print("enter alphabets/numeric value: ");
		String value = input.nextLine();

		String result = valueChecker(value);
		System.out.println(result);
		
	}

	public static String valueChecker(String value) {
		if (value.matches("\\d+")) {
			return "it is a numerical value";
		} else if (value.matches("[a-zA-Z]+")) {
			return "it is a alphabetical value";
		} else {
			return "it is a mix of characters";
		}
	}
}