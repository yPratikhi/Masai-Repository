package ProgramHandling;

public class NumberFormatExceptionExample {
	 public static void main(String[] args) {
	        try {
	            String str = "abc";
	            int number = Integer.parseInt(str);
	            System.out.println("Number: " + number);
	        } catch (NumberFormatException e) {

	        	e.printStackTrace();
	        	
	        } finally {
	            System.out.println("Finally block executed.");
	        }
	    }
}
