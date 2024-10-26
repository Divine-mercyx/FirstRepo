import java.util.Scanner;

public class GrowthRate {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int countOfYears = 1;
		System.out.print("enter the world population: ");
		double population = input.nextDouble();
		System.out.print("enter the annual world population growth: ");
		double annualRate = input.nextDouble();

		double stuff = getEstimatedGrowthRate(countOfYears, population, annualRate);
		System.out.print(stuff);
	}

	
		public static double getEstimatedGrowthRate(int countOfYears, double population, double annualRate) {
			while (countOfYears <= 5) {
				String duration = (countOfYears > 1) ? "years" : "year";
				double rate = annualRate / 100;
				double estimatedGrowthRate = population * (Math.pow((1 + rate), countOfYears));
				System.out.printf("the population growth rate for %d %s %.2f%n", countOfYears, duration, estimatedGrowthRate);
				countOfYears++;
				return estimatedGrowthRate;
			}

		}

}