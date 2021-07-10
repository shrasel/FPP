package lab7.prob4;

public class RecCharCount {

	public static int count_e(String str) {
		if(str.length()==0)
			return 0;
		else if(str.charAt(0)=='e')
			return 1+ count_e(str.substring(1));
		else
			return count_e(str.substring(1));
	}
	
	public static int count_ch(String str, char ch) {
		if(str.length()==0)
			return 0;
		else if(str.charAt(0)==ch)
			return 1+ count_ch(str.substring(1),ch);
		else
			return count_ch(str.substring(1),ch);
	}
	
	public static void main(String[] s) {
		
		String st1 = "account it coutable to court";
		System.out.println("Count 'e' using count_e() function: "+count_e(st1));
		
		
		
		String st2 = "account it coutable to court";
		char  ch = 'o';
		System.out.println("Count '"+ch+"' using count_ch(): " + count_ch(st2, ch));
	}

}
