package ProgramHandling;

public class ArrayIndexOutOfBoundsExceptionExample {
	   public static void main(String[] args) {
	        try {
	            int[] arr = {1, 2, 3};
	            int value = arr[5];
	            System.out.println("Value at index 5: " + value);
	        } catch (ArrayIndexOutOfBoundsException e) {
	        	e.printStackTrace();
	        } finally {
	            System.out.println("Finally block executed.");
	        }
	    }
}
