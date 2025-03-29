package ATM;

import java.io.IOException;
import java.util.Scanner;

public class OptionMenu extends Account {
	Scanner menuInput = new Scanner(System.in);
	Account account = new Account();
	/* Validate login information customer number and pin number */

	public void login() throws IOException {
		System.out.println("Enter Your Customer Number: ");
		int customerNumber = menuInput.nextInt();

		System.out.println("Enter Your Pin Number: ");
		String pin = menuInput.next();

		// For Simplicity, Using Fixed Values
		if (customerNumber == 984859 && pin.equals("0401")) {
			showMainMenu();
		} else {
			System.out.println("Invalid Credentails  ");
		}

	}

	public void showMainMenu() {

		int choice;
		do {

			System.out.println("Select the Account you want to access: ");
			System.out.println("Type 1 - Checking account");
			System.out.println("Type 2 - Savings account");
			System.out.println("Type 3 - Exit");
			System.out.println("Choice: ");
			choice = menuInput.nextInt();
			switch (choice) {
			case 1:
				checkingMenu();
				break;

			case 2:
				savingsMenu();
				break;

			case 3:
				System.out.println("Thank you for using ATM ,Bye!. Have a good day");
				break;

			default:
				System.out.println("\n" + "Invalid Choice." + "\n");

			}

		} while (choice != 3);
	}

	public void checkingMenu() {

		int choice;
		do {

			System.out.println("\n Checking Account ");
			System.out.println("Type 1 - View Balance");
			System.out.println("Type 2 - Withdraw Funds");
			System.out.println("Type 3 - Deposit Funds");
			System.out.println("Type 4 - Exit");
			System.out.println("Choice: ");
			choice = menuInput.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Checking Account Balance: $" + account.getCheckingBalance());
				break;

			case 2:
				System.out.println("Amount you wamt to withdraw from Checking Account: ");
				account.withdrawChecking(menuInput.nextDouble());
				break;

			case 3:
				System.out.println("Amount you wamt to deposit to Checking Account: ");
				account.depositChecking(menuInput.nextDouble());
				break;
			case 4:
				break;

			default:
				System.out.println("\n" + "Invalid Choice." + "\n");

			}

		} while (choice != 4);
	}

	public void savingsMenu() {
		int choice;
		do {

			System.out.println("\n Saving Account ");
			System.out.println("Type 1 - View Balance");
			System.out.println("Type 2 - Withdraw Funds");
			System.out.println("Type 3 - Deposit Funds");
			System.out.println("Type 4 - Exit");
			System.out.println("Choice: ");
			choice = menuInput.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Savings Account Balance: $" + account.getSavingsBalance());
				break;

			case 2:
				System.out.println("Amount you wamt to withdraw from Saving Account: ");
				account.withdrawSaving(menuInput.nextDouble());
				break;

			case 3:
				System.out.println("Amount you wamt to deposit to Saving Account: ");
				account.depositSaving(menuInput.nextDouble());
				break;
			case 4:
				break;

			default:
				System.out.println("\n" + "Invalid Choice." + "\n");

			}

		} while (choice != 4);
	}
}
