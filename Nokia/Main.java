import java.util.Scanner;

public class Main {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		System.out.println("""
		Welcome to Nokia
		1. Phonebook
		2. Messages
		3. Chat
		4. Call register
		5. Tones
		6. Settings
		7. Call divert\n8. Games
		9. Calculator
		10. Reminders
		11. Clock
		12. Profiles
		13. SIM services
		""");
		int choice = input.nextInt();
		Nokia.nokia(choice);
		
	}
}