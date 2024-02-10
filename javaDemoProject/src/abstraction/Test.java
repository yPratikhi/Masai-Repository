package abstraction;

public class Test {
public static void main(String[] args) {
	//Sony.class  Object
	Sony so =new Sony();
	so.display();
	so.operatingSystem();
	so.size();
	
	
	System.out.println("*****************************************************");
	//LG.class Object
	LG tv = new LG();
    tv.display();
	tv.operatingSystem();
	tv.size();
}
}
