package lab3.prob1;

public class Main {

	public static void main(String[] args) {
		
		Employee emp = new Employee("John", "Doe",200000.00,2020, 12, 1);
		
		Account[] act = new Account[3];
		
		act[0] = new Account(emp, AccountType.CHECKING,300.00);
		act[1] = new Account(emp, AccountType.SAVINGS, 300.00);
		act[2] = new Account(emp, AccountType.RETIREMENT, 300.00);
		
		act[0].makeDeposit(140);
		act[1].makeDeposit(90);
		act[2].makeWithdrawal(308);
		
		System.out.println(emp);
		
		for(Account a: act) {
			System.out.println(a);
		}	
		
	}
}
