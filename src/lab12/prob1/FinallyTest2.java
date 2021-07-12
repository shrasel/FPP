package lab12.prob1; // final practice

import java.io.FileNotFoundException;
import java.io.IOException;

class FinallyTest2 {
	public static void testX() throws IOException {
		try {
			throw new FileNotFoundException("In test X");
		} catch (IOException e) {
			throw new IOException("Throwing IOException X.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new IOException("Throwing new Exception test X.");
		}
	}

	public static void testY() throws Exception {
		try {
			throw new Exception("In testY");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new Exception("Throwing Exception again.");
		} finally {
			System.out.println("Any message can be done Y!");
		}
	}

	public static void testZ() throws Exception {
		try {
			throw new Exception("ZZZZZZ");
		} finally {
			System.out.println("finally Z!");
		}
	}

	public static void testQ() {
		try {
			throw new Exception("testQ");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("fin Q!");
		}
	}

	public static void main(String[] args) {
		try {
//			testX();
//			testY();
//			testZ();
			testQ();
		} catch (Exception x) {
			System.out.println(x.getMessage());
		}
	}
}
