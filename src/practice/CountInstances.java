package practice;

public class CountInstances {

	private static int count;
	
	CountInstances(){
		++count;
	}
	
	public static int getCount() {
		return count;
	}
	
	public static void main(String[] args) {
		
		for(int i=0; i<10;i++) {
			new CountInstances();
		}
		
		System.out.println("Number of Instances created: "+ getCount());
		

	}

}
