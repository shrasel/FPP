package lab3.prob0;

public class Main {

	public static void main(String[] args) {
		
		Customer[] customers = new Customer[3];
		
		Customer emp1 = new Customer("Shah", "Russell", "2333221ji"); 
		emp1.setBillingAddress(new Address("1011 n 3rd street", "Chicago", "Illinois", 55525));
		emp1.setShippingAddress(new Address("2001 ", "Chicago", "Illinois", 991000));
		
		Customer emp2 = new Customer("Parvin", "Boby", "2333221ji");
		emp2.setBillingAddress(new Address("1000 N 4th street", "Fairfield", "Iowa", 52557));
		emp2.setShippingAddress(new Address("1000 N 4th street ", "Fairfield", "Iowa", 52557));
		
		Customer emp3 = new Customer("John", "Doe", "2333221ji");
		emp3.setBillingAddress(new Address("1111 S 5th street", "Chicago", "Illinois", 12121));
		emp3.setShippingAddress( new Address("1111 S 5th street ", "Chicago", "Illinois", 52557));
		
		
		customers[0] = emp1;
		customers[1] = emp2;
		customers[2] = emp3;
		
		for(Customer cst:customers) {
			if(cst.getBillingAddress().getCity().equalsIgnoreCase("Chicago")){
				System.out.println(cst);
			}
		}
		
		

	}

}
