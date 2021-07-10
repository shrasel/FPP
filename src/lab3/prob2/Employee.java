package lab3.prob2;

import java.time.LocalDate;

public class Employee {
	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private LocalDate hireDate;

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;

		// Replace these lines with LocalDate references
		// GregorianCalendar cal = new
		// GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
		// hireDate = cal.getTime();

		this.hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
	}

	public void createNewChecking(double startAmount) {
		checkingAcct = new Account(this, AccountType.CHECKING, startAmount);
	}

	public void createNewSavings(double startAmount) {
		savingsAcct = new Account(this, AccountType.SAVINGS, startAmount);
	}

	public void createNewRetirement(double startAmount) {
		retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);
	}

	public void deposit(AccountType acctType, double amt) {
		switch (acctType) {
			case CHECKING:
				checkingAcct.makeDeposit(amt);
				break;
			case SAVINGS:
				savingsAcct.makeDeposit(amt);
				break;
			case RETIREMENT:
				retirementAcct.makeDeposit(amt);
				break;
			default:
				return;
		}
	}

	public boolean withdraw(AccountType acctType, double amt) {
		boolean result = false;
		
		switch(acctType) {
		case CHECKING:
			result = checkingAcct.makeWithdrawal(amt);
			break;
		case SAVINGS:
			result = savingsAcct.makeWithdrawal(amt);
			break;
		case RETIREMENT:
			result = retirementAcct.makeWithdrawal(amt);
			break;
		default:
			result= false;
			break;
		}
		
		return result;
	}

	public String getFormattedAcctInfo() {
		StringBuilder acctInfo = new StringBuilder();
		acctInfo.append("ACCOUNT INFO FOR " + name + ":\n\n");
		if (checkingAcct != null)
			acctInfo.append(checkingAcct.toString());
		if (savingsAcct != null)
			acctInfo.append(savingsAcct.toString());
		if (retirementAcct != null)
			acctInfo.append(retirementAcct.toString());
		return acctInfo.toString();

	}
}