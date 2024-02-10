package hw4;

public class divOverloading {
      public static void main(String[] args) {
		divOverloading ol = new divOverloading();
		
		System.out.println(ol.div(8,2));
		System.out.println(divOverloading.div(8.43f,2));
		System.out.println(ol.div(8.43253,2));
		System.out.println(ol.div(8.34f,2.43f));
		
		ol.div();
	}
      
      void div() {
    	  int a = 6;
    	  int b = 2;
    	  
    	  System.out.println(a/b);
      }
      
      public int div(int a ,int b) {
    	  return a/b;
      }
      public static float div(float a,int b) {
    	  return a/b;
      }
      
      double div(double a,int b) {
    	  return a/b;
      }
      
      float div(float a,float b) {
    	  return a/b;
      }
}
