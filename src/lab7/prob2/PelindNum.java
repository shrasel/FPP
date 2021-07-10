package lab7.prob2;

public class PelindNum {

	public static int reverseNumber(int num, int tmpNum) {

		if (num == 0)
			return tmpNum;
		 
		tmpNum = (tmpNum * 10) + (num % 10);
		
		return reverseNumber(num/10, tmpNum);

	}

	public static void main(String[] s) {
		
		int input_num = 111101;

		if(input_num == reverseNumber(input_num,0)) 
			System.out.println("This is a Pelindrom Number");
		else
			System.out.println("This is not a Pelindrom Number");

	}

}
