package ProgramHandling;

public class StringIndexOutOfBoundsExceptionExample {

	  public static void main(String[] args) {
	        try {
	            String str = "hello";
	            char ch = str.charAt(10);
	            System.out.println("Character at index 10: " + ch);
	        } catch (StringIndexOutOfBoundsException e) {
//	            System.out.println("StringIndexOutOfBoundsException occurred: " + e.getMessage());
	        	e.printStackTrace();
	        } finally {
	            System.out.println("Finally block executed.");
	        }
	    }

}
