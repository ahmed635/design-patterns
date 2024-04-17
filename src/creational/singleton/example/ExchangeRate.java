package creational.singleton.example;

public class ExchangeRate
{
	private String baseCurrency;
	private String targetCurrency;
	private double rate;

	public ExchangeRate(String baseCurrency, String targetCurrency, double rate)
	{
		this.baseCurrency = baseCurrency;
		this.targetCurrency = targetCurrency;
		this.rate = rate;
	}

	public String getBaseCurrency()
	{
		return baseCurrency;
	}

	public String getTargetCurrency()
	{
		return targetCurrency;
	}

	public double getRate()
	{
		return rate;
	}
}
