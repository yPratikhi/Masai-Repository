package hw4;

public class modOverloading  {
	 public static void main(String[] args) {
		 modOverloading  ol = new modOverloading ();
			
			System.out.println(ol.mod(8,2));
			System.out.println(modOverloading .mod(8.43f,2));
			System.out.println(ol.mod(8.43253,2));
			System.out.println(ol.mod(8.34f,2.43f));
			
			ol.mod();
		}
	      
	      void mod() {
	    	  int a = 6;
	    	  int b = 2;
	    	  
	    	  System.out.println(a%b);
	      }
	      
	      public int mod(int a ,int b) {
	    	  return a%b;
	      }
	      public static float mod(float a,int b) {
	    	  return a%b;
	      }
	      
	      double mod(double a,int b) {
	    	  return a%b;
	      }
	      
	      float mod(float a,float b) {
	    	  return a%b;
	      }
}
