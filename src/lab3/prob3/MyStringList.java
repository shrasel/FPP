package lab3.prob3;

import java.util.Arrays;

public class MyStringList {
	
	private int size;
	private String[] strArray;
	
	public MyStringList(){
		size = 0;
		strArray = new String[2];
	}
	
	public void add(String s) {
		
		if(size == strArray.length)
			resize();
		
		strArray[size] = s;
		size++;
		
	}
	
	public String get(int i) {
		return strArray[i];
	}
	
	public boolean find(String s) {
		
		if(s == null) return false;
		
		for(String str:strArray) {
			if(str.equals(s))
				return true;
		}
		
		return false;
		
	}
	
	public boolean remove(String s) {
		
		
		for(int i = 0; i < strArray.length; i++) {
			if(strArray[i].equals(s)) {
				for(int j = i; j<size; j++) {
					strArray[j] = strArray[j+1]; 
				}
				size--;
				return true;
			}
		}
		
		return false;
	}
	
	public String toString() {
		
		return Arrays.toString(Arrays.copyOf(strArray, size));
		
	}
	
	public int size() {
		return size;
	}
	
	private void resize() {
		System.out.println("Resizing...");
		String [] tmpArray = new String[size * 2];
		
		System.arraycopy(strArray, 0, tmpArray, 0, strArray.length);
		strArray = tmpArray;
	}
	
	public static void main(String[] args) {
		MyStringList l = new MyStringList(); 
		l.add("Bob"); 
		System.out.println("The list of size  " + l.size() +" is "+ l);
		l.add("Susan");
		System.out.println("The list of size  " + l.size() +" is "+ l);
		l.add("Mark");
		System.out.println("The list of size  " + l.size() +" is "+ l);
		l.remove("Susan");
		System.out.println("The list of size: " + l.size() +" is "+ l);
	}

}
