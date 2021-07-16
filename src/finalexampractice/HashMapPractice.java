package finalexampractice;

import java.util.HashMap;

public class HashMapPractice {
	
	private HashMap<String, String> hmp;
	
	HashMapPractice(){
		hmp = new HashMap<String, String>();
	}
	
	public static HashMap<String, String> mergeHMap(HashMap<String, String> h1, HashMap<String, String> h2){
		HashMap<String, String> newHmp = new HashMap<String, String>();
		
		for(HashMap.Entry<String, String> e : h1.entrySet() ) {
			newHmp.put(e.getKey(), e.getValue());
		}
		
		for(HashMap.Entry<String, String> e1 : h2.entrySet() ) {
			newHmp.put(e1.getKey(), e1.getValue());
		}
		
		
		return newHmp;
	}

}
