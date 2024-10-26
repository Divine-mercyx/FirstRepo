import java.util.Scanner;

public class Mortgage {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double addPrincipal = 0;
		double addAnnual = 0;
		int addYear = 0;
		double addCompoundInterest = 0;
		System.out.println("enter a number below -1 to quit");

		while (true) {

			System.out.print("enter the principal: ");
			double principal = input.nextDouble();

			if (principal <= -1) {
				System.out.print("you've exited the program");
				break;
			} 

			System.out.print("enter the annual interest: ");
			double annual = input.nextDouble();

			if (annual <= -1) {
				System.out.print("you've exited the program");
				break;

			}
			double annualRate = annual / 100;

			System.out.print("enter the years: ");
			double year = input.nextInt();

 			if (year <= -1) {
				System.out.print("you've exited the program");
				break;

			}

			double compoundInterest = principal * Math.pow((1 + annualRate), year);
			addCompoundInterest += compoundInterest;
			System.out.printf("the compound interest is: %.2f%n", compoundInterest);
			System.out.println();

			addPrincipal += principal;
			addAnnual += annualRate;
			addYear += year;

		}
		
		double CombinedCompoundInterest = addPrincipal * Math.pow((1 + addAnnual), addYear);
		System.out.printf("\nborrowed is: %.2f\ncombined annual interest: %.2f\ncombined years: %d\ncombined compound interest: %.2f", addPrincipal, addAnnual, addYear, addCompoundInterest);
		
	}
}