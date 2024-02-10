package objectClass;

public class calculateEach {
public static void main(String[] args) {
	
	mathOperations ma = new mathOperations();
	
	System.out.println("Value of A : "+ma.a);
	System.out.println("Value of B : "+ma.b);
	
	ma.add();
	ma.sub();
	
//	with parameters
	mathOperations.mul(2,3);
	mathOperations.div(6,3);
}
}
