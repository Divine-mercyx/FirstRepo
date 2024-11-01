import java.util.Scanner;

public class Greet {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 1;
		while (count<= 5) {
		System.out.println("""

		1. English
		2. Yoruba
		3. Igbo
		""");
		int choice = input.nextInt();
		greeting(choice);
			count++;
		}
		
	}

	public static void greeting(int choice) {

		Scanner input = new Scanner(System.in);

		switch (choice) {
			case 1: System.out.println("1. morning\n2. Afternoon\n3. Evening");
			int englishChoice = input.nextInt();
			switch (englishChoice) {
				case 1: System.out.println("hello there, good morning"); break;
				case 2: System.out.println("hello there, good afternoon"); break;
				case 3: System.out.println("hello there, good evening"); break;
				default: System.out.println("invalid input"); break;
			}
			break;
			case 2: System.out.println("1. morning\n2. Afternoon\n3. Evening");
			int yorubaChoice = input.nextInt();
			switch (yorubaChoice) {
				case 1: System.out.println("e kaa ro"); break;
				case 2: System.out.println("e ka san"); break;
				case 3: System.out.println("e kaa le"); break;
				default: System.out.println("invalid input"); break;
			}
			break;
			case 3: System.out.println("1. morning\n2. Afternoon\n3. Evening");
			int igboChoice = input.nextInt();
			switch (igboChoice) {
				case 1: System.out.println("otutu oma"); break;
				case 2: System.out.println("eli lie oma"); break;
				case 3: System.out.println("igbe de"); break;
				default: System.out.println("invalid input");
			}
			break;
			default: System.out.println("invalid input"); break;
		}
	}
}