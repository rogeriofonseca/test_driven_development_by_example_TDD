package br.com.rogerio;

public class Money {

	protected String currency;

	protected int amount;
	
	Money(int amount, String currency){
		this.amount = amount;
		this.currency = currency;
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
		return amount == money.amount 
				&& currency().equals(money.currency());
	}
	
	Money times(int multipler) {
		return null;
	}
	
	protected String currency() {
		return currency;
	}
	
	@Override
	public String toString() {
		return amount + " " + currency;
	}
	public static Money dollar(int amount) {
		return new Dollar(amount, "USD");
	}

	public static Money franc(int amount) {
		return new Franc(amount, "CHF");
	}
}
