package creational.singleton.example;

import creational.singleton.ThreadSafeSingleton;

import java.util.*;

public class CurrencyConverter
{
	private static final long WAITING_SECONDS = 5000;
	private List<ExchangeRate> exchangeRates;
	private static CurrencyConverter instance;


	private CurrencyConverter() throws InterruptedException
	{
		loadExchangeRates();
	}

	private void loadExchangeRates() throws InterruptedException
	{
		Thread.sleep(WAITING_SECONDS);
		exchangeRates = new ArrayList<>();
		exchangeRates.add(new ExchangeRate("USD", "SAR", 3.75));
		exchangeRates.add(new ExchangeRate("USD", "EGP", 30.60));
		exchangeRates.add(new ExchangeRate("SAR", "EGP", 3.75));
	}

	public double convert(String baseCurrency, String targetCurrency, double amount)
	{
		double rate = 0;
		for (ExchangeRate exchangeRage : exchangeRates)
		{
			if (exchangeRage.getBaseCurrency().equalsIgnoreCase(baseCurrency) && exchangeRage.getTargetCurrency().equalsIgnoreCase(targetCurrency))
			{
				rate = exchangeRage.getRate();
			}
		}
		return amount * rate;
	}

	public static CurrencyConverter getInstance() throws InterruptedException
	{
		if (instance == null) {
			synchronized (CurrencyConverter.class) {
				if (instance == null)
					instance = new CurrencyConverter();
			}
		}
		return instance;
	}
}
