package hw2;

public class demoParReturn {
	 public static void main(String[] args) {
	        
	        int multipliedResult = multiplyNumbers(3,3 );

	        
	        System.out.println("The product is: " + multipliedResult);
	    }

	  
	    public static int multiplyNumbers(int x, int y) {

	        int product = x * y;

	
	        return product;
	    }
}
