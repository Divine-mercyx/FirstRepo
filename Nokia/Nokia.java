import java.util.Scanner;

public class Nokia {



	public static void nokia(int choice) {
		Scanner input = new Scanner(System.in);
		
		switch (choice) {
			case 1: 
				System.out.println("Phonebook\n\n1. Search\n2. Service Nos\n3. Add name\n4. Erase\n5. Edit\n6. Assign tone\n7. Send b'card\n8. Options\n9. Speed dials\n10. Voice tags");
				int phonebookChoice = input.nextInt();
				System.out.println();

				switch (phonebookChoice) {
					case 1: System.out.println("Search"); break;
					case 2: System.out.println("Service Nos"); break;
					case 3: System.out.println("Add name"); break;
					case 4: System.out.println("Erase"); break;
					case 5: System.out.println("Edit"); break;
					case 6: System.out.println("Assign tone"); break;
					case 7: System.out.println("Send b'card"); break;
					case 8: System.out.println("Options\n\n1. Type of view\n2. Memory status");
						int optionsChoice = input.nextInt();
						switch (optionsChoice) {
							case 1: System.out.println("Type of view"); break;
							case 2: System.out.println("Memory status"); break;
							default:
								System.out.println("invalid input");
						}
						break;
					default: 
						System.out.println("invalid input");
						break;
				}
				break;



			case 2:
				System.out.println("Messages\n\n1. Write messages\n2. Inbox\n3. Outbox\n4. Picture messages\n5. Templates\n6. Smileys\n7. Message settings\n8. Info Service\n9. Voice mail number\n10. Service command editor");
				int messagesChoice = input.nextInt();
				switch (messagesChoice) {
					case 1: System.out.println("Write messages"); break;
					case 2: System.out.println("Inbox"); break;
					case 3: System.out.println("Outbox"); break;
					case 4: System.out.println("Picture messages"); break;
					case 5: System.out.println("Templates"); break;
					case 6: System.out.println("Smileys"); break;
					case 7:
						System.out.println("Message settings\n\n1. Set 1\n2. Common");
						int messageSettingsChoice = input.nextInt();
						switch (messageSettingsChoice) {
							case 1: System.out.println("set 1\n\n1. Message centre Number\n2. Message sent as\n3. Message validity");
								int set1Choice = input.nextInt();
								switch (set1Choice) {
									case 1: System.out.println("Message centre number"); break;
									case 2: System.out.println("Message sent as"); break;
									case 3: System.out.println("Message Validity"); break;
									default: System.out.println("invalid input"); break;
								}
								break;
							case 2: System.out.println("Common\n\n1. Delivery reports\n2. Reply via same centre\n3. Character support");
								int commonChoice = input.nextInt();
								switch (commonChoice) {
									case 1: System.out.println("Delivery reports"); break;
									case 2: System.out.println("Reply via same centre"); break;
									case 3: System.out.println("Character support"); break;
		
								}
								break;
							default: System.out.println("invalid input");
						}
						break;
				}
				break;




			case 3:
				System.out.println("Chat");
				break;
			case 4:
				System.out.println("Call Register\n\n1. Missed call\n2. Recieved calls\n3. Dialled numbers\n4. Erase recent call list\n5. Show call duration\n6. Show call costs\n7. Call cost settings\n8. prepaid credit");
				int callRegisterChoice = input.nextInt();
				switch (callRegisterChoice) {
					case 1: System.out.println("Missed call"); break;
					case 2: System.out.println("Recieved calls"); break;
					case 3: System.out.println("Dialled numbers"); break;
					case 4: System.out.println("Erase recent call list"); break;
					case 5: System.out.println("Show call duration\n\n1. Last Call duration\n2. All calls duration\n3. Recieved calls' duration\n4. Dialled calls' duration\n5. Clear timers");
					int showChoice = input.nextInt();
					switch (showChoice) {
						case 1: System.out.println("Last call duration"); break;
						case 2: System.out.println("All calls duration"); break;
						case 3: System.out.println("Recieved calls' duration"); break;
						case 4: System.out.println("Dialled calls' duration"); break;
						case 5: System.out.println("Clear timers"); break;
						default: System.out.println("invalid input"); break;
					}



					break;
					case 6: System.out.println("Show call cost\n\n1. Last call cost\n2. All calls' cost\n3. Clear counters");
					int callChoice = input.nextInt();
					switch (callChoice) {
						case 1: System.out.println("Last call cost"); break;
						case 2: System.out.println("All calls' cost"); break;
						case 3: System.out.println("Clear counters"); break;
						default: System.out.println("invalid input"); break;
					}


					break;
					case 7: System.out.println("Call cost settings\n\n1. Call cost limit\n2. Show costs in");
					int costChoice = input.nextInt();
					switch (costChoice) {
						case 1: System.out.println("call cost limit"); break;
						case 2: System.out.println("Show costs in"); break;
						default: System.out.println("invalid input"); break;
					}
					break;
					case 8: System.out.println("Prepaid credit");
					break;
					default: System.out.println("invalid input");
				}
				break;
			case 5:
				System.out.println("Tones\n\n1. Ringing tone\n2. Ringing volume\n3. Incoming call alert\n4. Composer\n5. Message alert tone\n6. Keypad tones\n7. Warning and game tones\n8. Vibrating alert\n9. Screen saver");
				int callChoice = input.nextInt();
				switch (callChoice) {
					case 1: System.out.println("Ringing tone"); break;
					case 2: System.out.println("Ringing volume"); break;
					case 3: System.out.println("Incoming call alert"); break;
					case 4: System.out.println("Composer"); break;
					case 5: System.out.println("Message alert tone"); break;
					case 6: System.out.println("Keypad tones"); break;
					case 7: System.out.println("Warning and game tones"); break;
					case 8: System.out.println("Vibrating alert"); break;
					case 9: System.out.println("Screen saver"); break;
					default: System.out.println("invalid input"); break;
				}
				break;
			case 6:
				System.out.println("Settings\n\n1. Call settings\n2. Phone settings\n3. Security settings\n4. Restore factory settings");
				int settingsChoice = input.nextInt();
				switch (settingsChoice) {
					case 1: System.out.println("Call settings\n\n1. Automatic redial\n2. Speed dialling\n3. Call waiting options\n4. Own number sending\n5. Phone line in use\n6. Automatic answer");
						int callSystem = input.nextInt();
						switch (callSystem) {
							case 1: System.out.println("Automatic redial"); break;
							case 2: System.out.println("Speed dialling"); break;
							case 3: System.out.println("Call waiting options"); break;
							case 4: System.out.println("Own number sending"); break;
							case 5: System.out.println("Phone line in use"); break;
							case 6: System.out.println("Automatic answer"); break;
							default: System.out.println("invalid input"); break;
						}
						break;
					case 2: System.out.println("Phone settings\n\n1. Language\n2. Cell info display\n3. Welcome note\n4. Network selection\n5. Lights\n6. Confirm SIM service actions");
						int phoneChoice = input.nextInt();
						switch (phoneChoice) {
							case 1: System.out.println("Language"); break;
							case 2: System.out.println("Cell info display"); break;
							case 3: System.out.println("Welcome note"); break;
							case 4: System.out.println("Network selection"); break;
							case 5: System.out.println("Lights"); break;
							case 6: System.out.println("Confirm SIM service actions"); break;
							default: System.out.println("invalid input"); break;
						}
						break;
					case 3: System.out.println("Security settings\n\n1. PIN code request\n2. Call barring service\n3. Closed user group\n4. Phone security\n5. Change access codes");
						int securityChoice = input.nextInt();
						switch (securityChoice) {
							case 1: System.out.println("PIN code request"); break;
							case 2: System.out.println("call barring service closed user group"); break;
							case 3: System.out.println("closed user group"); break;
							case 4: System.out.println("Phone security"); break;
							case 5: System.out.println("Change access codes"); break;
							default: System.out.println("invalid input"); break;
						}
						break;
					case 4: System.out.println("Restore factory settings");
						break;
					default: System.out.println("invalid input");
				}
				break;
			case 7:
				System.out.println("Call divert");
				break;
			case 8:
				System.out.println("Games");
				break;
			case 9:
				System.out.println("Calculator");
				break;
			case 10:
				System.out.println("Reminders");
				break;
			case 11:
				System.out.println("Clock\n\n1. Alarm clock\n2. Clock settings\n3. Date setting\n4. Stop watch\n5. Countdown timer\n6. Auto update of date and time");
				int clockChoice = input.nextInt();
				switch (clockChoice) {
					case 1: System.out.println("Alarm clock"); break;
					case 2: System.out.println("Clock settings"); break;
					case 3: System.out.println("Date setting"); break;
					case 4: System.out.println("Stop watch"); break;
					case 5: System.out.println("Countdown timer"); break;
					case 6: System.out.println("Auto update of date and time"); break;
					default: System.out.println("invalid input"); break;
				}
				break;
			case 12:
				System.out.println("Profiles");
				break;
			case 13:
				System.out.println("Sim services");
				break;
			default:
				System.out.println("invalid choice");
				break;
		}	
	}
}
