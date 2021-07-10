package lab2;

public class prog8 {
	
	public static void main(String[] args) {
		
		
		int[] arry = {5,9,75,12,34};
		
		System.out.println("Minimum val:"+min(arry));
		
	}
	
	static int min(int[] arrayOfInts) {
		
		if(arrayOfInts.length<1) return 0;
		
		for (int i = 0; i < arrayOfInts.length; i++) {
	        for (int j = i + 1; j < arrayOfInts.length; j++) {
	            int tmp = 0;
	            if (arrayOfInts[i] > arrayOfInts[j]) {
	                tmp = arrayOfInts[i];
	                arrayOfInts[i] = arrayOfInts[j];
	                arrayOfInts[j] = tmp;
	            }
	        }
	    }
		
		return arrayOfInts[0];
	}

}
