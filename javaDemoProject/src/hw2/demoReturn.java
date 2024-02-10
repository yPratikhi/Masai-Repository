package hw2;

public class demoReturn {
	  public static void main(String[] args) {
	       
	        int result = addNumbers();

	  
	        System.out.println("The sum is: " + result);
	    }

	   
	    public static int addNumbers() {
	        int a = 5;
	        int b = 7;
	        int sum = a + b;

	      
	        return sum;
	    }
}
