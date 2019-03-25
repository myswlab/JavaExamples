package it.unibs.ing.fp.esercizi_lezione.bank;

public class BankAccount {

	private long balance;

	public BankAccount(long balance) {
		this.balance = balance;
	}

	public BankAccount() {
		this(0);
	}

	public long getBalance() {

		return balance;
	}

	public void deposit(long depositAmount) {
		balance += depositAmount;

	}

	public long withdraw(long withdrawAmount) {

		if (balance >= withdrawAmount) {
			balance -= withdrawAmount;
			return withdrawAmount;
		} else {
			long available = balance;
			balance = 0;
			return available;
		}

	}

}
