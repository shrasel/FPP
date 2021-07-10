package quiz;

public class Main {

	public static void main(String[] args) {
		Phone[] ph = new Phone[2];
		
		ph[0] = new IPhone("Iphone 8S", 800.00f);
		ph[1] = new Android("Samsung Galaxy", 200.00f);
		
		Main m = new Main();
		m.listBudgetPhones(ph);
		
	
	}
	
	public void listBudgetPhones(Phone[] phn) {
		for(Phone p:phn) {
			if(p.getCost()<500.0) {
				System.out.println(p.name+","+p.basePrice);
			}
			
		}
	}

}
