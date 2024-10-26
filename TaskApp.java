import java.util.Scanner;

public class TaskApp {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		System.out.print("welcome to divine's task app\nenter -1 to quit or enter the number of task you'll be storing: ");
		int taskAmount = input.nextInt();

		if (taskAmount == -1 || taskAmount < -1) {
			System.out.println("you've exited the program");
			input.close();
			return;
		}

		String newLine = input.nextLine();
		String[] tasks = new String[taskAmount];



		for (int count = 0; count < taskAmount; count++) {
			System.out.print("enter a task: ");
			String myTask = input.nextLine();
			System.out.printf("adding %s to task...\n\n", myTask);
			tasks[count] = myTask;
		}

		for (String task : tasks) {
			System.out.println(task);
		}
	}
}