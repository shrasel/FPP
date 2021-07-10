package lab7.prob2;

public class PelindStr {
	
	public static boolean isSrtingPel(String s) {
		if(s.length() == 0 || s.length() == 1)
			return true;
		
		if(s.charAt(0) == s.charAt(s.length()-1))
			return isSrtingPel(s.substring(1,s.length()-1));
		
		return false;
	}
	
	public static void main(String[] s) {
		String st = "cococc";
		
//		System.out.println(isSrtingPel(st));
		
		
		System.out.println(st.equals("coo"));
	}

}
