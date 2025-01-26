package utilitaries;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double dollarToReal (double amount, double dollarPrice) {
		double amountInReais = amount * dollarPrice;
		return amountInReais += amountInReais * IOF;
	}

}
