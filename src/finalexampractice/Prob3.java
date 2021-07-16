package finalexampractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Prob3 {
	
	void reverseString(List<String> data) {
		Collections.reverse(data);
		
	}
	

	public List<String> revList(List<String> sList){
		
		LinkedList<String> nList = new LinkedList<String>();
		
		for(String s: sList) {
			nList.addFirst(s);
		}
		
		return nList;
	}
	
	
	
	public static void main(String[] args) {
		List<String> lList = new ArrayList<String>();
		
		lList.add("Bijou");
		lList.add("Tabetha");
		lList.add("angel");
		lList.add("carrot");
		
		
		Prob3 rev = new Prob3();
	
		rev.reverseString(lList);
		System.out.println(lList);
		
	}

}
