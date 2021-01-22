package br.com.rogerio;

interface Expression {
Money reduce(String to);
Money reduce(Bank bank, String to);
}
