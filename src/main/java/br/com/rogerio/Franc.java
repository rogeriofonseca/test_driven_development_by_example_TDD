package br.com.rogerio;

public class Franc extends Money {

	public Franc(int amount, String currency) {
		super(amount, currency);
	}

	public Money times(int multiplier) {
		return Money.franc(amount * multiplier);
	}
	
	@Override
	protected String currency() {
		return currency;
	}
}
