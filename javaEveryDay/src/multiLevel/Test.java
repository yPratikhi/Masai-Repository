package multiLevel;

public class Test {
public static void main(String[] args) {
	Apple ap = new Apple() ;
	System.out.println("CEO of Apple : "+ap.founder);
	System.out.println("Apple found in : "+ap.founder_date);
	
	System.out.println("************************************");
	visionPro vp = new visionPro();
	//non-Static
	vp.virtualReality();
	//static
	visionPro.vision();
	
	
}
}
