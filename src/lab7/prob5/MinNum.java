package lab7.prob5;

public class MinNum {

	/**
	 * origin non recursive function 
	 * @param arrayOfInts
	 * @return
	 */
	public static int min(int[] arrayOfInts) {
		
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
	
	/**
	 * recursive function 
	 * @param n
	 * @param length
	 * @return
	 */
	public static int getMin(int[] n, int length) {

		if (length == 1)
			return n[0];

		if (n[length - 1] < getMin(n, length - 1)) {
			return n[length - 1];
		} else
			return getMin(n, length - 1);

	}
	
	


	public static void main(String[] args) {

		int[] num = { 4, 1, -5, -10, 20, 25, 3, 3, -10, 40 };
		System.out.println("Minimum number in the array: "+getMin(num, num.length));
	}

}
