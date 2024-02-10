package ProgramHandling;

public class ArithmeticExceptionExample {
	 public static void main(String[] args) {
	        try {
	            int result = 10 / 0;
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
//	            System.out.println("ArithmeticException occurred: " + e.getMessage());
	        	e.printStackTrace();
//	            e.getMessage();
	        } finally {
	            System.out.println("Finally block executed.");
	        }
	    }
}
