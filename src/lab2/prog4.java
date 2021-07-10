package lab2;

public class prog4 {

	public static void main(String[] args) {

		String records = Data.records;	
		
		String[] rows =  records.split(":");
		
		for(int i = 0; i < rows.length; i++) {
			String[] dt = rows[i].split(",");
			System.out.println(dt[0]);
		}

	}

}
