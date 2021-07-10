package quiz;

public class IPhone extends Phone {
	
	IPhone(String name, float price) {
		this.name = name;
		this.basePrice = price;
	}
	
	public float getCost() {
		return basePrice;
	}

}
