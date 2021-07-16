package finalexampractice;

/**
 * Write a method that takes a List of Strings as input, finds all the strings
 * that contains the string 'le' then prints out the result. Assume that the
 * list will never be null.
 */
import java.util.*;
public class Prob2 {
	
	void contains(List<String> dataList) {
		for(String string : dataList) {
			if(string.contains("le")) {
			System.out.println(string);
			}
		}
	}
	
	
	private List<String> checkList(List<String> data) {
		data.removeIf(s -> s.contains("le"));
		return data;
	}
	
	
	public List<String> getLe(List<String> str){
		
		List<String> newList = new ArrayList<String>();
		
		for(String valList : str) {
			if(valList.contains("le"))
				newList.add(valList);
		}
		
		return newList;
	}
	
	
	public LinkedList<Integer> revList(LinkedList<Integer> intList){
		
		LinkedList<Integer> nList = new LinkedList<Integer>();
		
		ArrayList<String> aryList = new ArrayList<String>();
		
		
		for(Integer i : intList) {
			nList.addFirst(i);
		}
		return nList;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		List<String> lStrings = new LinkedList<>();
		
		lStrings.add("Rasele");
		
		lStrings.add("lease");
		lStrings.add("Apple");
		lStrings.add("Banana");
		lStrings.add("Rasele");
		
		Prob2 pbProb2 = new Prob2();
		System.out.println(pbProb2.getLe(lStrings));
	}

}
