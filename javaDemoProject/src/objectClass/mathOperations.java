package objectClass;

public class mathOperations {
	int a=5;
	int b=2;
	
//	non Static
    public void add() {
    	System.out.println(a+b);
    }
    
    public void sub() {
    	System.out.println(a-b);
    }
    
    //static
    public static void mul(int a ,int b) {
    	System.out.println(a * b);
    }
    
    public static void  div(int a ,int b) {
    	System.out.println(a / b);
    }
}
