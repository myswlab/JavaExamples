package it.unibs.ing.fp.esercizi_lezione.bank;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankAccountTest {
	@Test
	public void defaultBalanceIsZero() throws Exception {
		assertEquals(0, new BankAccount().getBalance());
	}

	@Test
	public void defaultBalance() throws Exception {
		final long balance = 19;
		assertEquals(balance, new BankAccount(balance).getBalance());
	}

	@Test
	public void depositAugmentsBalance() throws Exception {
		final long initial = 19;
		final long depositAmount = 11;
		final BankAccount account = new BankAccount(initial);
		account.deposit(depositAmount);
		assertEquals((initial + depositAmount), account.getBalance());
	}

	@Test
	public void withdrawDecreasesBalance() throws Exception {
		final long initial = 19;
		final long withdrawAmount = 11;
		final BankAccount account = new BankAccount(initial);
		account.withdraw(withdrawAmount);
		assertEquals((initial - withdrawAmount), account.getBalance());
	}

	@Test
	public void withdrwaReturnsWithdrawedMoney() throws Exception {
		final long initial = 19;
		final long withdrawAmount = 11;
		final BankAccount account = new BankAccount(initial);
		assertEquals(withdrawAmount, account.withdraw(withdrawAmount));
	}

	@Test
	public void cantWithdrawWhenWithdrawAmountExceedsCurrentBalance()
			throws Exception {
		final long initial = 19;
		final long withdrawAmount = 25;
		final BankAccount account = new BankAccount(initial);
		assertEquals(initial, account.withdraw(withdrawAmount));
		assertEquals(0, account.getBalance());
	}
}
