package acrovia.se.ww.samples;

import static org.junit.Assert.*;

import mockit.Mock;
import mockit.MockUp;

import org.junit.Test;

public class BankTest {

	@Test
	public void testUpdateBalance() {
		new MockUp<Bank>() {

			@Mock
			public void $clinit() {
				Bank.updateBalance(500);
			}
		};

		assertEquals("The balance amount is 500", 500, Bank.balanceAmount);

	}

}
