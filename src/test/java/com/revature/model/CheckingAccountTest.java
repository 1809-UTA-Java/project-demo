package com.revature.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class CheckingAccountTest {
	
	Account testAccount;

	@Before
	public void setUp() throws Exception {
		testAccount = new CheckingAccount();
	}

	@Test
	public void testDeposit() {
		assertEquals(testAccount.deposit(50), true);
		assertEquals(testAccount.deposit(30), true);
		assertEquals(testAccount.deposit(50000), true);
		assertEquals(testAccount.deposit(89.99), true);
	}
	
	@Test
	public void testDepositWithNegative() {

		assertEquals(testAccount.deposit(-50), false);
	}
	
	@Test(expected = NullPointerException.class)
	public void testDepositNullAmt() {
		assertEquals(testAccount.deposit(0), true);
	}

	@Test
	public void testWithdrawal() {
		fail("Not yet implemented");
	}

	@Test
	public void testTransfer() {
		fail("Not yet implemented");
	}

	@Test
	public void testOpen() {
		fail("Not yet implemented");
	}

	@Test
	public void testClose() {
		fail("Not yet implemented");
	}

}
