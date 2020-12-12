package br.com.rogerio;

public class Franc extends Money {

	private String currency;

	public Franc(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public Money times(int multiplier) {
		return Money.franc(amount * multiplier);
	}
	
	@Override
	protected String currency() {
		return currency;
	}
}
