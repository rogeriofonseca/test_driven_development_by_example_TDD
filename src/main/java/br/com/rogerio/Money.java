package br.com.rogerio;

public class Money implements Expression {

	protected String currency;

	protected int amount;

	protected String currency() {
		return currency;
	}

	Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public static Money dollar(int amount) {
		return new Money(amount, "USD");
	}

	public static Money franc(int amount) {
		return new Money(amount, "CHF");
	}

	public Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}

	public Expression plus(Money addend) {
		return new Sum(this, addend);
	}

	public Money reduce(String to) {
		int rate = (currency.equals("CHF") && to.equals("USD")) 
				? 2 : 1;
		return new Money(amount / rate, to);
	}

	@Override
	public Money reduce(Bank bank, String to) {
		int rate = bank.rate(currency, to);
		return new Money(amount / rate, to);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		Money money = (Money) obj;
		return amount == money.amount && currency().equals(money.currency());
	}

	@Override
	public String toString() {
		return amount + " " + currency;
	}
}
