package hybride1;



public class Instagram extends Facebook{
	//Static method
		 public static void InstagramPro() {
	   	  System.err.println("This is Instagram.");
	     }
		 //non-static
		 public void insta() {
			 System.out.println("Non Static from the Insta");
		 } 
		 
	     public static void main(String[] args) {
			//Creating the Object of Meta 
	    	 Meta  me = new Meta();
			
	    	 //fetching from the Meta.class 
			System.out.println(me.emp_count);
			System.out.println(me.share);	
			
		  //From the Facbook.class
			Facebook fc = new Facebook();
			
			fc.fac();
			
		}
}
