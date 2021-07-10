package lab2;

public class quiz1 {
	
	public static void main(String[] arg) {
		
//		String s = "Hello";
		
//		Class cl = s.getClass();
		
//		System.out.println(cl.toString());
		
		String st = "One step at ass time";
		
		
		System.out.println("Number of char either s or t or g: "+ numberOf(st));
	}
	
	static int numberOf(String strToCheck) {
		
		int count=0;
		
		for(int i=0; i<strToCheck.length();i++) {
			if(strToCheck.charAt(i)=='s' || strToCheck.charAt(i)=='t' || strToCheck.charAt(i)=='g') {
				count++;
			}
		}
		
		return  count;
	}

}
