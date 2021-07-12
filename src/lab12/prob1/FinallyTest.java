package lab12.prob1;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

class FinallyTest {
	public static void test1() throws Exception {
        try {
        	throw new Exception("first");
        }
        finally {
            System.out.println("finally 1!");
        }
    }

	public static void test2() {
        try {
        	throw new Exception("In test2");
        }
        catch (Exception e){
        	System.out.println(e.getMessage());
        }
        finally {
            System.out.println("finally 2!");
        }
    }
	public static void test3() throws IOException {
        try {
        	throw new Exception("In test3");
        }
        catch (Exception e){
        	System.out.println(e.getMessage());
        	throw new IOException("Throwing new IOException.");
        }
        finally {
            System.out.println("finally 3!");
        }
    }
	public static void test4() throws IOException {
        try {
        	throw new FileNotFoundException("In test4");
        }
        catch (IOException e){
        	System.out.println(e.getMessage());
        	throw new IOException("Throwing IOException test 4.");
        }
        catch (Exception e){
        	System.out.println(e.getMessage());
        	throw new IOException("Throwing new Exception test 4.");
        }        
        finally {
            System.out.println("finally 4!");
        }
    }	
	public static void main(String[] args){
        try{
//            test1();
            test2();
//            test3();
            test4();            
        }
        catch(Exception x){
            System.out.println(x.getMessage());
	   }
    }
}
