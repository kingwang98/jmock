package acrovia.se.ww.samples;

public class Bank {

	static int balanceAmount;

	// Static block begins
	static {
		updateBalance(100);
	}

	public static void updateBalance(float balance) {
		balanceAmount += balance;
	}
}
