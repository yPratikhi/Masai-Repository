package Day1;

public class method {
      public static void main(String[] args) {
    	  add();
      }
      
      public static void add() {
    	  int a = 10;
    	  int b = 30;
    	  
    	  int result = a+b;
    	  System.out.println("a+b = "+result);
    	  
    	  if(a>b) {
    		  System.out.println("A is greter than B");
    	  }else {
    		  System.out.println("A is Smaller than B");
    	  }
      }
}
