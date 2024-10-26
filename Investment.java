import java.util.Scanner;

public class Investment {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		System.out.print("enter the investment amount: ");
		double investmentAmount = input.nextDouble();

		System.out.print("enter the monthly interest rate: ");
		double monthlyInterestRate = input.nextDouble();
		double monthlyInterest = monthlyInterestRate / 100;

		System.out.print("enter the number of years: ");
		int duration = input.nextInt();

		double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterest), duration);

		System.out.printf("the future investment amount is: %.2f", futureInvestmentValue);
	}
}