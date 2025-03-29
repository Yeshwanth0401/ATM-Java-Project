package ATM;

public class Account {

	private double checkingbalance = 0;
	private double savingbalance = 0;

	public double getCheckingBalance() {
		return checkingbalance;
	}

	public double getSavingsBalance() {
		return savingbalance;
	}

	public void depositChecking(double amount) {
		checkingbalance += amount;
	}

	public void withdrawChecking(double amount) {
		if (checkingbalance >= amount) {
			checkingbalance -= amount;
		} else {
			System.out.println("Balance cannot be Negative.");
		}
	}

	public void depositSaving(double amount) {
		savingbalance += amount;
	}

	public void withdrawSaving(double amount) {
		if (savingbalance >= amount) {
			savingbalance -= amount;
		} else {
			System.out.println("Balance cannot be Negative.");
		}
	}

}
