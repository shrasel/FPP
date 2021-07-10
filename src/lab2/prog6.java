package lab2;

import java.util.Arrays;

public class prog6 {

	public static void main(String[] args) {
		
		String[] inputArr = {"horse", "horse", "dog", "cat", "horse","dog","horse","unu","cat"};
		
		int arrLn = 0;
		
		int al = inputArr.length;
		
		for(int i = 0; i<inputArr.length; i++) {
			for(int j = i+1; j <inputArr.length; j++  ) {
				if(inputArr[i].equals(inputArr[j])) {
					inputArr[j] = null;
				}
			}
			
			 if(inputArr[i]==null)
	            	arrLn++;
			
		}
		
		String narr[] = new String[al-arrLn];
		
		int indx = 0;
		
		for(String a: inputArr ) {
			if(a!=null)
				narr[indx++] = a;
		}
		
		String st = Arrays.toString(narr);
		System.out.println(st);

	}

}
