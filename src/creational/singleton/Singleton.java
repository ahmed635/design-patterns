package creational.singleton;

import creational.singleton.example.*;

import java.util.Scanner;

public class Singleton {
	private static final Scanner scanner = new Scanner(System.in);
	private static final StringBuilder output = new StringBuilder();
	public static void main(String[] args) throws InterruptedException
	{

		while (true){
			System.out.println("Enter base currency: ");
			String baseCurrency = scanner.nextLine();
			System.out.println("Enter target currency: ");
			String targetCurrency = scanner.nextLine();
			System.out.println("Enter amount: ");
			double amount = scanner.nextDouble();
			scanner.nextLine();

			double changedAmount = CurrencyConverter.getInstance().convert(baseCurrency, targetCurrency, amount);
			output.append(amount).append(" ").append(baseCurrency).append(" = ").append(changedAmount).append(" ").append(targetCurrency);
			System.out.println(output);
			System.out.println("------------------------------------");
		}
	}
}
