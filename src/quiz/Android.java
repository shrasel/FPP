package quiz;

public class Android extends Phone {
	
	Android(String name, float price){
		this.name = name;
		this.basePrice = price; 
	}
	
	public float getCost() {
		return basePrice + 10;
	}

}
