package br.com.rogerio;

interface Expression {
Money reduce(Bank bank, String to);
Expression plus(Expression addend);
Expression times(int multipler);
}
