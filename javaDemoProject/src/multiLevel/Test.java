package multiLevel;

public class Test {
public static void main(String[] args) {
	VisionPro vp = new VisionPro();
	
	//Accessing the apple class method and variable
	vp.apple1();
	System.out.println(vp.founder);
	System.out.println(vp.founder_date);
	
	System.out.println("Assccesing Static member From another Class");
	VisionPro.virtualreality();//VisonPro
	VisionPro.operating_system(); //Apple is Extends to visionPro 
	VisionPro.laptop();
}
}
